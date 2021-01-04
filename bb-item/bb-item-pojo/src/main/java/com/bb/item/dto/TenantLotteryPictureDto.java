package com.bb.item.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class TenantLotteryPictureDto extends Page implements Serializable {

    private static final long serialVersionUID = 1L;
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