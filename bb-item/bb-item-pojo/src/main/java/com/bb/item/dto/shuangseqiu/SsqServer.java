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
public class SsqServer {

    private String date;
    private long time;
    public void setDate(String date) {
         this.date = date;
     }
     public String getDate() {
         return date;
     }

    public void setTime(long time) {
         this.time = time;
     }
     public long getTime() {
         return time;
     }

}