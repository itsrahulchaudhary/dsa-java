package com.example.dsa.string.gfg.easy;

import java.util.HashMap;

public class S08Anagram {
    public static void main(String[] args) {
       String s1 = "geeks";
       String s2 = "kseege";
        System.out.println(
                isAnagram(s1,s2)
        );

    }

    public static boolean isAnagram(String s1, String s2){
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : s2.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        for(var v : map.entrySet()){
            if (v.getValue()<0){
                return false;
            }
        }
        return true;
    }
}
