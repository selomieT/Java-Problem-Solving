package com.st.problemSolving;

public class ArmstrongNumber {
    public static void main(String[]args){

        System.out.print("each digit cube sum must give the numver 153=1^3+5^3+3^3");
        System.out.println("is the number  153 armstrongNumber "+isArmstrongNumber(153));

    }
    public static boolean isArmstrongNumber(int num){
        int armstrongNum=num;
        int cubeSum=0;
        while(armstrongNum!=0){
            int cube=armstrongNum%10;
            cubeSum+=cube*cube*cube;
            armstrongNum=armstrongNum/10;
        }
        if(cubeSum==num)return true;
        return false;
    }
}
