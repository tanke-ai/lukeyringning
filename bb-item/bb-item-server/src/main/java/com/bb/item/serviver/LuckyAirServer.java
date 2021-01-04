package com.bb.item.serviver;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bb.common.utils.BeanHelper;
import com.bb.item.entity.TestList;
import com.bb.item.feiting.JsonRootBean;
import com.bb.item.mapper.TestListMapper;
import com.bb.item.utils.HttpUtils;
import com.bb.item.utils.MyBeanUtil;
import com.bb.item.utils.ResponeVo;
import com.bb.item.vo.*;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.VariableElement;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 首页的service层
 */
@Slf4j
@Service
public class LuckyAirServer {


    @Autowired
    private TestListMapper testListMapper;
    @Autowired
    private StringRedisTemplate redis;


    //幸运飞艇
    public boolean ring() throws IOException, InterruptedException {
        String s1 = redis.opsForValue().get("feiting:ringkey");
        if(StringUtils.isEmpty(s1)){
            redis.opsForValue().set("feiting:ringkey", String.valueOf(5));
            return false;
        }
        TestList testList = testListMapper.selectOne(new QueryWrapper<TestList>().orderByDesc("gmt_created_time") .last("limit 1"));
         List<Integer> list = new ArrayList<>();
         list.add(testList.getOne()); list.add(testList.getTwo()); list.add(testList.getThree()); list.add(testList.getFour());
         list.add(testList.getFive()); list.add(testList.getSix()); list.add(testList.getSeven()); list.add(testList.getEight());
        list.add(testList.getNine()); list.add(testList.getTen());


        if (list.contains(Integer.parseInt(s1))){
            return true;
        }else {
            return false;
        }

    }


    public String setKey(String number,Integer value)   {
       String realValue=String.valueOf(5-value) ;
         redis.opsForValue().set("feiting:count:" +number, realValue);
         return  "设置成功";
    }

    //
    public FeitPageResult queryhistory(   ) throws Exception {
        IPage<TestList> vPage = testListMapper.selectPage(
                new Page<>(1,50 ),
                new QueryWrapper<TestList>()
                        .orderByDesc("id"));

         long total = vPage.getTotal();
        long size = vPage.getSize();
        long pages = vPage.getPages();
        long current = vPage.getCurrent();
        FeitPageResult pageResult = new FeitPageResult();
        pageResult.setTotal(total);
        pageResult.setSize(size);
        pageResult.setTotalPage(pages);
        pageResult.setCurrent(current);
        List<TestList> records = vPage.getRecords();

        List<TestListVo> videoDTOS = new ArrayList<>();
        for (TestList record : records) {
            TestListVo recordVo = BeanHelper.copyProperties(record, TestListVo.class);
            videoDTOS.add(recordVo);
        }
        pageResult.setItems(videoDTOS);


        return pageResult;
    }


    @Transactional
    public String feitin(   ) throws IOException, InterruptedException { //

        //获取最新数据
        ResponeVo responeVo = HttpUtils.get("https://api.apiose122.com/pks/getPksDoubleCount.do?date=&lotCode=10057");
        String result = responeVo.getContent();

        JsonRootBean jsonRootBean = JSON.parseObject(result, JsonRootBean.class);

          String NowArr = jsonRootBean.getResult().getData().getPreDrawCode();


        //缓存中的上期
        String last = redis.opsForValue().get("feiting:data");

        TestList testList = new TestList();

        if (!NowArr.equals(last)) {
            //最新数据设置到缓存
            redis.opsForValue().set("feiting:data", NowArr);
            if (null == last) {
                return "firstdata";
            }


            String[] Laslit = last.split(",");

            for (int i = 0; i < Laslit.length; i++) {

                //上期1号索引位置
                if ("01".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:01");
                    if(null==count) {
                        count= String.valueOf(0);
                    }
                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8 ) {

                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:01", ii + "");

                        testList.setOne(ii);

                    }else {

                        redis.opsForValue().set("feiting:count:01", 0 + "");
                        testList.setOne(0);

                    }

                }


                //上期1号索引位置
                if ("02".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:02");
                    if(null==count) {
                        count= String.valueOf(0);
                    }

                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) > 8 ) {




                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:02", ii + "");

                        testList.setTwo(ii);


                    }else {
                        redis.opsForValue().set("feiting:count:02", 0 + "");
                        testList.setTwo(0);

                    }

                }

                //上期1号索引位置
                if ("03".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:03");
                    if(null==count) {
                        count= String.valueOf(0);
                    }

                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) > 8  ) {



                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:03", ii + "");

                        testList.setThree(ii);
                    }else {

                        redis.opsForValue().set("feiting:count:03", 0 + "");
                        testList.setThree(0);
                    }

                }
                //上期1号索引位置
                if ("04".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:04");
                    if(null==count) {
                        count= String.valueOf(0);
                    }
                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8 ) {

                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:04", ii + "");

                        testList.setFour(ii);




                    }else {
                        redis.opsForValue().set("feiting:count:04", 0 + "");
                        testList.setFour(0);

                    }

                }
                //上期1号索引位置
                if ("05".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:05");
                    if(null==count) {
                        count= String.valueOf(0);
                    }

                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8 ) {




                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:05", ii + "");

                        testList.setFive(ii);


                    }else {
                        redis.opsForValue().set("feiting:count:05", 0 + "");
                        testList.setFive(0);

                    }

                }
                //上期1号索引位置
                if ("06".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:06");
                    if(null==count) {
                        count= String.valueOf(0);
                    }
                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8 ) {


                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:06", ii + "");

                        testList.setSix(ii);




                    }else {
                        redis.opsForValue().set("feiting:count:06", 0 + "");
                        testList.setSix(0);

                    }

                }
                //上期1号索引位置
                if ("07".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:07");
                    if(null==count) {
                        count= String.valueOf(0);
                    }

                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8) {





                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:07", ii + "");

                        testList.setSeven(ii);
                    }else {
                        redis.opsForValue().set("feiting:count:07", 0 + "");
                        testList.setSeven(0);
                    }

                }
                //上期1号索引位置
                if ("08".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:08");
                    if(null==count) {
                        count= String.valueOf(0);
                    }

                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8 ) {




                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:08", ii + "");

                        testList.setEight(ii);


                    }else {
                        redis.opsForValue().set("feiting:count:08", 0 + "");
                        testList.setEight(0);
                    }

                }
                //上期1号索引位置
                if ("09".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:09");
                    if(null==count) {
                        count= String.valueOf(0);
                    }
                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8) {




                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:09", ii + "");

                        testList.setNine(ii);

                    }else {
                        redis.opsForValue().set("feiting:count:09", 0 + "");
                        testList.setNine(0);
                    }

                }

                //上期1号索引位置
                if ("10".equals(Laslit[i])) {
                    //得到i=几
                    String[] NumArrsplit = NowArr.split(",");
                    String count = redis.opsForValue().get("feiting:count:10");
                    if(null==count) {
                        count= String.valueOf(0);
                    }

                    //本期与上期对比
                    if (Integer.parseInt(NumArrsplit[i]) < 3 || Integer.parseInt(NumArrsplit[i]) >8 ) {




                        int i1 = Integer.parseInt(count);
                        int ii = ++i1;
                        redis.opsForValue().set("feiting:count:10", ii + "");

                        testList.setTen(ii);


                    }else {
                        redis.opsForValue().set("feiting:count:10", 0 + "");
                        testList.setTen(0);

                    }

                }

            }

            testListMapper.insert(testList);
            log.info("存入数据库成功");
            return  "存入数据库成功";
        }

        return "暂无最新数据";
    }



}


