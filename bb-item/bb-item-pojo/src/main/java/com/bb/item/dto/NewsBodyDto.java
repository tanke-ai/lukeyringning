package com.bb.item.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Tanke
 * @date  2020/10/31
 * @desc : 新闻数据
 */
@Data
public class NewsBodyDto extends XinwenDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String newsBody;




}
    
 