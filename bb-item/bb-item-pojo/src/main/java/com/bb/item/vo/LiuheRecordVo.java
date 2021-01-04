package com.bb.item.vo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class LiuheRecordVo {

    private Integer id;

    private String title;
    private String issue;

    private String body;

    //状态
    private Long  status;
    //0 、没有删除 1、删除
    private Long  deleteFlag;


    private Date gmtCreatedTime;


    private Date gmtModifiedTime;



}