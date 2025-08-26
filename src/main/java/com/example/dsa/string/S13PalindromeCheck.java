package com.example.dsa.string;

public class S13PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("feature/initial-setUp ---- Hey...");
        int i=0;
        int j=input.length()-1;
        while (i<j){
            System.out.println("feature/pojo ---- hello ----");
            if(input.charAt(i++) != input.charAt(j--)){
                System.out.println("Not a palindrome string");
                System.exit(0);
               // break;
            }
        }
        System.out.println("Yes it is palindrome string");
    }
}
