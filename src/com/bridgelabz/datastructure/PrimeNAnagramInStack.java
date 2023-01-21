package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Arrays;

import com.bridgelabz.stack.Stack;

public class PrimeNAnagramInStack {
	static boolean isPrime(int number){
		if(number==1||number==0) {
			return false;
		}
		for(int i=2; i<=number/2; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}

	static boolean isAnagram(Integer num1, Integer num2) {
		if (Integer.toString(num1).length() == Integer.toString(num2).length() ) {
			char[] array1 = num1.toString().toCharArray();
			char[] array2 = num2.toString().toCharArray();
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

	public static void main(String[] args) {
		ArrayList<Integer> primeNumbers = new ArrayList<>();
		Stack<Integer> myStack = new Stack<>();

		int startingRange = 0;
		int endingRange = 1000;
		System.out.println("Prime numbers present in the given range(" + startingRange +"-" + endingRange + ") are : ");
		for(int i = startingRange; i <= endingRange; i++){
			if(isPrime(i)) {
				System.out.print(i + " ");
				primeNumbers.add(i);
			}
		}
		System.out.println("\nThe numbers that are prime and anagram are: ");
		for(int i=0; i < primeNumbers.size(); i++) {
			for( int j=i+1; j < primeNumbers.size(); j++) {

				if(isAnagram(primeNumbers.get(i), primeNumbers.get(j))) {
					if(!myStack.searchData(primeNumbers.get(i))) {
						myStack.push(primeNumbers.get(j));;
					}	
					System.out.println(primeNumbers.get(i) + "  <> " + primeNumbers.get(j));
				}
			}
		}

		myStack.printStack();
	}
}