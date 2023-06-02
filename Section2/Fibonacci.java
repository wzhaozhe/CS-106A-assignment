/*
 * File: Fibonacci.java
 * Name: Zhaozhe Wu
 * Section Leader: 
 * -----------------------------
 * This program will displays the terms in the Fibonacci sequence.
 */

import acm.program.*;

public class Fibonacci extends ConsoleProgram{
	
	private int MAX_TERM = 10000;
	
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int term1 = 0;
		int term2 = 1;
		while(term1 < MAX_TERM){
			println(term1);
			int term3 = term1 + term2;
			term1 = term2;
			term2 = term3;
		}
	}
}
