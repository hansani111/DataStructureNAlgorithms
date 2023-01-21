package com.bridgelabz.algorithms;

import java.util.Scanner;

public class FindYourNumber {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Maximum Number to Find the element: ");
        int n = sc.nextInt();
        int upperBound = (int) Math.pow(2, n);
        System.out.println("upperBound = " + upperBound);

        System.out.println("Think a number between 0 to " + (upperBound));
        searchNumber(upperBound);
    }

    public static void searchNumber(int upperBound) {
        int low = 0;
        int high = upperBound;
        while (low <= high) {
            int midVal = (low + high) / 2;
            System.out.println("Press 0 if the number is " + midVal);
            System.out.println("Press 1 if the number is between " + low + " to " + midVal);
            System.out.println("Press 2 if the number is between " + (midVal + 1) + " to " + high);

            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("\nGot the number " + midVal);
                break;
            } else if (choice == 1) {
                high = midVal;
            } else if (choice == 2) {
                low = midVal + 1;
            }
        }
    }
}