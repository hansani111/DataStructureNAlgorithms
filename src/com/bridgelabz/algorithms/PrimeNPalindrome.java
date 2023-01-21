package com.bridgelabz.algorithms;

public class PrimeNPalindrome {

    static boolean isPrime(int number) {
        if (number == 1 || number == 0) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome(int num) {
        int reverse = 0;
        int number = num;

        while (number != 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }

        if (num == reverse) {
            return true;
        } else {
            return false;
        }
    }

    static void isPrimeNPalindrome(int num) {
        if (isPrime(num) && isPalindrome(num)) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        System.out.println("The prime numbers which are palindrome also in the given range(0-1000):");
        for (int i = 0; i <= 1000; i++) {
            isPrimeNPalindrome(i);
        }
    }
}