package com.bb.item.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tenant_lottery_video")
public class TenantLotteryVideo {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    //标题
    private String title;
    //视频封面
    private String tag;
    //视频标签
    private String video;

    //0下架 1上架
    private Long status;

    //0 、没有删除 1、删除
    @TableLogic //逻辑删除
    private Long  deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreatedTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModifiedTime;










}