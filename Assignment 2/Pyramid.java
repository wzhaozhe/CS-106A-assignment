/*
 * File: Pyramid.java
 * Name: Zhaozhe Wu
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	public void run() {
		// loop for the level of pyramid
		for (int i = 0; i < BRICKS_IN_BASE; i++) {
			// loop for number of the brick of each level 
			for (int j = 0; j < BRICKS_IN_BASE - i; j++) {
				/** start point should be in the bottom of the label,
				 * and first level (base) should have 14 bricks, and 
				 * each level higher make one brick less, so have to move 
				 * half brick width to right.
				 */
				double x = (getWidth() - (BRICKS_IN_BASE * BRICK_WIDTH)) / 2 + 
							(j * BRICK_WIDTH) + (i * BRICK_WIDTH) / 2;
				double y = getHeight() - (i * BRICK_HEIGHT);

				GRect rect = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				add(rect);
			}
		}
	}
}
