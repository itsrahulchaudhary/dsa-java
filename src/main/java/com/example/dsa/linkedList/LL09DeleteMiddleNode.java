package com.example.dsa.linkedList;
// Delete the middle node of LL
public class LL09DeleteMiddleNode {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = new Node(6);
      //  Node head1 = deleteMiddleNode(head);
        Node head1 = deleteMiddleNode2(head);
        Node.printList(head1);
    }

    public static Node deleteMiddleNode(Node head){
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        int count =0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }

        int mid = count/2;
        temp = head;
        while (temp!=null){
            mid=mid-1;
            if(mid==0){
                break;
            }
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static Node deleteMiddleNode2(Node head){
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head.next.next;

        while (slow!=null && fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

