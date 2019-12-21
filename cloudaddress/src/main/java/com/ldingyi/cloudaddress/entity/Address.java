package com.ldingyi.cloudaddress.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("address")
public class Address {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String phone;
    private String clazz;
    private char nindex;
    private Integer uid;
}
