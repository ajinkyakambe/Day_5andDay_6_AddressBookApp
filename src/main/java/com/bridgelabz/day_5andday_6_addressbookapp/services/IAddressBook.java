package com.bridgelabz.day_5andday_6_addressbookapp.services;

import com.bridgelabz.day_5andday_6_addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.day_5andday_6_addressbookapp.model.AddressBookData;

import java.util.List;
import java.util.Optional;


public interface IAddressBook {

    List<AddressBookData> getAddressBookData();

    Optional<AddressBookData> getAddressBookDataById(long personId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(long personId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(long personId);
}
