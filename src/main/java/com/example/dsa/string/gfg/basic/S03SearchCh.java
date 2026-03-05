package com.example.dsa.string.gfg.basic;

public class S03SearchCh {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char ch = 'k';
        System.out.println(
                searchIndx(s,ch)
        );

    }

    public static int searchIndx(String s, char ch){
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}
