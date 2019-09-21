package com.st.problemSolving;

public class Palindrome {
    public static  void main(String[]args){
        System.out.println("if string is Bob and when we reverse it we will get Bob");
        System.out.println("is Bob palindrom "+isPalindrome("Bob"));
        System.out.println("is Wow palindrom "+isPalindrome("Wow"));
        System.out.println("is Seli palindrom "+isPalindrome("seli"));

        System.out.println("is number 232 palindrom "+numberPalindrom(232));

        System.out.println("is number 400 palindrom "+numberPalindrom(400));

        System.out.println("is number 444 palindrom "+numberPalindrom(444));
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

    public static boolean numberPalindrom(int n){
        int palindrom=n;
        int reverse=0;
        while(palindrom!=0){
            reverse=reverse*10+palindrom%10;
            palindrom=palindrom/10;
        }
        if(reverse==n)return true;
        return false;
    }
}
