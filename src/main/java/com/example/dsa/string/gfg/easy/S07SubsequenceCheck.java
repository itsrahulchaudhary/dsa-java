package com.example.dsa.string.gfg.easy;

public class S07SubsequenceCheck {
    public static void main(String[] args) {
       String  s1 = "AXY";
       String s2 = "ADXCPY";
        System.out.println(
                isSubSequenceCheck(s1,s2)
        );
    }

    public static boolean isSubSequenceCheck(String s1, String s2){
        int i=0;
        int j=0;
        while (i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s1.length();
    }
}
