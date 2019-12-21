package com.ldingyi.cloudaddress.service;

import com.ldingyi.cloudaddress.entity.Address;

import java.util.List;

public interface AddressService {
    boolean addAddress(Address address);
    boolean delete(int id);
    List<Address> listAllAddresses(int uid);
    Address detail(int id);
}
