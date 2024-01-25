package com.started.demo.implementation.records;

import org.springframework.stereotype.Component;

@Component
public class PersonalDetail {
    public String Name;
    public  int Age;

    public void print(){
        System.out.println("Name: "+ this.Name + "\nAge: "+ this.Age);
    }

    public PersonalDetail(){
        this.Name ="Not Provided";
        this.Age = 0;
    }



    public  PersonalDetail(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
}
