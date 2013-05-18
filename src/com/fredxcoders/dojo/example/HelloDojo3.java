package com.fredxcoders.dojo.example;

/**
 * This is a sample class to teach the basics of Java programming.
 * This class will show controlling the flow of execution and methods (functions).
 * We'll be talking about several 'operators':
 * 		< the 'less than' operator
 * 		> the 'greater than' operator
 * 		<= the 'less than or equals to' operator
 * 		>= the 'greater than or equals to' operator
 * 		== the 'equality' operator (read as "is equal to") (very different than what we've used to set our variables! '=')
 * 		! the 'inverse' operator (read as "not", ie: '!true' would really mean 'false')
 * We'll also be talking about several flow controllers
 * 		'if' checks if a condition is true
 * 		'else' handles all alternative cases
 * 		'else if' handles alternatives and checks against an additional condition
 * @author elliott
 */
public class HelloDojo3 {

	/**
	 * This is the "main" method. We can only "run" classes that have a "main" method.
	 * "Main" methods take in one parameter (an array of "Strings") and returns nothing
	 * ("void").
	 * @param args
	 */
	public static void main(String[] args) {
		//This will print the phrase: Hello Dojo!
		System.out.println("Hello Dojo!");
		
		boolean isTrue = true;
		if(isTrue == true){//checks if the condition is true and executes the enclosed statements if it was
			System.out.println("The first 'if' was true!");	
		}
		
		if(!isTrue){	//this reads as "if 'not' the value of the variable 'isTrue'"
			System.out.println("'not isTrue' must have been true if this is printing!");
		} else if(true == false){	//reads as "if true is equals to false"
			System.out.println("'true is equal to false' must be true if this is printing!");
		} else { 	// this will catch all other conditions 
			System.out.println("If this is printing, the other conditions must have been false!");
		}
		
		int count = 0;
		
		System.out.println("Starting 'while' loop:");
		//This is a 'while' loop
		//A 'while' loop executes the same statements while the 'condition' is true
		while(count < 10){	//you can read this as "while the condition (count is less than 10) is true
			count = count + 1;	//increment our counter
			System.out.println("We've gone through the for loop this many times: " + count);	
		}
		System.out.println("Finished 'while' loop!");
		
		System.out.println("Starting 'for' loop:");
		//Here we'll be showing a 'for' loop
		//A 'for' loop  has three important pieces
		for(int counter=0;	//set up our counter variable for the loop
				counter < 5;	//set how long we want to run the loop for (do this while counter is less than 5
				counter++)		//increment our counter (this is like saying 'counter = counter + 1'
		{
			System.out.println("We've gone through the for loop this many times: " + counter);	//This is the statement that gets looped over
		}
		System.out.println("Finished 'for' loop!");
		
		//calls the doSomething method
		doSomething();
		
		//Another way to initialize an array
		int[] myIntArray = {23, 31, 2, 38, 90, 101};
		
		String result = formatArrayForPrinting(myIntArray);
		
		System.out.println("We formatted our array: " + result);
	}
	
	/**
	 * This is a method which does something
	 */
	public static void doSomething(){
		System.out.println("Hey, we're in the doSomething method!");
	}

	
	public static String formatArrayForPrinting(int[] array){
		String formattedArray = "";
		for(int counter=0; counter < array.length; counter++){
			formattedArray = "[" + array[counter] + "] ";
		}
		return formattedArray;
	}
}
