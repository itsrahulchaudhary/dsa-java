package com.example.dsa.string.gfg.basic;

public class S06RemoveAllCh {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = 'e';
        System.out.println(removeCh(s,c));
    }

    public static String removeCh(String s, char ch){
        StringBuilder str= new StringBuilder();
        for(char c : s.toCharArray()){
            if(c!=ch){
                str.append(c);
            }
        }
        return str.toString();
    }
}
