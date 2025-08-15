package com.example.dsa.linkedList;

import java.util.Stack;

public class LL02ReverseLinkedListUsingStack {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list");
        Node.printList(head);
       //Node node = reverseLinkedListUsingStack(head);
        Node node = reverseLinkedList(head);
        System.out.println("Reverse list");
        Node.printList(node);

    }

    public static Node reverseLinkedListUsingStack(Node head){
       Stack<Integer> stack = new Stack<>();
       // step-1
        Node temp = head;
        while (temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }

        //step-2
        temp =head;
        while (temp!=null){
            temp.data = stack.pop();
            temp=temp.next;
        }
        return head;
    }

    public static Node reverseLinkedList(Node head){
        Node temp = head;
        Node prev =null;
        while (temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}


