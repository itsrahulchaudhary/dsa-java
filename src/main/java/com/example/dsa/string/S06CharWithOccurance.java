package com.example.dsa.string;

public class S06CharWithOccurance {
    public static void main(String[] args) {
        String input = "opentext";
        char charToReplace = 't';
        // expected output = open1ex2

        char ch[] = input.toCharArray();
        int count=1;
        for(int i=0; i<input.length(); i++){
            if(ch[i]==charToReplace){
                ch[i] = String.valueOf(count).charAt(0);
                count++;
            }
        }
        System.out.println(new String(ch));
    }
}
