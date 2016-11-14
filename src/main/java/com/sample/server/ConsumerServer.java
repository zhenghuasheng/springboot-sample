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
//    @Autowired
//    private RedisCache redisCache;


    public Consumer getConsumerByName(String name) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("memberName", name);
//        PtResult ptResult = userServer.getUserBykey(1L);
//       PtResult result = (PtResult) redisCache.get("ptResult").get();
//        if (result != null){
//            System.out.println("get from cache!");
//        }else {
//            redisCache.put("ptResult",ptResult);
//        }

        return consumerMapper.getConsumerRequest(params);
    }
}
