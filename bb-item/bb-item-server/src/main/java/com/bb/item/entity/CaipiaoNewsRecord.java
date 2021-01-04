package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("caipiao_news_record")
public class CaipiaoNewsRecord {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String time;
    private String title;
    private String image;

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