/**
 *    Copyright 2009-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.autoconstructor;

import org.apache.ibatis.annotations.AutomapConstructor;

public class AnnotatedSubject {
  /**
   *id
   **/
  private final int id;
  /**
   *姓名
   **/
  private final String name;
  /**
   *年龄
   **/
  private final int age;
  /**
   *身高
   **/
  private final int height;
  /**
   *体重
   **/
  private final int weight;

  public AnnotatedSubject(final int id, final String name, final int age, final int height, final int weight) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @AutomapConstructor
  public AnnotatedSubject(final int id, final String name, final int age, final Integer height, final Integer weight) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.height = height == null ? 0 : height;
    this.weight = weight == null ? 0 : weight;
  }
}
