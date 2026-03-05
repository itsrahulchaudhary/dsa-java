package com.example.dsa.string.gfg.easy;

public class S02CamelCase {
    public static void main(String[] args) {
        String s ="i got intern at geeksforgeeks";
        System.out.println(
                camelCase(s)
        );
    }

    public static String camelCase(String s){
        StringBuilder sb=new StringBuilder();
        boolean capital=false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                capital=true;
            }else if(capital){
                sb.append(Character.toUpperCase(s.charAt(i)));
                capital=false;
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
