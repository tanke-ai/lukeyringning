/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.shuangseqiu;
import lombok.ToString;

import java.util.List;

/**
 * Auto-generated: 2020-10-24 10:32:51
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@ToString
public class SsqData {

    private String lastPeriod;
    private SsqServer server;
    private List<String> current;
    private List<SsqList> list;
    public void setLastPeriod(String lastPeriod) {
         this.lastPeriod = lastPeriod;
     }
     public String getLastPeriod() {
         return lastPeriod;
     }

    public void setServer(SsqServer server) {
         this.server = server;
     }
     public SsqServer getServer() {
         return server;
     }

    public void setCurrent(List<String> current) {
         this.current = current;
     }
     public List<String> getCurrent() {
         return current;
     }

    public void setList(List<SsqList> list) {
         this.list = list;
     }
     public List<SsqList> getList() {
         return list;
     }

}