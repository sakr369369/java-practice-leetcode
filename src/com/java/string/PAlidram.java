package com.java.string;

public class PAlidram {

    public static void main(String[] args){
        String str = "abAba";
        System.out.println("Is String is Polydrom = "+ isPolodram(str));

        String str2 = "abAba1";
        System.out.println("Is String is Polydrom = "+ isPolodram(str2));
    }
    public static boolean isPolodram(String str){

        int left = 0;
        int right = str.length() - 1 ;

        while( left < right){
            if( str.charAt(left) != str.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }
        return  true;
    }


}
