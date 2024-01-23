package com.started.demo;
import com.started.demo.core.IGameConsole;
import com.started.demo.core.IGameRunner;
import com.started.demo.implementation.GameRunner;
import com.started.demo.implementation.MarioGame;
import com.started.demo.implementation.PackmanGame;
import com.started.demo.implementation.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;


@Configuration
public class GameApplication {

	@Bean(name="MarioGame")
	public IGameConsole MarioGame(){
		return new MarioGame();
	}
	@Bean
	public  IGameConsole PackmanGame(){
		return new PackmanGame();
	}

	@Bean
	public IGameConsole SuperContra(){
		return  new SuperContraGame();
	}

	@Bean(name = "RunMario")
	@Primary
	public IGameRunner gameRunner(IGameConsole MarioGame) {
		return new GameRunner(MarioGame);
	}

	@Bean(name="RunPackman")
	public IGameRunner gameRunner1(){
		return  new GameRunner(PackmanGame());
	}

	@Bean(name = "RunSuperContra")
	public IGameRunner gameRunner2(){
		return new GameRunner(SuperContra());
	}
	static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameApplication.class);


		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(res -> print(res));

		context.getBean(IGameRunner.class).run();
		((IGameRunner)context.getBean("RunPackman")).run();  //I need to explict typcasting if i'm calling bean with string
		((IGameRunner)context.getBean("RunSuperContra")).run();
		((IGameRunner)context.getBean("RunMario")).run();
	}

}
