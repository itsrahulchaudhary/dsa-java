package com.example.dsa.linkedList;

import java.util.Stack;

public class LL06IsPalindrome {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next =new Node(2);
        head.next.next=new Node(1);
        boolean palindrome = isPalindrome(head);
        System.out.println(palindrome);
    }


    public static boolean isPalindrome(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp!=null){
            if(temp.data!= st.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
