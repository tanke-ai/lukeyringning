package com.bb;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@SpringBootApplication
@MapperScan(basePackages = {"com.bb.item.mapper"})
@MapperScan(basePackages = {
        "com.bb",
        "com.bb.item",
        "com.bb.item.controller",
        "com.bb.item.config",
        "com.bb.item.mapper",
        "com.bb.item.service"
}
)
@MapperScan("com.baomidou.mybatisplus.samples.quickstart.mapper")
@EnableScheduling
public class BbitemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BbitemApplication.class, args);
    }

}
