package com.example.dsa.string.gfg.basic;

public class S08ReverseString {
    public static void main(String[] args) {
        String s="GeeksforGeeks";
        System.out.println(reverse(s));
    }

    public static String reverse(String s){
        String str="";
        for(int i=s.length()-1; i>=0; i--){
            str+=s.charAt(i);
        }
        return str;
    }
}
