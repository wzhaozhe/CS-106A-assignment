/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
        // prompt user for input
		print("Enter a number: ");
		
        // initialize variables
		int inputNumber = readInt();
		int current;
		int processCounter = 0;
		
		do {
			// store current number for print result
			current = inputNumber;
			
			// print result depend on even or odd
			if(inputNumber % 2 == 0) {
				inputNumber = inputNumber / 2;
				println(current + " is even so I take half: " + inputNumber);
			}
			else if(inputNumber % 2 == 1) {
				inputNumber = 3 * inputNumber + 1;
				println(current + " is odd, so I make 3n + 1: " + inputNumber);
			}
			
			// process counter to count how many times process doing
			processCounter++;
		}while(inputNumber != 1);
		
		println("The process took " + processCounter + " to reach 1");
	}
}

