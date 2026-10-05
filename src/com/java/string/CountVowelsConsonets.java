package com.java.string;

public class CountVowelsConsonets {
    public static void main(String[] args) {

        String str = "pramod";
        countVowelsConsonent(str);
    }

    public static void countVowelsConsonent(String str){
        int vowels = 0;
        int consonet = 0;

        for(char c : str.toCharArray()){
            if("aeiou".contains(String.valueOf(c))){
                vowels++;
            }else{
                consonet++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("consonet : "+consonet);
    }
}
