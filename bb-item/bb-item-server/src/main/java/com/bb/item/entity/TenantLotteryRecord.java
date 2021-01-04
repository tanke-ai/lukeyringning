package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tenant_lottery_record")
public class TenantLotteryRecord {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long tenantId;
    private Long channelId;
    //游戏类别
    private Integer catId;
    //开奖时间
    private String lotteryTime;
    //开奖期号
    private String lotteryIssue;
    //开奖记录
    private String lotteryRecord;
    //0下架 1上架
    private Long status;

    //0 、没有删除 1、删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;










}