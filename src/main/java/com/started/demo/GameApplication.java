package com.started.demo;
import com.started.demo.Configuration.GameConfiguration;
import com.started.demo.core.IGameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;


public class GameApplication {

	static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);

		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(res -> print(res));

		context.getBean(IGameRunner.class).run();
		((IGameRunner)context.getBean("RunPackman")).run();
		((IGameRunner)context.getBean("RunSuperContra")).run();
		((IGameRunner)context.getBean("RunMario")).run();
	}

}
