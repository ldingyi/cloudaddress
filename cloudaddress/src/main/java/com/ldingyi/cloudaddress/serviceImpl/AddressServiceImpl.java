package com.ldingyi.cloudaddress.serviceImpl;

import com.ldingyi.cloudaddress.entity.Address;
import com.ldingyi.cloudaddress.mapper.AddressMapper;
import com.ldingyi.cloudaddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("personService")
@Transactional
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressMapper addressMapper;

    @Override
    public boolean addAddress(Address address) {
        try {
            addressMapper.insert(address);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean delete(int id) {
        try {
            addressMapper.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public List<Address> listAllAddresses(int uid) {
        return addressMapper.listAllAddresses(uid);
    }

    @Override
    public Address detail(int id) {
        return addressMapper.selectById(id);
    }
}
