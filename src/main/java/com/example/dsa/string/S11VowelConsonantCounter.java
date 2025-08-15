package com.example.dsa.string;

public class S11VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Java Programming Language";
        int vowels = 0, consonants = 0;
        input.toLowerCase();
        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch >='a' && ch <= 'z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowel :: "+vowels);
        System.out.println("Consonants :: "+consonants);
    }
}
