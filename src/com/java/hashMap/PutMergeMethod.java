package com.java.hashMap;

import java.util.HashMap;
import java.util.Map;

public class PutMergeMethod {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.merge("apple", 5, Integer::sum); // apple -> 6 (1 + 5)
        map.merge("banana", 3, Integer::sum); // banana -> 3 (key didn't exist, so just inserts 3)

map.forEach((v, k) ->{
    if(k > 1) {
        System.out.println(v + "---- " + k);
        System.exit(0);
    }
});

        Map<String, String> map2 = new HashMap<>();
        map2.merge("apple", "tree", String::concat);
        map2.merge("apple", null ,String::concat);
        map2.merge("banana", "RED" ,String::join);
        map2.forEach((v, k) ->{
            System.out.println(v + "---- "+ k);

        });


    }
}
