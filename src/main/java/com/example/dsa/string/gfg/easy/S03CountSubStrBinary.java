package com.example.dsa.string.gfg.easy;

public class S03CountSubStrBinary {
    public static void main(String[] args) {
        String s ="00100101";
        System.out.println(
                countSubString(s)
        );
    }

    public static int countSubString(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(j)=='1'){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
