package com.example.dsa.string.gfg.basic;

public class S02Same {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(check(s1,s2));
    }

    public static String check(String s1, String s2){
        if(s1.equals(s2)){
            return "Yes";
        }
        return "No";
    }
}
