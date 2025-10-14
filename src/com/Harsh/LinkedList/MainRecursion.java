package com.Harsh.LinkedList;

public class MainRecursion {
    public static void main(String[] args) {
        RecursionLL node = new RecursionLL();
        node.insertFirst(22);
        node.insertFirst(21);
        node.insertFirst(24);
        node.insertFirst(25);
        node.display();
        node.insertRec(88,2);
        node.display();
    }
}
