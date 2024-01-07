package com.started.demo;

import com.started.demo.core.IGameConsole;
import com.started.demo.core.IGameRunner;

import com.started.demo.implementation.PackmanGame;
import com.started.demo.implementation.GameRunner;
import com.started.demo.implementation.MarioGame;
import com.started.demo.implementation.SuperContraGame;


public class GameApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IGameConsole game = new PackmanGame();
		IGameConsole game1 = new MarioGame();
		IGameConsole game2 = new SuperContraGame();
		
		IGameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
		
		gameRunner = new GameRunner(game1);
		gameRunner.run();
		
		gameRunner = new GameRunner(game2);
		gameRunner.run();
		
		
		
		
	}

}
