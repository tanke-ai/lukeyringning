package com.bb.item.vo;

import lombok.Data;

import java.util.Date;

@Data

public class GifRecordVo {


    private Integer id;

    private String title;
    private String image;

    private String url;
    private Long uid;

    private String mome;

    //0 、没有删除 1、删除
    private Long  deleteFlag;


    private Date gmtCreatedTime;


    private Date gmtModifiedTime;



}