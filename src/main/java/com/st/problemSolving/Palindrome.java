package com.st.problemSolving;

public class Palindrome {
    public static  void main(String[]args){
        System.out.println("if string is Bob and when we reverse it we will get Bob");
        System.out.println("is Bob palindrom "+isPalindrome("Bob"));
        System.out.println("is Wow palindrom "+isPalindrome("Wow"));
        System.out.println("is Seli palindrom "+isPalindrome("seli"));
    }

    public static boolean isPalindrome(String str){
        String reverse=reverseString(str);
        if(str.equalsIgnoreCase(reverse))return true;
        return false;

    }
    public static String reverseString(String input){
        if(input==null ||input.length()==0)return input;
        return reverseString(input.substring(1))+input.charAt(0);
    }
}
