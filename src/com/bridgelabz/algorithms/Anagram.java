package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("Welcome to Anagram Program ");
        Anagram anagram = new Anagram();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String a = sc.next();
        System.out.println("Enter the second String");
        String b = sc.next();
        System.out.println(anagram.isAnagram(a, b));

    }

    boolean isAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] array1 = str1.toLowerCase().toCharArray();
            char[] array2 = str2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            if (Arrays.equals(array1, array2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}