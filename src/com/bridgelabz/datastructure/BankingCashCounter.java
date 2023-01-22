package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.queue.Queue;

public class BankingCashCounter {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons : ");
        int person = sc.nextInt();

        if (checkNumber(person)) {
            long cash = 999999999;
            // puttting every person in a queue
            for (int i = 0; i < person; i++) {
                queue.enqueue(i);
            }
            while (person != 0) {
                System.out.println("Available cash in bank: " + cash);
                boolean flag = true;

                while (flag) {
                    System.out.println("the person wants to \n1: Withdraw \n2: Deposit");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Enter the required amount to withdraw");
                            int withdrawAmount = sc.nextInt();
                            if (withdrawAmount > cash) {
                                System.out.println("Can't withdraw " + withdrawAmount
                                        + " because available cash in bank is : " + cash);
                                person--;
                                flag = false;
                            } else {
                                System.out.println("amount withdrawn successfully");
                                queue.dequeue();
                                cash = cash - withdrawAmount;
                                System.out.println("Remaining cash in bank : " + cash);
                                person--;
                                flag = false;
                            }
                            System.out.println("--------THANKYOU VISIT AGAIN-------");
                            break;

                        case 2:
                            System.out.println("Enter the required amount to deposit");
                            int depositAmount = sc.nextInt();
                            System.out.println("Amount deposited successfully");
                            queue.dequeue();
                            cash = cash + depositAmount;
                            System.out.println("Remaining cash in bank : " + cash);
                            person--;
                            System.out.println("--------THANKYOU VISIT AGAIN-------");
                            flag = false;
                            break;

                        default:
                            System.out.println("Invalid input");
                    }
                }
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    public static boolean checkNumber(int person) {
        if (person >= 0 && person <= 9)
            return true;
        else
            return false;
    }
}