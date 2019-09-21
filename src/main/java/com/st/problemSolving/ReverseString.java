package com.st.problemSolving;

public class ReverseString {


    public static void main(String[]args){
        System.out.println("String before reversed : seli "+"after reversed : "+reverseString1("seli"));
        System.out.println("String before reversed : seli "+"after reversed : "+reverseString2("seli"));
    }

    public static String reverseString1(String str){
        if(str.length()==1||str.isEmpty()||str==null){
            return str;
        }
        return reverseString1(str.substring(1))+str.charAt(0);

    }
    public static String reverseString2(String str){
        StringBuilder str1=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            str1.append(str.charAt(i));
        }
        return str1.toString();

    }
}
