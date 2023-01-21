package com.bridgelabz.stack;

public class StackMain {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        stack1.push(56);
        stack1.push(30);
        stack1.push(70);
        stack1.printStack();

        System.out.println(stack1.peak());

        stack1.pop();
        stack1.printStack();
    }
}