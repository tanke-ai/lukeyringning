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
public class ShuangseqiuBean {

    private boolean status;
    private int code;
    private String msg;
    private SsqData data;
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

    public void setData(SsqData data) {
         this.data = data;
     }
     public SsqData getData() {
         return data;
     }

}