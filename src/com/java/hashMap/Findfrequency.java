package com.java.hashMap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Findfrequency {

    public static void main(String[] args){
        int[] arr = {10,20, 40, 20, 30 , 40, 60};
        getDuplicateWithotstream(arr);
        getDuplicateWithstream(arr);

        getFreqWithstream(arr);
        getFreqWithoutStream(arr);


    }

    public static void getDuplicateWithotstream(int[] arr){
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer>  duplicateSet = new HashSet<>();

        for(int num : arr){
            if( !uniqueSet.add(num)){
                duplicateSet.add(num);
            }
        }

        System.out.println("Unique and duplicate getFreqWithotstream ---begin");
        System.out.println(uniqueSet);
        System.out.println(duplicateSet);

        System.out.println("Unique and duplicate getFreqWithotstream  ----End");
    }

    public static void getDuplicateWithstream(int[] arr){
        Set<Integer> seen = new HashSet<>();

       Set<Integer>   duplicate = Arrays.stream(arr).boxed().filter( n -> !seen.add(n) ).collect(Collectors.toSet());
        System.out.println("----getFreqWithstream---");
        System.out.println(seen);
        System.out.println(duplicate);

    }

    public static void getFreqWithoutStream(int[] arr){

        Map<Integer, Integer> mapResult = new LinkedHashMap<>();

        for (int n : arr) {
            mapResult.merge(n, 1, Integer::sum);
        }

        mapResult.forEach((k, v) ->
                System.out.println(k + " === " + v)
        );
    }

    public static void getFreqWithstream(int[] arr){
        System.out.println("-----getFreqWithstream----");
        Map<Integer, Long>  map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        map.forEach((k, v) -> {
            System.out.println(k +" = "+v);
        });
    }

}
