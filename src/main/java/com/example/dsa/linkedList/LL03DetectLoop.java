package com.example.dsa.linkedList;

import java.util.HashMap;
// Detect a loop in LL
public class LL03DetectLoop {
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
        fifth.next = third;
       // boolean loop = detectLoop(head);
        boolean loop = detectLoop2(head);
        System.out.println(loop);
    }

    public static boolean detectLoop(Node head){
        Node temp = head;
        HashMap<Node, Integer> map = new HashMap<>();
        while (temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp=temp.next;
        }
        return false;
    }

    public static boolean detectLoop2(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
