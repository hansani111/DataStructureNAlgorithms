package com.bridgelabz.linkedlist;

public class LinkedList<E> {

    private Node<E> head;
    private Node<E> tail;

    /* adding new head to linked list */
    public void push(E value) {
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
    public void append(E value) {
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
    public void display() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    /* delete the 1st node(head) of a linkedlist */
    public E pop() {
        if (head == null) {
            return null;
        } else {
            E popData = head.data;
            head = head.next;
            return popData;
        }
    }

    /* delete the last node(tail) of a linked list */
    public E popLast() {
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
    public Node<E> search(E value) {
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

    /* Insert node in the middle of LinkedList */
    public void insertAfter(E searchData, E data) {
        Node<E> searchedElement = search(searchData);

        if (searchedElement == null) {
            System.out.println("element not found!!!");

        } else {
            Node<E> newNode = new Node(data);
            Node<E> nextNode = searchedElement.next;
            searchedElement.next = newNode;
            newNode.next = nextNode;
            System.out.println("Node added successfully");
        }
    }

    /* Get the size of linkedList*/
    public int size() {
        int count = 0;
        if (head == null)
            return count;
        Node<E> temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Size of the linked list is : " + count);
        return count;
    }

    /* Delete a node */
    public void deleteAfter(E data) {
        if (head == null) {
            System.out.println("Empty LinkedList");
            return;
        }
        if (head.data.equals(data)) {
            E popData = head.data;
            head = head.next;
            System.out.println(data + " successfully deleted.");
            return;
        }

        Node<E> temp = head;
        while (temp != tail) {
            if (temp.next.data.equals(data)) {
                temp.next = temp.next.next;
                System.out.println(data + " successfully deleted.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not Found!!!");
    }
}