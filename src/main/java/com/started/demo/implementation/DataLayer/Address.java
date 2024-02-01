package com.started.demo.implementation.records;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;

    String country;
    Integer pincode;

    public void print(){
        System.out.println("City: "+this.city +"\nCountry: " + this.country + "\nPincode: "+ this.pincode);
    }

    public Address(String city, String country, int pincode){
        this.city =city;
        this.country = country;
        this.pincode = pincode;
    }
    public  Address(){
        this.city = "Unknown";
        this.country = "India";
        this.pincode = 0;
    }
}
