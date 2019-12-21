package com.ldingyi.cloudaddress.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@NoArgsConstructor
@TableName("chat")
public class Chat {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String message;
    private String send;
    private String  receiver;
    private Date time;
}
