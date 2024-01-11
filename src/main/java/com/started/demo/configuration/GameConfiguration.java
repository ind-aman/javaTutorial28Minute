package com.started.demo.configuration;

import java.util.*;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.started.demo.implementation.records.*;



@Configuration
public class GameConfiguration {

	@Bean
	public String name(AadharCard getaadhar) {
		
		return getaadhar.personDetail().name(); //Parameter method to call bean
	}
	
	@Bean  //calling this bean by method name
	public int age() {  
		return aadhar().personDetail().age(); //function calling method for wiring bean
	}
	
	/* -- A Bean can be called by its method name and 
	 * -- by a name we added in the Bean 
	 */
	@Bean //calling this bean by class name
	public Address address(AadharCard getAadhar) { 
		return getAadhar.address();
	}
	
	@Bean(name="getAadhar")
	public AadharCard aadhar() {
		PersonalDetail personDetail = new PersonalDetail("Aman kumar",23);
		Address address = new Address("Saharanpur","India",247452);
		AadharCard aadharCard = new AadharCard(1,address, personDetail);
		return aadharCard;
	}
}
