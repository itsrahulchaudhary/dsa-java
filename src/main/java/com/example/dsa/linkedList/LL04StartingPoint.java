package com.example.dsa.linkedList;

import java.util.HashMap;

//Find the starting point in LL
public class LL04StartingPoint {
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
       // Node node = startingLoopPoint(head);
        Node node = startingLoopPoint2(head);
        System.out.println(node.data);

    }

    public static Node startingLoopPoint(Node head) {
        Node temp = head;
        HashMap<Node, Integer> map = new HashMap<>();
        while (temp != null) {
            if (map.containsKey(temp)) {
                    return temp;
            } else {
                map.put(temp, 1);
            }
            temp=temp.next;
        }
        return null;
    }

    public static Node startingLoopPoint2(Node head){
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow == fast){
                slow=head;
                while (slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }


}