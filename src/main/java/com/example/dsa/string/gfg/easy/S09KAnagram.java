package com.example.dsa.string.gfg.easy;

import java.util.HashMap;

public class S09KAnagram {
    public static void main(String[] args) {
       String str1 = "anagram";
       String str2 = "grammar";
       int k = 3;
        System.out.println(kAnagram(str1,str2,k));
    }

    public static boolean kAnagram(String s1, String s2, int k){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character, Integer> map =new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c : s2.toCharArray()){
            map.put(c, map.getOrDefault(c,0)-1);
        }
        int reqCount=0;
        for(int v : map.values()){
            if(v>0){
                reqCount+=v;
            }
        }
        return reqCount<=k;
    }
}
