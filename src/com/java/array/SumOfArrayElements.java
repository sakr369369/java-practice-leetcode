package com.java.array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        System.out.println(sum(arr));
        System.out.println(missingNum(arr));


    }

    public  static int sum(int[] arr){
        int sum = 0;
        for(int num: arr){
            sum +=num;
        }
        return sum;
    }
    public static  int  missingNum(int[] arr){

        int n = arr.length +1;
        int expectedSum = n *(n + 1)/2;
        System.out.println("expectedSum = "+ expectedSum);
        int actualSum = 0;
        for(int num: arr){
            actualSum += num;
        }
        System.out.println("actualSum = "+ actualSum);
        return expectedSum -actualSum;
    }
}
