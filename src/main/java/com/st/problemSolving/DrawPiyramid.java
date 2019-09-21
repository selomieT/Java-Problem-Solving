package com.st.problemSolving;

public class DrawPiyramid {
    public static void main(String[]args){
        drawPiyramid();
        PiyramidNumber();
    }
    public static void drawPiyramid(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void PiyramidNumber(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }

}
