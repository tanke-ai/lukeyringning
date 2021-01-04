package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tenant_lottery_cat")
public class TenantLotteryCat  {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Long tenantId;
    private Long channelId;
    private Long partnerId;

    private String catName;

    //0下架 1上架
    private Long status;

    //0 、没有删除 1、删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;










}