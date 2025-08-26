package com.example.dsa.string;

import java.util.HashMap;

// Find All Duplicates in a String
public class S15DuplicateChars {
    public static void main(String[] args) {
        String str = "programmingm";
        char ch[] = str.toCharArray();
        for(int i=1; i<=10; i++){
            System.out.println("feature/pojo");
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        System.out.println("I am in develop branch");
        System.out.println("I am in develop branch Hello sir !!!");
        System.out.println("I am in feature/pojo");
        System.out.println("Hey ........!!....");
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
