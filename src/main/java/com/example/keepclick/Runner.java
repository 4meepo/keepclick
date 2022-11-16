package com.example.keepclick;

import lombok.extern.slf4j.Slf4j;
import org.sikuli.script.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    private Location location;

    @Override
    public void run(String... args) throws Exception {
        log.info("你有 5秒 时间将鼠标指针移动至目标位置.");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.exit(1);
        }



        // 初始化location
        var location = Mouse.at();
        this.location = location;
        log.info("已记录指针位置");
    }
    public Location getLocation(){
        return this.location;
    }
}
