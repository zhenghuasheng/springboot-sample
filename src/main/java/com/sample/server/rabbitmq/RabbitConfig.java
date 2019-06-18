package com.sample.server.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhenghuasheng
 * @date 2017/10/30.16:49
 */
@Configuration
public class RabbitConfig {

    /**
     *队列
     * @return
     */
    @Bean(name="message")
    public Queue queueMessage() {
        return new Queue("q_m_1");
    }

    /**
     * topic交换器
     * @return
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("exchange");
    }
    @Bean
    Binding bindingExchangeMessage(@Qualifier("message") Queue queueMessage, TopicExchange exchange) {
       return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

//    /**
//     * 配置广播交换器
//     * @return
//     */
//    @Bean
//    public FanoutExchange exchange() {
//        return new FanoutExchange("fanoutExchange");
//    }
//
//    @Bean
//    Binding bindingExchangeMessage(@Qualifier("message") Queue queueMessage, FanoutExchange fanoutExchange) {
//        return BindingBuilder.bind(queueMessage).to(fanoutExchange);
//    }
}
