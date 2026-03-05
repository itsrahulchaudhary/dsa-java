package com.example.dsa.string.gfg.basic;

import java.util.ArrayList;

public class S09SubString {
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(
                subString(s)
        );
    }

    public static ArrayList<String> subString(String s){
        ArrayList<String> res=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
              res.add(s.substring(i,j+1));
            }
        }
        return res;
    }
}
