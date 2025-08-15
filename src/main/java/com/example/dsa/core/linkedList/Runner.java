package com.example.dsa.core.linkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(20);
        list.insert(10);
        list.insertAtStart(500);
        list.insertAt(0,100);
       // list.deleteAt(2);
        


        list.show();
    }
}
