package com.st.problemSolving;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringRepeated {

    public static void main(String[]args){
        countDuplicatedString("seeeli");

    }
    public static  void countDuplicatedString(String str){
        char[]charcters=str.toCharArray();
        Map<Character,Integer> charMap=new HashMap<>();
        for(Character c:charcters){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }else{
                charMap.put(c,1);
            }
        }
        Set<Map.Entry<Character,Integer>>entrySet=charMap.entrySet();
        System.out.println("List of Duplicated Character in String "+ str);
        for(Map.Entry<Character,Integer> entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " = "+entry.getValue());
            }
        }
    }
}
