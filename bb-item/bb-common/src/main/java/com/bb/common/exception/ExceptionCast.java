package com.bb.common.exception;



import com.bb.common.response.ResultCode;
import com.bb.common.response.ResultInfo;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Administrator
 * @version 1.0
 * @create 2018-09-14 17:31
 **/
@Slf4j
public class ExceptionCast {

    public static void cast(ResultCode resultCode)     {
        throw new CustomException(resultCode);
    }

    public static void castFail(String mes){
        log.info("失败信息：{}", mes);
        ResultInfo resultInfo = new ResultInfo(false,11111,mes);
        throw new CustomException(resultInfo);
    }

    public static void castInvalid(String mes){
        log.info("失败信息：{}", mes);
        ResultInfo resultInfo = new ResultInfo(false,11111,mes);
        throw new CustomException(resultInfo);
    }
}
