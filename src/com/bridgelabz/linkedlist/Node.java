package com.bridgelabz.linkedlist;

/* node will contain 'data' and 'next'
 * 'data' will contain any value
 * 'next' will contain NodeObject (refer to the next node)
 */
public class Node<E> {

    E data;
    Node<E> next;

    /* Whenever we will create the object of node that time 'data' will be assigned & next value will be null */
    public Node(E data) {
        this.data = data;
    }
}