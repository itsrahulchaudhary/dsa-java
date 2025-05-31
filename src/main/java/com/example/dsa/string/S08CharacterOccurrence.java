package com.example.dsa.string;

import java.util.HashMap;

public class S08CharacterOccurrence {
    public static void main(String[] args) {
        String str = "helloo";

        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArr = str.toCharArray();
        for(char ch : charArr){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

    }
}
