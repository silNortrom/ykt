package com.ykt.backstage.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisCacheTransfer {


    @Autowired
    public void setJedisConnectionFactory(RedisTemplate redisTemplate) {
        MybatisRedisCache.setRedisConnectionFactory(redisTemplate);
    }


}

