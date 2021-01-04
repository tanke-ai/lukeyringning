package com.bb.common.enums;

import lombok.Getter;

@Getter
public enum ExceptionEnum {
    DATA_IS_NULL(500, "为查询到数据！"),
    CATEGORY_NOT_FOND(204, "对应的分类不存在！"),
    DATA_TRANSFER_ERROR(500, "從缓存获取数据失败！"),
    INVALID_FILE_TYPE(204, "图片类型有误！"),
    INSERT_OPERATION_FAIL(500, "插入数据失败！"),
    FILE_UPLOAD_ERROR(500, "文件上传失败！"),
    BRAND_NOT_FOUND(204, "该不存在！"),
    INSET_VIDEO_FAIL(500, "视频存入失败"),
    DELET_VIDEO_FAIL(500, "视频删除失败"),
    NO_LATEST_NEWS(204, "暂时无最新新闻");


    private int status;
    private String message;

    ExceptionEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }
}