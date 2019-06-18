package com.sample.server.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhenghuasheng
 * @date 2017/10/30.16:47
 */

@Component
@RabbitListener(queues = {"topic.message","q_m_1"})
public class RabbitConsumer {
    private static final Logger logger = LoggerFactory.getLogger(RabbitConsumer.class);

    @RabbitHandler
    public void process(String content) {
        logger.info("Receiver : " + content);
    }
}
