/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		//print the question
        println("Enter values to compute Pythagorean theorem.");
        
        //read what user enter
        print("a: ");
        int a = readInt();
        print("b: ");
        int b = readInt();
        
        //print out the result
        println("c: " + Math.sqrt(a * a + b * b));
	}
}
