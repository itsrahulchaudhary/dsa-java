package com.example.dsa.linkedList;

public class LL11Sort012 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);

      //  Node head1 = sort012(head);
        Node head1 = sort012Optimize(head);
        Node.printList(head1);
    }

    public static Node sort012(Node head){
        Node temp = head;
        int count0=0;
        int count1=0;
        int count2=0;

        while (temp!=null){
            if(temp.data==0) {
                count0++;
            } else if (temp.data==1) {
                count1++;
            }else{
                count2++;
            }
            temp=temp.next;
        }

        temp=head;
        while (temp!=null){
           if(count0>0){
               temp.data=0;
               count0--;
           } else if (count1>0) {
               temp.data=1;
               count1--;
           }else {
               temp.data=2;
               count2--;
           }
           temp=temp.next;
        }
        return head;
    }

    public static Node sort012Optimize(Node head){
        if(head==null || head.next==null)
            return null;

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        Node temp = head;
        while (temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=temp;
            } else if (temp.data==1) {
                one.next=temp;
                one=temp;
            }else {
                two.next=temp;
                two=temp;
            }
            temp=temp.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;

        Node newHead = zeroHead.next;
        return  newHead;
    }
}
