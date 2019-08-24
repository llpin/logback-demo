/**
 * @ClassName BlogServiceImpl
 * @Author linlipin
 * @Date 2019/5/12 下午3:55
 */

package com.example.logbackdemo.bbb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BlogServiceImpl implements BlogService {
    @Override
    public void log() {
        log.debug("====b debug");
        log.info("====c info");
        log.error("====d error");
    }
}
