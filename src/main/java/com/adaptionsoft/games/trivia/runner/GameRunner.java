
package com.adaptionsoft.games.trivia.runner;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.LegacyGame;


public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		LegacyGame aGame = new LegacyGame();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		Random rand = new Random();

		do {

			aGame.roll(rand.nextInt(5) + 1);

			if (rand.nextInt(9) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.rightAnswer();
			}



		} while (notAWinner);

	}
}
