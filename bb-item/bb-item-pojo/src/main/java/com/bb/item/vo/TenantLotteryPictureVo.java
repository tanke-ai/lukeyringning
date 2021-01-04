package com.bb.item.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.Date;

@Data
public class TenantLotteryPictureVo extends Page {


    private Integer id;

    private Long tenantId;
    private Long channelId;
    private Long partnerId;

    private String picUrl;

    //0下架 1上架
    private Integer status;

    //0 、没有删除 1、删除
    private Long  deleteFlag;


    private Date gmtCreatedTime;

    private Date gmtModifiedTime;










}