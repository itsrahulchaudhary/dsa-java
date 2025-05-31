package com.example.dsa.string;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class S10LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String str = "java";
        String ans="";
        int length =0;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char charArr[] = str.toCharArray();
        int count=0;
        for(char ch : charArr){
            if(!map.containsKey(ch)){
                map.put(ch, count);
                count++;
            }else{
                map.clear();
            }

            if(map.size()>length){
                length=map.size();
                ans=map.keySet().toString();
            }
        }
        System.out.println(length);
        System.out.println(ans);
    }
}
