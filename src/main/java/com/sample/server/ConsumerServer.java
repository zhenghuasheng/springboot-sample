package com.sample.server;

import com.sample.SampleMybatisApplication;
import com.sample.dao.ConsumerMapper;
import com.sample.model.Consumer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Created by zhenghuasheng on 2016/7/9.
 */
@Service
public class ConsumerServer {
    private static Logger logger = Logger.getLogger(SampleMybatisApplication.class);
    @Autowired
    private ConsumerMapper consumerMapper;
//    @Autowired
//    private UserServer userServer;
    @Autowired
    private RedisCache redisCache;


//    @Cacheable(value = "springbootCache" ,keyGenerator = "localKeyGenerator")
    public Consumer getConsumer(String name) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("memberName", name);

        Consumer result = (Consumer) redisCache.get("consumer:"+ name).get();
        if (result == null) {
            result = consumerMapper.getConsumerRequest(params);
            redisCache.put("consumer:"+ name,result);
        }

        logger.info("message get from db");
        return result;
    }
}
