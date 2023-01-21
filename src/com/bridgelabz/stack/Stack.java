package com.bridgelabz.stack;

import com.bridgelabz.linkedlist.LinkedList;
import com.bridgelabz.linkedlist.Node;

public class Stack<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    /* adding items in stack (adding tail) */
    public void push(E item) {
        linkedList.append(item);
    }

    /* showing the full stack */
    public void printStack() {
        linkedList.display();
    }

    /* deleting item in stack (delete tail) */
    public void pop() {
        linkedList.popLast();
    }

    /* Just getting the last value added in stack */
    Node<E> peak() {
        return linkedList.getTail();
    }

    /* searching a value in stack */
    public boolean searchData(E data) {
        if (linkedList.search(data) != null)
            return true;
        return false;
    }
}