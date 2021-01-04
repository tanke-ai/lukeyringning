/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.shuangseqiu;

import lombok.ToString;

/**
 * Auto-generated: 2020-10-24 10:32:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@ToString
public class SsqList {

    private String period;
    private String num;
    public void setPeriod(String period) {
         this.period = period;
     }
     public String getPeriod() {
         return period;
     }

    public void setNum(String num) {
         this.num = num;
     }
     public String getNum() {
         return num;
     }

}