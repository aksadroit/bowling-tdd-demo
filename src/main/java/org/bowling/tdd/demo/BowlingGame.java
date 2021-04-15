package org.bowling.tdd.demo;

public class BowlingGame {
	
	private Integer score = 0;
	
	public void calculateTotalNumberOfPinsDown(int pinDownCount) {
		score += pinDownCount;
	}

	public Integer getTotalScore() {
		return score;
	}

}
