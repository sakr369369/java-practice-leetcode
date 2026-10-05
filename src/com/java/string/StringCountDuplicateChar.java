package com.java.string;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCountDuplicateChar {
    public static void main(String[] args){
        duplicateCountInString("pramodod");
    }
    public static void duplicateCountInString(String str){
        Map<Character,Integer> map = new LinkedHashMap();
        for(char ch : str.toCharArray()){
            map.merge(ch , 1 , Integer::sum);
        }
        map.forEach((k,v) ->{
            if(v > 1){
                System.out.println(k +"="+v);
            }
        });
    }
}
