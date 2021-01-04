package com.bb.item.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Test_list")
public class TestListVo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    private Integer number;
    private Integer one;
    private Integer two;
    private Integer three;
    private Integer four;
    private Integer five;
    private Integer six;
    private Integer seven;
    private Integer eight;
    private Integer nine;
    private Integer ten;

    private Integer spacial;

    //状态
    private Long status;
    //0 、没有删除 1、删除
    private Long deleteFlag;
    //备注
    private String memo;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;


}