package com.ldingyi.cloudaddress.controller;

import com.ldingyi.cloudaddress.entity.Address;
import com.ldingyi.cloudaddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @RequestMapping("/add")
    @ResponseBody
    public boolean add(Address address){
        return addressService.addAddress(address);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public boolean delete(int id){
        return addressService.delete(id);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Address> addressList(int uid){
        return addressService.listAllAddresses(uid);
    }
    @RequestMapping("/detail")
    @ResponseBody
    public Address datail(int id){
        return addressService.detail(id);
    }
}
