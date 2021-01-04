package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("gif_record")
public class GifRecord {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;
    private String image;

    private String url;
    private Long uid;
    private String mome;


    private String gifDetail;

    //0 、没有删除 1、删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;



}