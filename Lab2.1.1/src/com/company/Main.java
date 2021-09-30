package com.company;

import java.util.Scanner;

public class Main {

    public static void task3(int a, int b){
        if(a<b){
            System.out.print(Integer.toString(a)+" ");
            task3(a+1,b);
        }else if(a>b){
            System.out.print(Integer.toString(b)+" ");



            task3(a,b-1);
        }else {
            System.out.println(a);
            return;
        }
    }

    public static int task5(int N){
        return N>0 ? N%10 + task5(N/10): 0;
    }

    public static void task14(int N){
        if(N<=0) return;
        task14(N/10);
        System.out.println(N%10);
    }


    public static void main(String[] args) {
        task3(10,25);
        System.out.println(task5(24665));
        task14(1234);
    }
}
