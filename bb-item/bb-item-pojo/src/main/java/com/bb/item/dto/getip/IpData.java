/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.getip;
import lombok.ToString;

import java.util.Date;

/**
 * Auto-generated: 2020-11-11 13:42:17
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */

public class IpData {

    private String ip;
    private Integer port;
    private String expire_time;
    public void setIp(String ip) {
         this.ip = ip;
     }
     public String getIp() {
         return ip;
     }

    public void setPort(int port) {
         this.port = port;
     }
     public int getPort() {
         return port;
     }

    public void setExpire_time(String expire_time) {
         this.expire_time = expire_time;
     }
     public String getExpire_time() {
         return expire_time;
     }

}