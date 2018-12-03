package com.lixing.docker.dockerboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * author: lixing
 * date: 2018-12-01
 * time: 15:47
 * description:Redis的五种数据类型各种操作
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @RequestMapping("/value")
    public Object redis() {
        redisTemplate.opsForValue().set("name", "tomcat");
        ValueOperations<Object, Object> value = redisTemplate.opsForValue();
        Object name = value.get("name").toString();
        // 输出value
        System.out.println("获取的值：" + name);
        return name;
    }

    @RequestMapping("/list")
    public List<Object> list() {
        ListOperations<Object, Object> list = redisTemplate.opsForList();
        list.leftPush("s-list", "Chinese");
        list.leftPush("s-list", "Math");
        list.leftPush("s-list", "English");
        // 输出list
        System.out.println(list.range("s-list", 0, 2));
        List<Object> resultList = list.range("s-list", 0, 2);
        return resultList;
    }

    @RequestMapping("/set")
    public Set<Object> set() {
        SetOperations<Object, Object> set = redisTemplate.opsForSet();
        set.add("p-set", "ps");
        set.add("p-set", "27");
        set.add("p-set", "180cm");
        // 输出set
        System.out.println(set.members("p-set"));
        Set<Object> resultSet = set.members("p-set");
        return resultSet;
    }

    @RequestMapping("/zset")
    public Set<Object> zset() {
        ZSetOperations<Object, Object> zset = redisTemplate.opsForZSet();
        zset.add("z-set", "ps", 0);
        zset.add("z-set", "27", 1);
        zset.add("z-set", "180cm", 2);
        // 输出zset
        System.out.println(zset.range("z-set", 0, 2));
        Set<Object> resultZSet = zset.range("z-set", 0, 2);
        return resultZSet;
    }

    @RequestMapping("/hash")
    public Map<Object, Object> hash() {
        HashOperations<Object, Object, Object> hash = redisTemplate.opsForHash();
        Map<Object, Object> map = new HashMap();
        map.put("name", "lucy");
        map.put("age", 22);
        map.put("address", "重庆市");
        hash.putAll("map", map);
        // 输出map
        System.out.println(hash.entries("map"));
        Map<Object, Object> resultMap = hash.entries("map");
        return resultMap;
    }
}
