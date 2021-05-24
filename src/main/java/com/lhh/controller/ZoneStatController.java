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
 * @date 2021/5/24 15:31
 */
@RestController
public class ZoneStatController {

    @Autowired
    private ZoneStatService zoneStatService;

    @RequestMapping("getAll")
    public List<ZoneInfo> getAll() {
        return zoneStatService.getAll();
    }

    /**/

}
