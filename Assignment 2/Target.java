/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	

	private static final double BIG_CIRCLE_RADIUS = 72;
	private static final double MEDIUM_CIRCLE_RADIUS = BIG_CIRCLE_RADIUS * 0.65;
	private static final double SMALL_CIRCLE_RADIUS = BIG_CIRCLE_RADIUS * 0.3;
	
	public void run() {
		// Create center point
		GPoint center = new GPoint(getWidth() / 2.0, getHeight() / 2.0);
		GOval bigCircle = new GOval(BIG_CIRCLE_RADIUS * 2, BIG_CIRCLE_RADIUS * 2);
		GOval mediumCircle = new GOval(MEDIUM_CIRCLE_RADIUS * 2, MEDIUM_CIRCLE_RADIUS * 2);
		GOval smallCircle = new GOval(SMALL_CIRCLE_RADIUS * 2, SMALL_CIRCLE_RADIUS * 2);
		
		// Set circle color
		bigCircle.setColor(Color.RED);
		bigCircle.setFilled(true);
		bigCircle.setFillColor(Color.RED);
		
		mediumCircle.setColor(Color.WHITE);
		mediumCircle.setFilled(true);
		mediumCircle.setFillColor(Color.WHITE);
		
		smallCircle.setColor(Color.RED);
		smallCircle.setFilled(true);
		smallCircle.setFillColor(Color.RED);
		
		add(bigCircle, center.getX() - BIG_CIRCLE_RADIUS, center.getY() - BIG_CIRCLE_RADIUS);
		add(mediumCircle, center.getX() - MEDIUM_CIRCLE_RADIUS, center.getY() - MEDIUM_CIRCLE_RADIUS);
		add(smallCircle, center.getX() - SMALL_CIRCLE_RADIUS, center.getY() - SMALL_CIRCLE_RADIUS);
	}
}
