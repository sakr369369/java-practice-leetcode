package com.java.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));



        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Collections.reverse(Arrays.asList(arr2));
        System.out.println(Arrays.toString(arr2));


    }
}
