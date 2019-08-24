/**
 * @ClassName AlogServiceImpl
 * @Author linlipin
 * @Date 2019/5/12 下午3:53
 */

package com.example.logbackdemo.aaa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AlogServiceImpl implements AlogService {
    @Override
    public void log() {
        log.debug("====a debug");
        log.info("====a info");
        log.error("====a error");
    }
}
