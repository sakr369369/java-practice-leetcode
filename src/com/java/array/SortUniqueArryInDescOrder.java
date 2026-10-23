package com.java.array;

import java.util.Arrays;
import java.util.Comparator;

public class SortUniqueArryInDescOrder {
    public static void main(String[] args) {
        int[] arr= {1,6,4,8,3,5};

        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out ::print);
        System.out.println(" ");
        Arrays.stream(arr).boxed().sorted().forEach(System.out ::print);
    }
}
