package com.started.demo;

import com.started.demo.game.MarioGame;

public class GameRunner {
	MarioGame marioGame;
	
	//method
	public void run() {
		System.out.print("Game is Runnning" + this.marioGame);
	}
	
	//Constructor
	public GameRunner(MarioGame marioGame) {
		this.marioGame = marioGame;
	}
}
