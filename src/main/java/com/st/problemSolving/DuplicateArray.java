package com.st.problemSolving;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray {

    public static  void main(String[]args){
        List<Integer> prime=new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        prime.add(5);
        prime.add(7);

        Set<Integer> primeNoDuplicate=new LinkedHashSet<>(prime);
        System.out.println("prime number with duplicate "+prime);
        prime.clear();;
        prime.addAll(primeNoDuplicate);
        System.out.println("list of prime number without Duplicates "+prime);

      
    }

}
