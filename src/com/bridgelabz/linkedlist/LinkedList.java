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

    /* delete the last node(tail) of a linked list */
    E popLast() {
        if (head == null)
            return null;

        E popLastData = tail.data;
        Node<E> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        return popLastData;
    }

    /* Searching a node in linked list */
    Node<E> search(E value) {
        if (head == null)
            return null;

        Node<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(value))
                return temp;
            temp = temp.next;
        }
        return null;
    }
}