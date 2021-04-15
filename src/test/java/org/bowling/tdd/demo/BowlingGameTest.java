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
		for (int i = 0; i < 20; i++) {
			game.calculateTotalNumberOfPinsDown(1);
		}
		assertEquals(20, game.getTotalScore());
	}
	
	@Test
	public void computeScoreForGameWithSpareAndRestAllOnes() {
		game.calculateTotalNumberOfPinsDown(5);
		game.calculateTotalNumberOfPinsDown(5);
		for (int i = 2; i <= 20; i++) {
			game.calculateTotalNumberOfPinsDown(1);
		}
		assertEquals(29, game.getTotalScore());
	}

}
