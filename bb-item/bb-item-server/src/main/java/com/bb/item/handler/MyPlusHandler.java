package com.bb.item.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Tanke
 * @date  2020/10/21
 * @desc :
 */
@Slf4j
@Component
public class MyPlusHandler implements MetaObjectHandler {
    //插入时候的更新策略
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill");
        this.setFieldValByName("gmtCreatedTime",new Date(),metaObject);
        this.setFieldValByName("gmtModifiedTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill");
        this.setFieldValByName("gmtModifiedTime",new Date(),metaObject);
    }
}
    
 