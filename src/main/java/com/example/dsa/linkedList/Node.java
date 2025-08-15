package com.example.dsa.linkedList;

public class Node {
    int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next=null;
    }

    public Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    public static void printList(Node head){
        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}
