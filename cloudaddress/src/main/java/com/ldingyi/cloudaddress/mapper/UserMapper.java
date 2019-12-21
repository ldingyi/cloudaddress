package com.ldingyi.cloudaddress.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ldingyi.cloudaddress.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
    User findUserByPhoneAndPassword(@Param("user") User user);
    User findUserByPhone(@Param("user") User user);

}
