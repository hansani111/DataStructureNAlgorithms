package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList<Integer> Linkedlist1 = new LinkedList<>();
        Linkedlist1.push(70);
        Linkedlist1.push(56);
        Linkedlist1.push(30);

        Linkedlist1.display();

        Integer popData = Linkedlist1.pop();
        if (popData == null) {
            System.out.println("Empty linked list.");
        } else
            System.out.println("POP First Successfully done.Pop data : " + popData);
        Linkedlist1.display();

        System.out.println("******************************\n");

        LinkedList<Integer> Linkedlist2 = new LinkedList<>();
        Linkedlist2.append(56);
        Linkedlist2.append(30);
        Linkedlist2.append(45);
        Linkedlist2.append(70);

        Linkedlist2.display();

        Integer popLastElement = Linkedlist2.popLast();
        if (popLastElement == null)
            System.out.println("Empty linked list.");
        else
            System.out.println("POP Last Successfully done.Pop data : " + popLastElement);
        Linkedlist2.display();

        System.out.println("******************************\n");

        LinkedList<Integer> Linkedlist3 = new LinkedList<>();
        Linkedlist3.search(45);

        Linkedlist3.append(56);
        Linkedlist3.append(30);
        Linkedlist3.append(45);
        Linkedlist3.append(70);
        Linkedlist3.display();

        Node<Integer> searchElement = Linkedlist3.search(30);
        if (searchElement == null)
            System.out.println("Element not Found.");
        else {
            System.out.println("Element Found.");
            System.out.println(searchElement);
        }
        System.out.println("******************************\n");
        LinkedList<Integer> Linkedlist4 = new LinkedList<>();

        Linkedlist4.append(56);
        Linkedlist4.append(30);
        Linkedlist4.append(70);
        Linkedlist4.display();

        Linkedlist4.insertAfter(30, 40);
        Linkedlist4.display();

        System.out.println("******************************\n");

        Linkedlist4.display();
        Linkedlist4.pop(40);
        Linkedlist4.size();
        Linkedlist4.display();
    }
}