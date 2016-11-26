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
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@MapperScan("com.sample.dao")
@ImportResource({"spring-dubbo.xml"})
public class SampleMybatisApplication{

		private static Logger logger = Logger.getLogger(SampleMybatisApplication.class);
//
//		//DataSource配置
//		@Bean
//		@ConfigurationProperties(prefix="spring")
//		public DataSource dataSource() {
//			return new org.apache.tomcat.jdbc.pool.DataSource();
//		}
//
//		//提供SqlSeesion
//		@Bean
//		public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//
//			SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//			sqlSessionFactoryBean.setDataSource(dataSource());
//
//			PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//
//			sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
//
//			return sqlSessionFactoryBean.getObject();
//		}
//
//		@Bean
//		public PlatformTransactionManager transactionManager() {
//			return new DataSourceTransactionManager(dataSource());
//		}

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
