package com.liaoying.a03objecttest;

import java.util.Objects;

public class Student {
    private int age;
    private String name;

    public Student() {
    }
    public Student(int age,String name) {
        this.age = age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /*Student s1=new Student(66,"wangwu");
        Student s2=new Student(66,"wangwu");
        boolean e = s1.equals(s2);
         this:调用者
         o：参数 s2
    */

    @Override
    public boolean equals(Object o) {
        //比较s1和s2是否属于同一个类型
        if (o == null || this.getClass() != o.getClass()) return false;
        //执行到这里表示传递过来的参数不是null，而且两者类型一致
        Student student = (Student) o;
        //比较两个对象的属性值是否相等
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
