package com.started.demo.implementation;

import com.started.demo.core.IGameConsole;
import com.started.demo.core.IGameRunner;

public class GameRunner implements IGameRunner {

	IGameConsole gameConsole;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("\n" + this.gameConsole);
		this.gameConsole.right();
		this.gameConsole.left();
		this.gameConsole.down();
		this.gameConsole.up();
		
		
	}
	
	public GameRunner(IGameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	

}
