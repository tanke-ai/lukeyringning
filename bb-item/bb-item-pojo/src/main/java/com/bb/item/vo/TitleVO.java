package com.bb.item.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Tanke
 * @date  2020/11/3
 * @desc :
 */
@Data
public class TitleVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long Uid;
    private String title;
    private String image;
    private String time;
    private String url;

}
    
 