package com.bb.item.dto;

import lombok.Data;

@Data
public class PicturePage {


    private Integer current; //当前查询的是多少页

    private Long size;; //从前台传过来的表示每页的大小

    private Long start; //分页时从哪一条数据开始接受数据


}