package com.example.dsa.string;

import java.util.HashMap;

// Find All Duplicates in a String
public class S15DuplicateChars {
    public static void main(String[] args) {
        String str = "programmingm";
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(mp.containsKey(ch[i])){
                mp.put(ch[i], mp.get(ch[i])+1);
            }else {
                mp.put(ch[i], 1);
            }
        }
        for(var entry : mp.entrySet()){
            if(entry.getValue() >1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}
