package com.liaoying.a02systemtest;

public class SystemTest1 {
    public static void main(String[] args) {
        //1、exist 终止当前运行的虚拟机
        //0：正常   非0：异常终止
        /*System.out.println("111111");
        System.exit(0);
        System.out.println("222222");*/

        //2、currentTimeMillis返回当前毫秒值
        //从1970年1月1日 08:00:00~2025年x月x日xx:xx:xx
        //可用于计算程序运行时间
        /*long time=System.currentTimeMillis();
        System.out.println(time);*/

        //3、arraycopy
        int arr1[]= {1,2,3,4,5,6,7,8,9};
        int arr2[]=new int[10];
        System.arraycopy(arr1,3,arr2,5,4);
        for (int i=0;i<10;i++) {
            System.out.print(arr2[i]+" ");
        }

    }

}
