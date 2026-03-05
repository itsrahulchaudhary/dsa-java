package com.example.dsa.string.gfg.easy;

public class S01BinaryStr {
    public static void main(String[] args) {
        String s ="0101010kk1010";
        System.out.println(checkBinary(s));
    }

    public static boolean checkBinary(String s){
        for(char c : s.toCharArray()){
            if(c!='0' && c!='1'){
                return false;
            }
        }
        return true;
    }
}
