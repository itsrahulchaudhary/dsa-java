package com.example.dsa.string;

public class S09ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "java code"; // output -> avaj edoc
        String[] words = str.split(" ");
        String output = "";
        for(String word : words){
            String revWord ="";
            for(int i=word.length()-1; i>=0; i--){
                revWord = revWord+word.charAt(i);
            }
            output = output+revWord+" ";
        }
        System.out.println(output);
    }
}
