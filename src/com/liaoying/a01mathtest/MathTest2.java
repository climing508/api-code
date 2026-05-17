package com.liaoying.a01mathtest;

import java.util.Scanner;

public class MathTest2 {
    public static void main(String[] args) {
        //判断一个数是否为质数，传统遍历方法耗时太久
        //9->1 9,3 3         18->1 18,2 9,3 6      28->1 28,2 14,4 7      225->1 225,5 45,9 25,3 75
        //可整除的数一半在平方根前，一半在平方根后
        //遍历到平方根的位置即可
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        aa(num);

    }
    public static void aa(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num%i==0&&i!=num){
                System.out.println(i);
                System.out.println(num+"不是质数");
                return;
            }
        }
        System.out.println(num+"是质数");
    }
}
