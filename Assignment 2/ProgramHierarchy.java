/*
 * File: ProgramHierarchy.java
 * Name: Zhaozhe Wu
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {    

	// Create some value which could not change in the process
	
	/** Width and height of each box*/
    private static final double CLASS_BOX_WIDTH = 140;
    private static final double CLASS_BOX_HEIGHT = 60;
    
    /** Space between each box*/
    private static final double BOX_HEIGHT_SPACE = 140;
    private static final double BOX_WIDTH_SPACE = 40;

    /** label text in the box, can easily change for future */
    private static final String PROGRAM_LABEL = "Program";
    private static final String GRAPHICS_PROGRAM_LABEL = "GraphicsProgram";
    private static final String CONSOLE_PROGRAM_LABEL = "ConsoleProgram";
    private static final String DIALOG_PROGRAM_LABEL = "DialogProgram";
    
    public void run() {
    	/** 
    	 * Actually, for create the box we also can divide by 
    	 * two parts, upper box which is programBox and lower 
    	 * boxes which are graphicsBox, consoleBox and dialogBox,
    	 * and you can make a loop for each part if we need, and
    	 * use BOX_WIDTH_SPACE and BOX_HEIGHT_SPACE to measure x
    	 * and y for each box, make it more changeable.
    	 * */
    	//Create the program box and add to canvas
        GRect programBox = createBox(getWidth() / 2 - CLASS_BOX_WIDTH / 2, getHeight() / 3 - CLASS_BOX_HEIGHT);
        addLabel(programBox, PROGRAM_LABEL);
        
        //Create graphics box and add to canvas
        GRect graphicsBox = createBox(programBox.getX() - CLASS_BOX_WIDTH - BOX_WIDTH_SPACE,
                                      programBox.getY() + CLASS_BOX_HEIGHT * 2);
        addLabel(graphicsBox, GRAPHICS_PROGRAM_LABEL);
        
        //Create console box and add to canvas
        GRect consoleBox = createBox(graphicsBox.getX() + BOX_WIDTH_SPACE + CLASS_BOX_WIDTH, graphicsBox.getY());
        addLabel(consoleBox, CONSOLE_PROGRAM_LABEL);
        
        //Create dialog box and add to canvas
        GRect dialogBox = createBox(consoleBox.getX() + BOX_WIDTH_SPACE + CLASS_BOX_WIDTH, consoleBox.getY());
        addLabel(dialogBox, DIALOG_PROGRAM_LABEL);
        
        // just gLine to connect two box
        connectBoxes(programBox, consoleBox);
        connectBoxes(programBox, graphicsBox);
        connectBoxes(programBox, dialogBox);
    }

    private GRect createBox(double x, double y) {
        GRect box = new GRect(x, y, CLASS_BOX_WIDTH, CLASS_BOX_HEIGHT);
        add(box);
        return box;
    }

    private void addLabel(GRect box, String labelText) {
        GLabel label = new GLabel(labelText);
        add(label, box.getX() + CLASS_BOX_WIDTH / 2 - label.getWidth() / 2,
             box.getY() + CLASS_BOX_HEIGHT / 2 + label.getHeight() / 2);
    }
    
    private void connectBoxes(GRect startBox, GRect endBox) {
        double startX = startBox.getX() + CLASS_BOX_WIDTH / 2;
        double startY = startBox.getY() + CLASS_BOX_HEIGHT;
        double endX = endBox.getX() + CLASS_BOX_WIDTH / 2;
        double endY = endBox.getY();
        GLine line = new GLine(startX, startY, endX, endY);
        add(line);
    }
}
