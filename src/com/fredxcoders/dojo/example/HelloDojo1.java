//A line that starts with two /'s is a one line comment
/*
 * Multiple lines that start with  /* and end with * and /
 * are block comments
 */

//The package definition. Describes the space where this class will live
package com.fredxcoders.dojo.example;

/*
 * Import refers to pulling in other classes. There are many helpful classes provided with
 * your java installation and there are numerous open source Java libraries that provide
 * many useful functions.
 */
import java.util.Date;

/**
 * This is a sample class to teach the basics of Java programming.
 * This class will show basic syntax (colors are according to Eclipse).
 * You'll notice that the code in this class has different colors: 
 * 		Light blue and green indicate comments (they aren't compiled and are not technically "code")
 * 		Red indicates a "Reserved" word. Reserved words cannot be used as variable or method names
 * 		Dark blue indicates the value of a variable
 * @author elliott
 */
public class HelloDojo1 {	//classes must be contained by '{' and '}'

	/**
	 * This is the "main" method. We can only "run" classes that have a "main" method.
	 * "Main" methods take in one parameter (an array of "Strings") and returns nothing
	 * ("void").
	 * @param args
	 */
	public static void main(String[] args) {	//Methods also must be contained by '{' and '}'
		//Here we are declaring (or creating) a variable named "rightNow" and setting it's value
		//to a new instance of the Date class
		Date rightNow = new Date();	//This is a "statement". Statements must end with a ';'.
		
		//This will print the phrase: 'Hello Dojo! Here's the current time: ' and the current time
		//Date objects have a method called 'toString' which turns the time into a human readable format
		System.out.println("Hello Dojo! Here's the current time: " + rightNow.toString());
	}

}
