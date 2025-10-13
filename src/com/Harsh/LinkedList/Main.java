package com.Harsh.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertlast(32);
        list.insert(100,3);
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.delete(2));  //O(n)
        list.display();
    }
}
