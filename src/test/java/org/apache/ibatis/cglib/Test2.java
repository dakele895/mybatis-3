package org.apache.ibatis.cglib;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Test2
 *
 * @author dkl
 * 2019/8/9
 **/
public class Test2 {


  public static void main(String[] args) {
    List<String> list=new ArrayList<String>();
    list.add("lele");
    list.add("lele2");
    list.add("lele3");
    Class<? extends List> aClass = list.getClass();
    Field[] fields = aClass.getFields();
    Method[] method = aClass.getMethods();
    for (int i=0;i<method.length;i++){
      String name = method[i].getName();
      //System.err.println(name);
      if (name.equals("iterator")){
        Object invoke=null;
        try {
           invoke = method[i].invoke(aClass);
        } catch (IllegalAccessException e) {
          e.printStackTrace();
        } catch (InvocationTargetException e) {
          e.printStackTrace();
        }
        Class<?> returnType = method[i].getReturnType();
        Method[] methods = returnType.getMethods();
        for (int j=0;j<methods.length;j++){
          String names = methods[j].getName();

        }

      }


    }
  }
    }
