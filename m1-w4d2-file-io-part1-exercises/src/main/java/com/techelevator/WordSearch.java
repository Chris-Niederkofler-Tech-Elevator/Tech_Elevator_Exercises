package com.techelevator;
import java.io.*;
import java.util.Scanner;

public class WordSearch {
	public static void main(String[] args) throws IOException{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please Enter the Filename: ");
		String fileName = userInput.nextLine();
		System.out.println("Please Enter a word: ");
		String wordName = userInput.nextLine();
		//System.out.println("Should the word search be case sensitive?");
		//String yn = userInput.nextLine();
		int count = 0;
		try(LineNumberReader lr = new LineNumberReader(new FileReader(fileName))){
			String line;
			while((line = lr.readLine()) != null) {
				
				for(String word : line.split(" ")) {
					if(word.equalsIgnoreCase(wordName)) {
					count++;
					System.out.println("Word found in line " + lr.getLineNumber() +  " " + line);
				
				}
			}
		}
	}
	System.out.println("The word you chose, " + wordName + " appears " + count + " times.");
	}
}

