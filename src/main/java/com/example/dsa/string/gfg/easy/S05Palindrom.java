package com.example.dsa.string.gfg.easy;

public class S05Palindrom {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(
                isPalindrome(s)
        );
    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
}
