package com.bridgelabz.datastructure;

import com.bridgelabz.queue.Queue;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.next();

        if (isPalindrome(word)) {
            System.out.println("This is a palindrome word.");
        } else
            System.out.println("This is not a palindrome word.");
    }

    private static boolean isPalindrome(String word) {
        Queue<Character> charQueue1 = new Queue<>();
        Queue<Character> charQueue2 = new Queue<>();

        char[] wordArray = word.toCharArray();
        int arrLength = wordArray.length;

        for (int i = 0; i < arrLength; i++) {
            charQueue1.enqueue(wordArray[i]);
        }
        charQueue1.display();

        for (int i = (arrLength - 1); i >= 0; i--) {
            charQueue2.enqueue(wordArray[i]);
        }
        charQueue2.display();

        for (int i = 0; i <= arrLength/2; i++) {
            if (!charQueue1.dequeue().equals(charQueue2.dequeue()))
                return false;
        }
        return true;
    }
}