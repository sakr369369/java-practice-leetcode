package com.java.array;

import java.util.Arrays;

public class ArrayThershold {
    public static void main(String[] args) {
        int[] inputArray = {1, 7, 5, 3, 2, 6};
        int threshold = 5;

        int[] outputArray = partition(inputArray, threshold);

        System.out.println("Input : " + Arrays.toString(inputArray));
        System.out.println("Output: " + Arrays.toString(outputArray));
    }

 public static int[] partition(int[] inputArray, int threshold){
        int[] outputArray = new int[inputArray.length];
     int index = 0;
        for(int value : inputArray){
            if(value < threshold){
                outputArray[index++] = value;
            }
        }

     for(int value : inputArray){
         if(value >= threshold){
             outputArray[index++] = value;
         }
     }
     return  outputArray;
 }
}
