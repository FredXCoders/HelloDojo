package com.fredxcoders.dojo.example;

/**
 * This is a sample class to teach the basics of Java programming.
 * This class will show using variables.
 * @author elliott
 */
public class HelloDojo2 {
	
	//Class variable
	public static int classVariable = 1;
	
	//Class level mystery variable
	public static String mysteryVariable = "three";
	
	//Class level String array variable set to be able to hold 5 Strings
	public static String[] myStringArray = new String[5];

	/**
	 * This is the "main" method. We can only "run" classes that have a "main" method.
	 * "Main" methods take in one parameter (an array of "Strings") and returns nothing
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
		
		//Set the items in the array. The number represents the "index", or position in the array.
		//The array index starts with 0 and goes until the size of the array - 1.
		myStringArray[0] = "This "; //Sets the first "0th" element
		myStringArray[1] = "is ";	//Sets the second element
		myStringArray[2] = "my";
		myStringArray[3] = " array ";
		myStringArray[4] = "that I created";
		
		
		//Print out the items in the array
		System.out.println(myStringArray[0] + myStringArray[1] + myStringArray[2] + myStringArray[3] + myStringArray[4]);
	}

}
