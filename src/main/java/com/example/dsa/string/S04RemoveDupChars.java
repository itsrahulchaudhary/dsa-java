package com.example.dsa.string;

public class S04RemoveDupChars {
    public static void main(String[] args) {
        String str = "programming";

        //1
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(s->sb.append((char)s));
        System.out.println(sb);

        //2
        StringBuilder sb2 = new StringBuilder();
        char ch[] = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            boolean flag = false;
            for(int j = i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                sb2.append(ch[i]);
            }
        }
        System.out.println(sb2);
    }
}
