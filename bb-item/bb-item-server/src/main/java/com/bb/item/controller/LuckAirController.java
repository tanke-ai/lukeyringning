package com.bb.item.controller;


import com.bb.item.serviver.LuckyAirServer;
import com.bb.item.vo.FeitPageResult;
import org.apache.http.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author Tanke
 * @date 2020/10/27
 */
@RestController
@RequestMapping("/ddmao")
public class LuckAirController {
    @Autowired
    private LuckyAirServer service;




    @GetMapping("/ring")

    public Boolean  ring() throws IOException, ParseException, InterruptedException {
        return service.ring();
    }

    @GetMapping("/queryhistory")
    public FeitPageResult queryhistory(   ) throws Exception {
        return service.queryhistory( );
    }

    @GetMapping("/setKey")

    public String   setKey(String number,Integer value) throws IOException, ParseException, InterruptedException {
       return    service.setKey(number,value);
    }



    @Scheduled(cron = "0,15 5/5 13-23 * * ?")
    @GetMapping("/feiting")

    public String feitin(  ) throws IOException, ParseException, InterruptedException {
        return service.feitin(  );
    }

    @Scheduled(cron = "0,15 5/5 0-3 * * ?")
    @GetMapping("/feiting2")
    public String feitin2(     ) throws IOException, ParseException, InterruptedException {
        return service.feitin(  );
    }
}
    
 