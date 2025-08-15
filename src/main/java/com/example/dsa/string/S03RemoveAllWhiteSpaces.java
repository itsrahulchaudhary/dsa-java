package com.example.dsa.string;

public class S03RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "  j a va  s ta r ";
        String ans = str.replaceAll("\\s", "");
        System.out.println(ans);
    }


}
