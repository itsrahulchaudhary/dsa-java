package com.example.dsa.string.gfg.basic;

public class S04InsertPos {
    public static void main(String[] args) {
        String s = "Geeks";
        char c = 'A';
        int pos = 3;
        System.out.println(insertPos(s,c,pos));
    }

    public static String insertPos(String s, char c, int pos){
        StringBuilder sb=new StringBuilder(s);
        sb.insert(pos,c);
        return sb.toString();
    }
}
