package com.st.problemSolving;

public class ReverseString {


    public static void main(String[]args){
        System.out.println("String before reversed : seli "+"after reversed : "+reverseString1("seli"));
    }

    public static String reverseString1(String str){
        if(str.length()==1||str.isEmpty()||str==null){
            return str;
        }
        return reverseString1(str.substring(1))+str.charAt(0);

    }
}
