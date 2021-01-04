package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("news_record")
public class NewsRecord {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String image;
    private String time;
    private String title;
    private String newsBody;
    private String url;

    //0下架 1上架
    private Long uid;

    //0 、没有删除 1、删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;



}