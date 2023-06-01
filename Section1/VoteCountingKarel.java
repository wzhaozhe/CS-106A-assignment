/*
* File: VoteCountingKarel.java
* ----------------------------
* The VoteCountingKarel subclass cleans out the chad from
* a ballot as described in the section handout.
*/


import stanford.karel.*;

public class VoteCountingKarel extends SuperKarel {
	public void run(){
		while(frontIsClear()){
			move();
			if(noBeepersPresent()){
				cleanCard();
			}
			move();
		}
	}
	
	public void cleanCard(){
		turnLeft();
		beeperPick();
		beeperPick();
		turnRight();
	}
	
	public void beeperPick(){
		move();
		while(beepersPresent()){
			pickBeeper();
		}
		turnAround();
		move();
	}
}