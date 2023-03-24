/*
 * File: FindRange.java
 * Name: Zhaozhe Wu
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {

	// create a sentinel number
	private static final int SENTINEL_NUMBER = 0;

	public void run() {
        // initialize variables
		boolean hasSentinelNumberBeenEntered = false;
		boolean hasOnlyOneNumberBeenEntered = false;
		int largestNumber = 0;
		int smallestNumber = 0;
		int inputNumber = 0;
		
        // prompt user for input
		println("This program finds the largest and smallest numbers.");
		do{
			print("?");
			inputNumber = readInt();
			
			// if only have one number been entered, whatever it is negative or positive number
			if(!hasOnlyOneNumberBeenEntered) {
				largestNumber = inputNumber;
				smallestNumber = inputNumber;
				hasOnlyOneNumberBeenEntered = true;
			}
			
            // update largest and smallest numbers
			if (inputNumber != SENTINEL_NUMBER) {
                if (inputNumber > largestNumber || inputNumber == smallestNumber) {
                    largestNumber = inputNumber;
                }
                if (inputNumber < smallestNumber || smallestNumber == SENTINEL_NUMBER) {
                    smallestNumber = inputNumber;
                }
            }
			
			// print out the result
			if(inputNumber == SENTINEL_NUMBER) {
				if(smallestNumber == SENTINEL_NUMBER) {
					println("Please enter at least one number before enter sentinel number.");
				}
				else {
					hasSentinelNumberBeenEntered = true;
					println("smallest:" + smallestNumber);
					println("largest:" + largestNumber);
				}
			}
			
		}while(!hasSentinelNumberBeenEntered);
	}
}
