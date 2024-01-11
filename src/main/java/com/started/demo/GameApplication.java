package com.started.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.started.demo.configuration.GameConfiguration;
import com.started.demo.implementation.records.Address;



public class GameApplication{
	
	private static <T> void print(String name,T value) {
		System.out.println(name+": "+value);
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
		
		print("Name",context.getBean("name"));
		print("Age",context.getBean("age"));
		print("Address",context.getBean(Address.class));
		print("Aadhar",context.getBean("getAadhar"));
		
	}

}
