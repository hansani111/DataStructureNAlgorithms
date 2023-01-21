package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedList;

public class Stack<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    /* adding items in stack (adding tail)*/
    public void push(E item) {
        linkedList.append(item);
    }
    /*showing the full stack*/
    public void printStack() {
        linkedList.display();
    }
}