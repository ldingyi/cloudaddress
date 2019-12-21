package com.ldingyi.cloudaddress.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ldingyi.cloudaddress.entity.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper extends BaseMapper<Address> {
    List<Address> listAllAddresses(@Param("uid") int uid);
    String findNameByPhone(@Param("phone") String phone);
}
