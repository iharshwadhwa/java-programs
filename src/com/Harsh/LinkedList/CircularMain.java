package com.Harsh.LinkedList;

public class CircularMain {
    public static void main(String[] args) {


        CircularLinkedList list = new CircularLinkedList();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(89);
        list.delete(23);
        list.display();
    }
}
