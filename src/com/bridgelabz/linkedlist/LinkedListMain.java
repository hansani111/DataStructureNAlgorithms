package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> Linkedlist1 = new LinkedList<>();
        Linkedlist1.push(70);
        Linkedlist1.push(56);
        Linkedlist1.push(30);

        Linkedlist1.display();

        Integer popData = Linkedlist1.pop();
        if(popData == null) {
            System.out.println("Empty linked list.");
        }else
            System.out.println("POP First Successfully done.Pop data : " + popData);
        Linkedlist1.display();

        System.out.println("*****************************************************\n");

        LinkedList<Integer> Linkedlist2 = new LinkedList<>();
        Linkedlist2.append(56);
        Linkedlist2.append(30);
        Linkedlist2.append(45);
        Linkedlist2.append(70);

        Linkedlist2.display();

        Integer popLastElement = Linkedlist2.popLast();
        if(popLastElement == null)
            System.out.println("Empty linked list.");
        else
            System.out.println("POP Last Successfully done.Pop data : " + popLastElement);
        Linkedlist2.display();

    }

}