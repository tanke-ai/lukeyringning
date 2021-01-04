package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("liuhe_detail_record")
public class LiuheDetailRecord {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;
    private String issue;

    private String body;

    //状态
    private Long  status;
    //0 、没有删除 1、删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;



}