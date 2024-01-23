package com.started.demo.implementation;

import com.started.demo.core.IGameConsole;
import com.started.demo.core.IGameRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameRunner implements IGameRunner {

	List<IGameConsole> gameConsoles;
	
	
	@Override
	public void run(int i) {
		// TODO Auto-generated method stub
		
		System.out.println("\n" + this.gameConsoles.get(i));
		this.gameConsoles.get(i).right();
		this.gameConsoles.get(i).left();
		this.gameConsoles.get(i).down();
		this.gameConsoles.get(i).up();
		
		
	}
	
	public GameRunner(List<IGameConsole> gameConsoles) {
		this.gameConsoles = gameConsoles;
	}
	
	

}
