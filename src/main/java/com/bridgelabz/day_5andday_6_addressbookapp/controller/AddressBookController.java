package com.bridgelabz.day_5andday_6_addressbookapp.controller;

import com.bridgelabz.day_5andday_6_addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.day_5andday_6_addressbookapp.dto.ResponseDTO;
import com.bridgelabz.day_5andday_6_addressbookapp.model.AddressBookData;
import com.bridgelabz.day_5andday_6_addressbookapp.services.IAddressBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @Autowired
    private IAddressBook addressBookService;


    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> personDataList = null;
        personDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successfull", personDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("personId") long personId) {
//        List<AddressBookData> personDataList = null;
        Optional <AddressBookData> personData = null;
        personData = addressBookService.getAddressBookDataById(personId);
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successfull ", personData);
        return  new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(
                            @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully", personData);
        return  new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("personId") long personId,
            @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData personData = null;
        personData = addressBookService.updateAddressBookData(personId, addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully", personData);
        return  new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }


    @DeleteMapping("delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("personId")long personId) {
        addressBookService.deleteAddressBookData(personId);
        ResponseDTO respDTO = new ResponseDTO("Deleted Address book entry successfully", "Deleted Id : " +personId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
