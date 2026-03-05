package com.example.dsa.string.gfg.basic;

public class S05RemoveCh {
    public static void main(String[] args) {
        String s = "abcde";
        int pos = 1;
        System.out.println(removeCh(s, pos));
    }

    public static String removeCh(String s, int pos){
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(pos);
        return sb.toString();
    }
}
