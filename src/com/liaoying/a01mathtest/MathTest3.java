package com.liaoying.a01mathtest;

import java.util.Scanner;

public class MathTest3 {
    public static void main(String[] args) {
        //自幂数：一个n位自然数等于自身各个数位上数字的n次幂之和
        //例如：三位数：1^3+5^3+3^3=153           四位数：1^4+6^4+3^4+4^4=1634
        //键盘录入一个整数判断是否为自幂数


        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long Start=System.currentTimeMillis();
        bbb(num);
        long end=System.currentTimeMillis();
        System.out.println(end-Start);

    }

    public static void bbb(int num){
        int num1=num;
        double sum=0;

        int len=String.valueOf(num).length();//将num转为字符串获取位数，也可以用num+""转为字符串

        while(num1!=0){
            int lastnum=num1%10;
            System.out.println(lastnum);
            sum=sum+Math.pow(lastnum,len);
            num1=num1/10;
        }
        System.out.println(sum);
        if(sum==num){
            System.out.println(num+"是自幂数");
            return;
        }else{
            System.out.println(num+"不是自幂数");
        }

    }
}
