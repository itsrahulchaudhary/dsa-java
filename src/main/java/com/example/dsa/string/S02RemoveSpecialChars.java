package com.example.dsa.string;

public class S02RemoveSpecialChars {
    public static void main(String[] args) {
        String str = "$ja!va*$st%ar";
        String planStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(planStr);
    }
}
