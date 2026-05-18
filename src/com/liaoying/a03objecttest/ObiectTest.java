package com.liaoying.a03objecttest;

public class ObiectTest {
    public static void main(String[] args) {
        //1、创建对象
        Student s=new Student(21,"xiaoming");
        String str = s.toString();
        //Object里的toString方法默认返回内存地址
        //父类方法无法满足子类需求，需要进行方法重写
        System.out.println(str);//com.liaoying.a03objecttest.Student@23fc625e
        System.out.println(s);
        /*
        Object中的源码：
        返回对象的内存地址
        public String toString() {
            //getClass()：调用者的字节码文件
            //getName()：这个字节码文件的名字
            //@：间隔符号
            //hashCode()：对象的哈希值（获取对象的内存地址）
            //Integer：类名
            //toHexString：把内存地址变成16进制的表现形式
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }*/


        Student s1=new Student(66,"wangwu");
        Student s2=new Student(66,"wangwu");
        boolean e = s1.equals(s2);
        System.out.println(e);
    }
}
