package org.bowling.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BowlingGameTest {

	BowlingGame game = null;
	
	@BeforeEach
	public void initialize() {
		game = new BowlingGame();
	}
	
	@Test
	public void computeScoreForGameOfAllOnes() {
		int score[] = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
		
		setPinDownsPerRoll(score);
		
		assertEquals(20, game.getTotalScore());
	}
	
	@Test
	public void computeScoreForGameWithSpareAndRestAllOnes() {
		int score[] = {5,5, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
		
		setPinDownsPerRoll(score);
		
		assertEquals(29, game.getTotalScore());
	}
	
	@Test
	public void computeScoreForGameWithSpareFollowedByDifferentScore() {
		int score[] = {5,5, 3,4, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		
		setPinDownsPerRoll(score);
		
		assertEquals(22, game.getTotalScore());
	}
	
	@Test
	public void computeScoreForGameWithAStrike() {
		int score[] = {10,0, 3,4, 1,1, 4,4, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
		
		setPinDownsPerRoll(score);
		
		assertEquals(34, game.getTotalScore());
	}
	
	@Test
	public void computeScoreForGameWithAStrikeinLastFrame() {
		int score[] = {10,0, 3,4, 1,1, 4,4, 0,0, 0,0, 0,0, 0,0, 0,0, 10,0, 6, 1};
		
		setPinDownsPerRoll(score);
		
		assertEquals(51, game.getTotalScore());
	}

	private void setPinDownsPerRoll(int[] score) {
		for (int i = 0; i < score.length; i++) {
			game.setPinsDownPerRoll(i, score[i]);
		}
	}

}
