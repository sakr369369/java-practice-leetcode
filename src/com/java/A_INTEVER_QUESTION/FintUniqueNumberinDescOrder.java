package com.java.A_INTEVER_QUESTION;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FintUniqueNumberinDescOrder {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("1,3,2", "4,abs,5", "2,3,cfgb,pramod,4,7,9");
        List<Integer> result = list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .filter(s -> s.matches("\\d+"))
                .map(Integer::parseInt)
                .distinct()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(result);

        List<String> stringResult = list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .filter(s -> s.matches("\\d+"))
                .collect(Collectors.toList());

        System.out.println(stringResult);

        List<String> charResult = list.stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());

        System.out.println(charResult);
    }


}