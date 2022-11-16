package com.example.keepclick;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class CallbackController {
    @Resource
    private  Runner runner;

    @GetMapping("/click")
    public void click(){
        var location = runner.getLocation();
        if (location == null)  {
            log.info("not ready yet.");
        }else {
            location.click();
        }
    }
}
