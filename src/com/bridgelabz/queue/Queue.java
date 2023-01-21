package com.bridgelabz.queue;

import com.bridgelabz.linkedlist.LinkedList;

public class Queue<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    /* adding items in Queue (adding tail)*/
    public void enqueue(E item) {
        linkedList.append(item);
    }

/*showing the full Queue*/
    public void display() {
        linkedList.display();
    }

    /* deleting item in queue (delete tail) */
    public void dequeue() {
        linkedList.pop();
    }

/*searching a value in queue*/
    public boolean searchData(E data) {
        if(linkedList.search(data) != null)
            return true;
        return false;
    }
}