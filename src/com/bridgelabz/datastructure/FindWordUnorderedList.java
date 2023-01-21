package com.bridgelabz.datastructure;

import java.util.Scanner;

import com.bridgelabz.linkedlist.LinkedList;

public class FindWordUnorderedList {

	public static void main(String[] args) {

		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] wordsArray = paragraph.split(" ");
        
        LinkedList<String> list = new LinkedList<>();
        for(int i=0; i<wordsArray.length; i++) {
        	list.append(wordsArray[i]);
        	
        }
        System.out.println("Enter A Word To Search");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        if(list.search(word)== null) {
        	System.out.println("Word Not Found");
        	list.append(word);
        	System.out.println("Word added");
        }else {
        	System.out.println("Word Found");
        	list.pop(word);	
        }
        list.display();

	}
}