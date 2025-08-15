package com.example.dsa.linkedList;

import java.util.ArrayList;
import java.util.List;

public class LL07SegregateOddEven {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
       // Node node1 = segregateOddEven(head);
        Node node1 = segregateOddEven1(head);
        Node.printList(node1);
    }

    public static Node segregateOddEven(Node head){
        if(head==null || head.next==null)
            return head;

        Node temp = head;
        List<Integer> list =new ArrayList<>();
        while (temp!=null && temp.next!=null){
            list.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null)
            list.add(temp.data);

        temp = head.next;
        while (temp!=null && temp.next!=null){
            list.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null)
            list.add(temp.data);

        int i=0;
        temp = head;
        while (temp!=null){
            temp.data= list.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }

    public static Node segregateOddEven1(Node head){
        if(head==null || head.next==null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while (even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
