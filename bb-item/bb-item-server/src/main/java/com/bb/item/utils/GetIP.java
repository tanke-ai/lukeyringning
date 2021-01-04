package com.bb.item.utils;

import com.alibaba.fastjson.JSON;
import com.bb.common.constants.FUriConstant;
import com.bb.item.dto.getip.IPBean;
import com.bb.item.dto.getip.IpData;
import com.bb.item.mapper.TenantLotteryCatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author Tanke
 * @date  2020/11/11
 * @desc :
 */

public class GetIP {


     public static IPBean getIP( ) throws IOException, InterruptedException {

         ResponeVo responeVo = HttpUtils.get(FUriConstant.IPBEAN);
        String entity = responeVo.getContent();

         return JSON.parseObject(entity, IPBean.class);
    }

}
    
 