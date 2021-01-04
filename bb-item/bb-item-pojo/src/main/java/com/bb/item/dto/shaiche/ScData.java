/**
  * Copyright 2020 bejson.com 
  */
package com.bb.item.dto.shaiche;
import java.util.List;

/**
 * Auto-generated: 2020-10-24 11:30:30
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ScData {

    private String lastPeriod;
    private ScServer server;
    private ScCurrent current;
    private List<ScList> list;
    public void setLastPeriod(String lastPeriod) {
         this.lastPeriod = lastPeriod;
     }
     public String getLastPeriod() {
         return lastPeriod;
     }

    public void setServer(ScServer server) {
         this.server = server;
     }
     public ScServer getServer() {
         return server;
     }

    public void setCurrent(ScCurrent current) {
         this.current = current;
     }
     public ScCurrent getCurrent() {
         return current;
     }

    public void setList(List<ScList> list) {
         this.list = list;
     }
     public List<ScList> getList() {
         return list;
     }

}