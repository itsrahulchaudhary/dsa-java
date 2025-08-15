package com.example.dsa.linkedList;
// Remove Nth node from the back of the LL
public class LL08DeleteNthNode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

       // Node node = deleteNthNode(head, n);
        Node node = deleteNthNode2(head, n);
        Node.printList(node);
    }

    public static Node deleteNthNode(Node head, int n){
        if(head==null){
            return null;
        }

        int count=0;
        Node temp = head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }

        if (count==n){
            Node headNode = head.next;
            head=null;
            return headNode;
        }

        int res = count-n;
        temp = head;
        while (temp!=null){
            res--;
            if(res==0)
                break;
            temp=temp.next;
        }
      //  Node delNode = temp.next;
        temp.next=temp.next.next;
     //   delNode=null;
        return head;
    }

    public static Node deleteNthNode2(Node head, int n){
        Node fastp = head;
        Node slowp = head;

        for (int i=0; i<n; i++)
            fastp=fastp.next;

        if(fastp==null)
            return head.next;

        while (fastp.next!=null){
            fastp=fastp.next;
            slowp=slowp.next;
        }

        slowp.next=slowp.next.next;
        return head;
    }
}
