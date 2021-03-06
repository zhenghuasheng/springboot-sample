/*
 *    Copyright 2010-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.sample;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author zhenghuasheng
 */
@SpringBootApplication
@MapperScan("com.sample.dao")
@ImportResource({"spring-dubbo.xml"})
@EnableWebSocket
@EnableAsync
@EnableScheduling
@EnableSwagger2
public class SampleMybatisApplication {
    private static Logger logger = Logger.getLogger(SampleMybatisApplication.class);


    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setThreadNamePrefix("MySimpleExecutor-");
        executor.setQueueCapacity(25);
        return executor;
    }

    /**
     * Main Start
     */
    public static void main(String[] args) {
//			SpringApplication application = new SpringApplication(SampleMybatisApplication.class);
//			application.setShowBanner(false);
//			application.run(args);
        SpringApplication.run(SampleMybatisApplication.class, args);
        logger.info("============= SpringBoot Start Success =============");
    }

}
