package com.example.dsa.linkedList;

import java.util.HashMap;

public class LL05LengthOfLoop {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = second;
       // int i = lengthOfLoop(head);
        int i = lengthOfLoop2(head);
        System.out.println(i);
    }

    public static int lengthOfLoop(Node head){
        Node temp = head;
        HashMap<Node, Integer> map = new HashMap<>();
        int timer=1;
        while (temp!=null){
            if(map.containsKey(temp)){
                return timer - map.get(temp);
            }
            map.put(temp,timer);
            temp=temp.next;
            timer++;
        }
        return 0;
    }

    public static int lengthOfLoop2(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return findLength(slow,fast);
            }
        }
        return 0;
    }

    public static int findLength(Node slow, Node fast){
        int count=1;
        fast = fast.next;
        while (slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }
}
