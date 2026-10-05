package com.java.string;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagramCheck {
    public static void main(String[] str){

String str1 = "listen";
String str2 = "sil   ent";
        System.out.println( isAnagram(str1, str2));

    }
    public  static boolean isAnagram(String s1, String s2){
        String str1 = s1.replaceAll("\\s+","").toLowerCase();
        String str2 = s2.replaceAll("\\s+","").toLowerCase();
        System.out.println(str1);
        System.out.println(str2);
         if(str1.length() != str2.length()){

             return false;
         }

         char[] arr1 = str1.toCharArray();
         char[] arr2 = str2.toCharArray();

         Arrays.sort(arr1);
         Arrays.sort(arr2);


        return Arrays.equals(arr1,arr2);
    }
}
