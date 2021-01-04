package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tenant_lottery_picture")
public class TenantLotteryPicture {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Long tenantId;
    private Long channelId;
    private Long partnerId;

    private String picUrl;

    //0下架 1上架
    private Integer status;

    //0 、没有删除 1、删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;










}