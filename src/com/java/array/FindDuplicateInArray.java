package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5};
        duplicate(arr);
    }
    public  static  void duplicate(int[] arr){
        Set<Integer>  seen = new HashSet<>();
        Set<Integer>  duplicate = new HashSet<>();

        for(int num : arr){
            if( !seen.add(num)){
                duplicate.add(num);
            }
        }

        duplicate.forEach( c -> System.out.print(c + " "));
    }
}
