package com.java.string;

import java.util.Map;
import java.util.LinkedHashMap;
public class StringFindDuplicateWord {
    public static void main(String[] args){
        duplicateWord("I love love India india India India");
    }
    public static void duplicateWord(String str){
        Map<String, Integer> map = new LinkedHashMap();
        for(String word : str.split(" ")){
            map.merge(word, 1, Integer::sum);
        }

        map.forEach((k,v)->{
            if(v > 1){
                System.out.println(k+" = "+v);
            }

        });
    }
}
