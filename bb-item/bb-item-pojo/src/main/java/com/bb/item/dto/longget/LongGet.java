/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.longget;
import java.util.List;

/**
 * Auto-generated: 2020-10-24 16:41:11
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class LongGet {

    private boolean status;
    private long code;
    private String msg;
    private List<LongData> data;
    public void setStatus(boolean status) {
         this.status = status;
     }
     public boolean getStatus() {
         return status;
     }

    public void setCode(long code) {
         this.code = code;
     }
     public long getCode() {
         return code;
     }

    public void setMsg(String msg) {
         this.msg = msg;
     }
     public String getMsg() {
         return msg;
     }

    public void setData(List<LongData> data) {
         this.data = data;
     }
     public List<LongData> getData() {
         return data;
     }

}