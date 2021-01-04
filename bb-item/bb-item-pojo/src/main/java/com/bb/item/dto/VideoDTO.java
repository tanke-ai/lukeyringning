package com.bb.item.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Tanke
 * @date  2020/11/3
 * @desc :
 */
@Data
public class VideoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String title;
    private String tag;
    private String video;

}
    
 