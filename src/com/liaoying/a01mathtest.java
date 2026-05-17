package com.liaoying;

public class a01mathtest {
    public static void main(String[] args) {
        //1、不能创建Math对象
        //Math ma=new Math();

        //获取绝对值   abs
        System.out.println(Math.abs(-7));
        System.out.println(Math.abs(-1.2));
        System.out.println(Math.abs(3.66));
        System.out.println(Math.abs((double) -7/3));

        //向上取整ceil
        System.out.println(Math.ceil(-2.3));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(4));

        //向下取整 floor
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(-2.8));

        //四舍五入 round
        System.out.println(Math.round(9.4));
        System.out.println(Math.round(9.5));
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(-1.51));
        System.out.println(Math.round(-1.50));
        System.out.println(Math.round(-1.11));

        //最大值 max
        System.out.println(Math.max(-1.4,3));
        System.out.println(Math.max(5,3));

        //返回a的b次幂 pow
        System.out.println(Math.pow(4,2));
        System.out.println(Math.pow(4,0));
        System.out.println(Math.pow(1,2));
        System.out.println(Math.pow(2.5,2));

        //返回double随机值 random
        System.out.println(Math.random());

    }
}
