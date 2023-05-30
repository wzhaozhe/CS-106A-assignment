/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
//	public void run(){
//		boolean endChecker = false;
//		while(!endChecker){
//			setFaceNorth();
//			repairMissingStone();
//			
//			if(rightIsBlocked()){
//				setFaceSouth();
//				while(frontIsClear()){
//					move();
//				}
//				break;
//			}
//			
//			setFaceEast();
//			move();
//			move();
//			move();
//			move();
//			
//			setFaceSouth();
//			repairMissingStone();
//			
//			if(leftIsClear()){
//				setFaceEast();
//				move();
//				move();
//				move();
//				move();
//			}
//			else{
//				endChecker = true;
//			}
//			
//			setFaceEast();
//		}
//	}
//	
//	public void repairMissingStone(){
//		if(noBeepersPresent()){
//			putBeeper();
//		}
//		while(frontIsClear()){
//			move();
//			if(noBeepersPresent()){
//				putBeeper();
//			}
//		}
//	}
//	
//	public void setFaceNorth(){
//		while(notFacingNorth()){
//			turnLeft();
//		}
//	}
//	
//	public void setFaceSouth(){
//		while(notFacingSouth()){
//			turnLeft();
//		}
//	}
//	
//	public void setFaceEast(){
//		while(notFacingEast()){
//			turnLeft();
//		}
//	}
	
	//Those codes are working, but let's try something more efficient.
	public void run(){
		boolean endChecker = false;
		while(!endChecker){
			setFaceNorth();
			repairMissingStone();
			while(frontIsClear()){
				move();
				repairMissingStone();
			}
			
			setFaceSouth();
			while(frontIsClear()){
				move();
			}
			
			setFaceEast();
			if(frontIsClear()){
				move();
				move();
				move();
				move();
			}
			else if(frontIsBlocked()){
				endChecker = true;
			}
		}
	}
	
	public void repairMissingStone(){
		if(noBeepersPresent()){
			putBeeper();
		}
	}
	
	public void setFaceNorth(){
		while(notFacingNorth()){
			turnLeft();
		}
	}
	
	public void setFaceSouth(){
		while(notFacingSouth()){
			turnLeft();
		}
	}
	
	public void setFaceEast(){
		while(notFacingEast()){
			turnLeft();
		}
	}

}
