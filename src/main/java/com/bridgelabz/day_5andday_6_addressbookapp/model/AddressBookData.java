package com.bridgelabz.day_5andday_6_addressbookapp.model;

import com.bridgelabz.day_5andday_6_addressbookapp.dto.AddressBookDTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressBookData {
    @Id
    private long personId;
    private String name;
    private String address;
    private String city;
    private String state;
    private long zipCode;
    private long phoneNumber;

    public AddressBookData(long personId, AddressBookDTO addressBookDTO) {
        this.personId = personId;
        this.name = addressBookDTO.name;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zipCode = addressBookDTO.zipCode;
        this.phoneNumber = addressBookDTO.phoneNumber;
    }

    public AddressBookData() {

    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getphoneNumber() {
        return phoneNumber;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public void setphoneNumber(long phoneNo) {
        this.phoneNumber = phoneNumber;
    }
}
