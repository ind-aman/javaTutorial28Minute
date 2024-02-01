package com.started.demo.implementation.records;


import org.springframework.stereotype.Component;

@Component
public class AadharCard {
    int id;
    Address address;

    PersonalDetail personDetail;

    public void print(){
        System.out.println("Id: "+ this.id);
        personDetail.print();
        address.print();
    }

    public AadharCard(Address address, PersonalDetail personDetail){
        this.id = 0;
        this.address = address;
        this.personDetail = personDetail;
    }
}
