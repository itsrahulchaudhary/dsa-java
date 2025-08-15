package com.example.dsa.string;

public class S14RemoveNumbersFromString {
    public static void main(String[] args) {
        String input = "a1b2c3d4";
        String result = "";

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(!(c >='0' && c <='9')){
                result = result+c;
            }
        }

        System.out.println(result);
    }
}
