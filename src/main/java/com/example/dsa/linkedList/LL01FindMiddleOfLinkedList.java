package com.example.dsa.linkedList;

public class LL01FindMiddleOfLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
       // head.next.next.next.next.next = new Node(6);

        Node middle = findMiddle(head);
        System.out.println(middle.data);

       // Node middle2 = findMiddle2(head);
     //   System.out.println(middle2.data);
    }

    // brute force
    public static Node findMiddle(Node head){
        if(head == null || head.next==null){
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp !=null){
            count++;
            temp = temp.next;
        }

        int mid = count/2 +1;
        temp = head;
        while (temp!=null){
            mid = mid - 1;
            if(mid==0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    // optimal
    public static Node findMiddle2(Node head){
        Node slow = head;
        Node fast = head;

        while (slow!=null && fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


}
