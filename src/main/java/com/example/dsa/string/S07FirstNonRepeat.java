package com.example.dsa.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 // Java Program To Find First Non Repeated Character
public class S07FirstNonRepeat {
    public static void main(String[] args) {
        String str = "AABBCDE";

        //1.
        for(int i=0; i<str.length(); i++){
            boolean flag = true;
            for(int j = 0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(str.charAt(i));
                break;
            }
        }

        //2.
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }



    }
}
