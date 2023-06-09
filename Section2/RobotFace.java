/*
 * File: RobotFace.java
 * Name: Zhaozhe Wu
 * -----------------------
 * This file will draw a robot face by acm library
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {
	
	private static final double HEAD_WIDTH = 100;
	private static final double HEAD_HEIGHT = 150;
	private static final double EYE_RADIUS = 10;
	private static final double MOUTH_WIDTH = 60;
	private static final double MOUTH_HEIGHT = 20;
	
	public void run(){
		addFace(getWidth() / 2, getHeight() / 2);
	}
	
	public void addFace(double cx, double cy){
		addHead(cx, cy);
		addEye(cx - HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
		addEye(cx + HEAD_WIDTH / 4, cy - HEAD_HEIGHT / 4);
		addMouth(cx, cy + HEAD_HEIGHT / 4);
	}
	
	public void addHead(double cx, double cy){
		double x = cx - HEAD_WIDTH / 2;
		double y = cy - HEAD_HEIGHT / 2;
		GRect head = new GRect(x, y, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	
	public void addEye(double cx, double cy){
		double x = cx - EYE_RADIUS;
		double y = cy - EYE_RADIUS;
		GOval eye = new GOval(x, y, 2 * EYE_RADIUS, 2 * EYE_RADIUS);
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		add(eye);
	}
	
	public void addMouth(double cx, double cy){
		double x = cx - MOUTH_WIDTH / 2;
		double y = cy - MOUTH_HEIGHT / 2;
		GRect mouth = new GRect(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add(mouth);
	}
}
