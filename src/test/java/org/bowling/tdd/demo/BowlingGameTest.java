package org.bowling.tdd.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingGameTest {

	@Test
	public void computeScoreForGameOfAllOnes() {
		BowlingGame game = new BowlingGame();
		for (int i = 0; i < 20; i++) {
			game.calculateTotalNumberOfPinsDown(1);
		}
		assertEquals(20, game.getTotalScore());
	}

}
