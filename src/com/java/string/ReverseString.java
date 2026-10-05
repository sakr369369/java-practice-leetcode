package com.java.string;

public class ReverseString {


public static void main(String[] args){
    String str = "I love India";
    System.out.println(reverseWordWise(str));
    System.out.println(reverseString(str));
}
    public static String reverseWordWise(String str){
    String[] strArr = str.split(" ");

    for(int i = 0, j = strArr.length - 1; i < j; i++, j--){
        String temp = strArr[i];
        strArr[i] = strArr [j];
        strArr[j] = temp;


    }
        return String.join(" ", strArr);
    }

    public  static String reverseString(String str){
    char[] chars = str.toCharArray();
    for(int i = 0, j = chars.length - 1; i < j; i++, j--){
        char c =chars[i];
        chars[i] = chars[j];
        chars[j] = c;
    }

    return  new String(chars);
    }

}

