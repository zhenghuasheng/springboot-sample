package com.sample.server.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhenghuasheng
 * @date 2017/10/30.16:07
 */

@Component
public class RabbitSender {
    private static final Logger logger = LoggerFactory.getLogger(RabbitSender.class);
    private final AmqpAdmin amqpAdmin;
    private final AmqpTemplate amqpTemplate;

    @Autowired
    public RabbitSender(AmqpAdmin amqpAdmin, AmqpTemplate amqpTemplate) {
        this.amqpAdmin = amqpAdmin;
        this.amqpTemplate = amqpTemplate;
    }


    public void sendMessage(String content) {
        String message = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        logger.info("message:{}",message);
        amqpTemplate.convertAndSend("exchange", "topic.message",message.concat(content) );
    }
}
