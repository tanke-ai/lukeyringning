/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.getip;
import lombok.ToString;

import java.util.List;

/**
 * Auto-generated: 2020-11-11 13:42:17
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */

public class IPBean {

    private int code;
    private List<IpData> data;
    private String msg;
    private boolean success;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setData(List<IpData> data) {
         this.data = data;
     }
     public List<IpData> getData() {
         return data;
     }

    public void setMsg(String msg) {
         this.msg = msg;
     }
     public String getMsg() {
         return msg;
     }

    public void setSuccess(boolean success) {
         this.success = success;
     }
     public boolean getSuccess() {
         return success;
     }

}