package com.st.problemSolving;

public class Factorial {

    public static void main(String[]args){
        System.out.println("factorial 3=3*2*1 ==>6");
        System.out.println("factorial  of 3 using recursion "+factorilalRecursion(3));
        System.out.print("factorial of 3 using while loop "+factorial(3));

    }
    public static int factorilalRecursion(int num){
            if(num==0)return 1;
           return num* factorilalRecursion(num=num-1);

    }
    public static int factorial(int num){
        int factorial=1;
        while(num!=0){
            factorial*=num;
            num--;
        }
        return factorial;
    }
}
