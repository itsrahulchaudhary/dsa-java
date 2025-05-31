package com.example.dsa.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S05SortStringChar {
    public static void main(String[] args) {
        String str = "java";

        //1.
        char ch[] = str.toCharArray();
        for(int i = 0; i< ch.length; i++){
            for(int j = i+1; j<ch.length; j++){
                if(ch[i]>ch[j]){
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        System.out.println(ch);

        //2
        char c[]= str.toCharArray();
        Arrays.sort(c);
        System.out.println(new String(c));
    }
}
