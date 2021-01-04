/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.xuanwu;

/**
 * Auto-generated: 2020-10-23 10:30:2
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class XuanwuBean {

    private boolean status;
    private int code;
    private String msg;
    private XuanwuData data;
    public void setStatus(boolean status) {
         this.status = status;
     }
     public boolean getStatus() {
         return status;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setMsg(String msg) {
         this.msg = msg;
     }
     public String getMsg() {
         return msg;
     }

    public void setData(XuanwuData data) {
         this.data = data;
     }
     public XuanwuData getData() {
         return data;
     }

}