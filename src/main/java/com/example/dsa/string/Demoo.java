package com.example.dsa.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demoo {
    public static void main(String[] args) {
        String str = "programmingm";
        HashMap<Character, Integer> map = new HashMap<>();
        char ch[] = str.toCharArray();
        for(Character c : ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for(var v : map.entrySet()){
            if(v.getValue()>1){
                System.out.println(v.getKey()+" : "+v.getValue());
            }
        }
    }

}
