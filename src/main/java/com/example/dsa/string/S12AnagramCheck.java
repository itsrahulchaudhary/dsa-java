package com.example.dsa.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class S12AnagramCheck {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equals = Arrays.equals(ch1,ch2);
        System.out.println("Is this Anagaram : "+equals);

    }
}
