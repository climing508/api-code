package com.liaoying.a04integertest;

public class IntegerTest1 {
    public static void main(String[] args) {
        //1、构造方法
        Integer a=new Integer(10);
        Integer b=new Integer("20");
        System.out.println(a);
        System.out.println(b);

        //2、静态方法
        Integer i = Integer.valueOf(200);
        Integer i2 = Integer.valueOf("300");
        System.out.println(i);
        System.out.println(i2);

        //直接赋值
        Integer x=400;
        System.out.println(x);
    }
}
