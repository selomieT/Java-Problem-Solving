package com.st.problemSolving;

public class PrimeNumber {
    public static void main(String[]args){
        System.out.println("chech the number 2 is prime "+isPrime(2));
        System.out.println("chech the number 4 is prime "+isPrime(4));
        System.out.println("chech the number 9 is prime "+isPrime(9));

    }
    public static  boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
