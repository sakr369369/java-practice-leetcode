package com.java.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FriquencyOfChar {
    public static void main(String[] args) {
        frequency("pramooooood");
    }

    public static void frequency(String str){
        Map<Character, Long> frequency = str.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        frequency.forEach((k, v)->{
            System.out.println(k +" = "+v);
        });
    }
}
