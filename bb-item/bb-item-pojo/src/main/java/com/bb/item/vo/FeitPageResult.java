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
public class FeitPageResult implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long total;// 总条数
    private Long totalPage;// 总页数
    private Long size; // 每页条数
    private Long current;// 当前页
    private List<TestListVo> items;// 当前页数据

}
    
 