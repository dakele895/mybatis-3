package org.apache.ibatis.cglib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Test
 *
 * @author dkl
 * 2019/8/9
 **/
public class Test {


  public static void main(String[] args) {
    CgLib cgLib=new CgLib();
    ReflectServiceImpl proxy =(ReflectServiceImpl) cgLib.getProxy(ReflectServiceImpl.class);

    proxy.sayHello("lele");
    Map<String,List<String>> map=new HashMap<>();
    List<String> list=new ArrayList<String>();
    list.add("lele");
    list.add("lele2");
    list.add("lele3");
    map.put("lele",list);

    List<String> list1 = map.computeIfAbsent("lele",k -> new ArrayList<>());

    System.out.println(list1.toString());






  }
}
