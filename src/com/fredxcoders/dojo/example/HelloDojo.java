package com.fredxcoders.dojo.example;

/**
 * This is a sample class to teach the basics of Java programming
 * @author elliott
 */
public class HelloDojo {
	
	//Class variable
	public static int classVariable = 1;
	
	//Class level mystery variable
	public static String mysteryVariable = "three";

	/**
	 * This is the "main" method. We can only "run" classes that have a "main" method.
	 * "Main" methods take in one paremeter (an array of "Strings") and returns nothing
	 * ("void").
	 * @param args
	 */
	public static void main(String[] args) {
		//This will print the phrase: Hello Dojo!
		System.out.println("Hello Dojo!");
		
		//Creates a new String variable names message2
		String message2 = "Another message that comes from a String variable";

		//Prints: Another message that comes from a String variable
		System.out.println(message2);
		
		//Redefines the message2 variable
		message2 = "Now message2 has been redefined!";
		
		//What does this print?
		System.out.println(message2);
		
		//Method variable
		int methodVariable = 2;
				
		//Prints both variables
		System.out.println("Class variable: " + methodVariable 
				+ " Method variable: " + methodVariable);
		
		//method level mystery variable
		int mysteryVariable = 3;
		
		//What will this print: "three" or "3"?
		System.out.println("MysteryVariable: " + mysteryVariable);
	}

}
