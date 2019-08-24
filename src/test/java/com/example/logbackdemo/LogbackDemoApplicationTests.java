package com.example.logbackdemo;

import com.example.logbackdemo.aaa.AlogService;
import com.example.logbackdemo.bbb.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogbackDemoApplicationTests {

    @Autowired
    private AlogService alogService;

    @Autowired
    private BlogService blogService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void logbackTest(){

        log.debug("====test debug");
        log.info("====test info");
        log.error("====test error");

        alogService.log();

        blogService.log();

    }

}
