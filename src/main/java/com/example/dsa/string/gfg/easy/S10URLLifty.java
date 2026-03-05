package com.example.dsa.string.gfg.easy;

public class S10URLLifty {
    public static void main(String[] args) {
        String s = "i love programming";
        System.out.println(urlLifty(s));
    }

    public static String urlLifty(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
