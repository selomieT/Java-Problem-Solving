package com.st.problemSolving;

public class Finonacci {

    public static void main(String[] args){
        System.out.println("this is fibonacci serious 1,,1,2,3,5,8,13....");
        System.out.println("is the number 1 fibonacci "+isFibonacci(1));
        System.out.println("is the number 4 fibonacci "+isFibonacci(4));
        System.out.println("is the number 13 fibonacci "+isFibonacci(13));
    }
    public static boolean isFibonacci(int n){
        if(n==0||n==1)return true;
        int fib1=1;
        int fib2=1;
        int fibo=0;
        while(fibo<n){
            fibo=fib1+fib2;
            fib1=fib2;
            fib2=fibo;
        }
        if(fibo==n)return true;
        return false;
    }
}
