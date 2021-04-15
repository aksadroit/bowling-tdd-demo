package org.bowling.tdd.demo;

public class BowlingGame {
	
	private Integer score = 0;
	private int[] scorePerRoll = new int[20];
	
	public void setPinsDownPerRoll(int rollCount, int pinsDown) {
		scorePerRoll[rollCount] = pinsDown;
		
	}
	
	public void calculateTotalNumberOfPinsDown(int pinDownCount) {
		score += pinDownCount;
	}

	public Integer getTotalScore() {
		int roll = 0;
		for (int i = 0; i < 10; i++) {
			if (scorePerRoll[roll] + scorePerRoll[roll+1] == 10) {
				// it is spare
				score += 10 + scorePerRoll[roll+2];
			} else {
				score += scorePerRoll[roll] + scorePerRoll[roll+1];	
			}
			roll += 2;
		}
		return score;
	}

}
