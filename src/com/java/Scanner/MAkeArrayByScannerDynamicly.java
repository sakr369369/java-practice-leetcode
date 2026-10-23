package com.java.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MAkeArrayByScannerDynamicly {
    public static void main(String[] args) {
        int[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.println("Enter "+(i + 1)+" element : ");
            int  data = sc.nextInt();
            arr[i] = data;
        }


        for(int dt : arr){
            System.out.print(dt + " ");
        }
        System.out.println(" ");
        shiftByThreshold(arr, 5);

    }

    public static  void  shiftByThreshold(int[] arr , int threshold){

        int[] outputArr = new int[arr.length];
        int index = 0;

        for(int n : arr){
            if(n <  threshold){
                outputArr[index++] = n;

            }
        }
        for(int n : arr){
            if(n >= threshold){
                outputArr[index++] = n;

            }
        }
        for(int n : outputArr){
            System.out.print(n + " ");
        }
    }
}
