package com.bb.item.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Tanke
 * @date  2020/11/3
 * @desc :
 */
@Data
public class PicturePageResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long total;// 总条数
    private Long totalPage;// 总页数
    private Long size; // 每页条数
    private Long current;// 当前页
    private List<TenantLotteryPictureVo> items;// 当前页数据

}
    
 