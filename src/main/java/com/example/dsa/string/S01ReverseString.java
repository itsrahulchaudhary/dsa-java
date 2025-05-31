package com.example.dsa.string;

public class S01ReverseString {

    public static void main(String[] args) {
        String input = "rahul";

        // 1
        for(int i = input.length()-1; i>=0; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println();

        //2
        char ch[] = input.toCharArray();
        for(int i = ch.length-1; i>=0; i--){
            System.out.print(ch[i]);
        }
        System.out.println();

        //3
        StringBuilder sb =new StringBuilder(input);
        System.out.println(sb.reverse());

    }

}
