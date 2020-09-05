package com.toolmanclub.gmall.oms;

import com.toolmanclub.gmall.oms.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class GmallOmsApplicationTests {

    @Resource
    private OrderService orderService;

    @Test
    void contextLoads() {
        int count = orderService.count();
        log.info(String.valueOf(count));
    }

}
