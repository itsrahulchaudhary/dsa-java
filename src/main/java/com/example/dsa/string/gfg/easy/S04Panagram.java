package com.example.dsa.string.gfg.easy;

public class S04Panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s));
    }

    public static boolean isPanagram(String s){
      for(char ch='a'; ch<='z'; ch++){
          boolean found=false;
          for(int i=0; i<s.length(); i++){
              if(Character.toLowerCase(s.charAt(i))==ch){
                  found = true;
                  break;
              }
          }
          if(found==false){
              return false;
          }
      }
      return true;
    }
}
