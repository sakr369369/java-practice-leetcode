package com.java.string;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
    public static void main(String[] args){
  String str = "Praamood";
        System.out.println(removeDuplicateChar(str));
    }
    public static String removeDuplicateChar(String str){

        Set<Character> set = new LinkedHashSet();
        for(char c:str.toCharArray()){

            set.add(c);
        }
       StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }
        return sb.toString();
    }
}
