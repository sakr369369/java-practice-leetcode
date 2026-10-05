package com.java.array;

public class ShiftAllZeroInLAst {
    public static void main(String[] args) {
        int[] arr = {2,0,6,-1,3,0,-2,8,4};
        int[] output = shiftZero(arr);
        for(int value : output) {
            System.out.print( value + " ");
        }
    }

    public static int[] shiftZero(int[] arr){
        int[] newArr = new int[arr.length];
        int index = 0;

        for(int value : arr){
            if( value > 0){
                newArr[index++] = value;
            }
        }
        for(int value : arr){
            if( value  <= 0){
                newArr[index++] = value;
            }
        }

        return newArr;
    }
}
