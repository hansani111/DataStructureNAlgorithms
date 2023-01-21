package com.bridgelabz.linkedlist;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    /* adding new head to linked list */
    void push(E value) {
        Node<E> newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

}