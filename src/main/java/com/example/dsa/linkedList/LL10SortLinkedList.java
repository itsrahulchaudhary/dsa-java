package com.example.dsa.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LL10SortLinkedList {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(3);
        Node head1 = sortLinkedList(head);
        Node.printList(head1);
    }

    public static Node sortLinkedList(Node head){
        Node temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);
        temp = head;
        int i=0;
        while (temp!=null){
            temp.data= list.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
    // optimize approach left
}
