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

    /* adding new tail to linked list */
    void append(E value) {
        Node<E> newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /* Showing the whole linked-list*/
    void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    /* delete the 1st node(head) of a linkedlist */
    E pop() {
        if (head == null) {
            return null;
        } else {
            E popData = head.data;
            head = head.next;
            return popData;
        }
    }
}