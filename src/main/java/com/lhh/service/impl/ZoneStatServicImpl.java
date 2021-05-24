package com.lhh.service.impl;

import com.lhh.entity.ZoneInfo;
import com.lhh.mapper.ZoneInfoMapper;
import com.lhh.service.ZoneStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2021/5/24 15:28
 */
@Service
public class ZoneStatServicImpl implements ZoneStatService {

    @Autowired
    private ZoneInfoMapper zoneInfoMapper;

    @Override
    public List<ZoneInfo> getAll() {
        return zoneInfoMapper.getAll();
    }
}
