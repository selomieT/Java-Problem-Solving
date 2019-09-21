package com.st.problemSolving;

public class DeadLock {
    public static void main(String[]args){

    }
    public void method1(){
         synchronized (String.class){
                System.out.println("aquire lock on String class ");
                synchronized (Integer.class){
                    System.out.println("aquire lock on Integer class ");
                }
        }
    }
    public void method2(){
        synchronized(Integer.class){
            System.out.println("aquire lock on Integer class");
            synchronized (String.class){
                System.out.println("aquire lock on String class ");

            }
        }
    }

    //to avoid deadLock

   // Now there would not be any deadlock because both methods are accessing lock on Integer and String class
    // literal in the same order


    public void method3(){
        synchronized (Integer.class){
            System.out.println("aquire lock on String class ");
            synchronized (String.class){
                System.out.println("aquire lock on Integer class ");
            }
        }
    }
    public void method4(){
        synchronized(Integer.class){
            System.out.println("aquire lock on Integer class");
            synchronized (String.class){
                System.out.println("aquire lock on String class ");

            }
        }
    }


}
