package com.started.demo;
import com.started.demo.implementation.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("com.started.demo.implementation")
public class GameApplication {

	static <T> void print(T input){
		System.out.println(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameApplication.class);
		Arrays.stream(context.getBeanDefinitionNames())
				.forEach(res -> print(res));

		context.getBean(GameRunner.class).run(2);

	}

}
