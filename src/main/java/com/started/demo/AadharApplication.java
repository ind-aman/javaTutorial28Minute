package com.started.demo;

import com.started.demo.implementation.records.AadharCard;
import com.started.demo.implementation.records.Address;
import com.started.demo.implementation.records.PersonalDetail;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan("com.started.demo.implementation.records")
public class AadharApplication {
	
	private static <T> void print(String name,T value) {
		System.out.println(name+": "+value);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AadharApplication.class);

		Arrays.stream(context.getBeanDefinitionNames()).forEach((res)->{print("Bean Name:",res);});

		System.out.println("\n");
		context.getBean(AadharCard.class).print();
	}
}
