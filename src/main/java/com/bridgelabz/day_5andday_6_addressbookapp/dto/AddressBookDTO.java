package com.bridgelabz.day_5andday_6_addressbookapp.dto;

public class AddressBookDTO {

    public String name;
    public String address;
    public String city;
    public String state;
    public long zipCode;
    public long phoneNumber;


    public AddressBookDTO(String name, String address, String city, String state, long zipCode, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}



