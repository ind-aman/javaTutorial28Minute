package com.started.demo.implementation;

import com.started.demo.core.IGameConsole;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements IGameConsole {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Crouch");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Shoot...");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Block");
	}

}
