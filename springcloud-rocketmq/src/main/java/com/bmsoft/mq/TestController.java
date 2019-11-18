package com.bmsoft.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    RocketMQProvider rocketMQProvider;

    @Autowired
    RocketMQConsumer rocketMQConsumer;

    @RequestMapping("/testMQ")
    public String testMq() {
        System.out.println("=======请求进来===============");
        rocketMQProvider.defaultMQProducer();

        rocketMQConsumer.defaultMQPushConsumer();
        return null;
    }

}
