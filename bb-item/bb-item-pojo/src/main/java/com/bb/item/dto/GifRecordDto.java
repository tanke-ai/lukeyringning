package com.bb.item.dto;

import lombok.Data;

import java.util.Date;

@Data

public class GifRecordDto {


    private Integer id;

    private String title;
    private String image;

    private String url;


    private String mome;
    private String gifDetail;
    private Long uid;
    //0 、没有删除 1、删除
    private Long  deleteFlag;


    private Date gmtCreatedTime;


    private Date gmtModifiedTime;



}