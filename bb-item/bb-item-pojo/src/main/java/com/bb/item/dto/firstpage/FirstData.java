/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.firstpage;
import java.util.List;

/**
 * Auto-generated: 2020-10-23 18:46:38
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class FirstData {

    private String lastPeriod;
    private FirstServer server;
    private FirstCurrent current;
    private List<FirstList> list;
    public void setLastPeriod(String lastPeriod) {
         this.lastPeriod = lastPeriod;
     }
     public String getLastPeriod() {
         return lastPeriod;
     }

    public void setServer(FirstServer server) {
         this.server = server;
     }
     public FirstServer getServer() {
         return server;
     }

    public void setCurrent(FirstCurrent current) {
         this.current = current;
     }
     public FirstCurrent getCurrent() {
         return current;
     }

    public void setList(List<FirstList> list) {
         this.list = list;
     }
     public List<FirstList> getList() {
         return list;
     }

}