package org.apache.ibatis.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CgLib
 *
 * @author dkl
 * 2019/8/9
 **/
public class CgLib implements MethodInterceptor {



  public  Object getProxy(Class cls){
    //CGLIB enhancer 增强类对象
    Enhancer enhancer=new Enhancer();
    //设置增强类
    enhancer.setSuperclass(cls);
    //定义代理逻辑对象为当前对象，要求当前对象实现MethodInterceptor方法
    enhancer.setCallback(this);
    //生成并返回代理对象
    return  enhancer.create();


  }



  @Override
  public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

    System.err.println("调用真实对象前");
    //反射调用真实的对象
    Object result = methodProxy.invokeSuper(o, objects);

    System.err.println("调用真实的对象后");
    return result;
  }
}
