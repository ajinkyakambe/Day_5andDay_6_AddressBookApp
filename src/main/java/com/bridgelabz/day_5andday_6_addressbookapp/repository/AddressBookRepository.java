package com.bridgelabz.day_5andday_6_addressbookapp.repository;

import com.bridgelabz.day_5andday_6_addressbookapp.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Long> {
}
