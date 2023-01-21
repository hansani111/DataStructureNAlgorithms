package com.bridgelabz.algorithms;

import java.util.Scanner;

public class PermutationOfString {

    static int count = 0;

    public static void main(String[] args) {
        System.out.println("**********  Welcome to permutation program  **********\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to get all parmutations:  ");

        String str = sc.next();
        String ans = "";
        System.out.println("All the possibility of the string is : ");
        getParmutation(str, ans);
        System.out.println("Total possibility found : " + count);
    }

    public static void getParmutation(String input, String out) {
        if (input.length() == 0) {
            System.out.println(out + " ");
            count++;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String left = input.substring(0, i);
            String right = input.substring(i + 1);
            String rest = left + right;
            getParmutation(rest, out + ch);
        }
    }
}