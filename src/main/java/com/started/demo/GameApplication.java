package com.started.demo;

import com.started.demo.game.MarioGame;

public class GameApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
