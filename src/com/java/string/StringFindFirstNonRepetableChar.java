package com.java.string;
import java.util.*;
public class StringFindFirstNonRepetableChar {
    public static void main(String[] args){
        System.out.println( firstNonRepetable("pramod"));
    }
    public static Character firstNonRepetable(String str){

        Map<Character, Integer> map = new LinkedHashMap();

        for(char ch : str.toCharArray()){
            map.merge(ch, 1, Integer::sum);
        }
      for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
