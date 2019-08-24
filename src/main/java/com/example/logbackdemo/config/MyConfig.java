/**
 * @ClassName MyConfig
 * @Author linlipin
 * @Date 2019/5/12 下午4:23
 */

package com.example.logbackdemo.config;

import com.example.logbackdemo.aaa.AlogService;
import com.example.logbackdemo.bbb.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Autowired
    private AlogService alogService;

    @Autowired
    private BlogService blogService;

    @Bean
    public String log(){
        alogService.log();
        blogService.log();

        return "log";
    }

}
