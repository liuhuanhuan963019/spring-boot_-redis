package com.lhh.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lhh.entity.ZoneInfo;
import com.lhh.service.ZoneStatService;
import com.lhh.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/5/24 15:04
 */
@RestController

public class RedisController {
    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private ZoneStatService zoneStatService;

    @RequestMapping("setAndGet")
    public String test(String k,String v){
        redisUtils.set(k,v);
        return (String) redisUtils.get(k);
    }
    @RequestMapping("testRedis")
    public Object test(String k){
        //step1 先从redis中取
        String strJson=(String) redisUtils.get(k);
        if (strJson==null){
            System.out.println("从db取值");
            // step2如果拿不到则从DB取值
            List<ZoneInfo> listNbaPlayer=zoneStatService.getAll();
            // step3 DB非空情况刷新redis值
            if (listNbaPlayer!=null){
                redisUtils.set(k, JSON.toJSONString(listNbaPlayer));
                return listNbaPlayer;
            }
            return null;
        }else
        {
            System.out.println("从redis缓存取值");
            return JSONObject.parseArray(strJson,ZoneInfo.class);
        }
    }
}
