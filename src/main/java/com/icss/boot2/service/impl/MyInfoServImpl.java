package com.icss.boot2.service.impl;

import com.icss.boot2.dao.MyInfoMapper;
import com.icss.boot2.domain.MyInfo;
import com.icss.boot2.service.MyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 2020/4/19 16:02
 * @autho SWP
 * @Version 1.0
 */
@Service
public class MyInfoServImpl implements MyInfoService {
    @Autowired
    MyInfoMapper myInfoMapper;


    @Override
    public List<MyInfo> getAll() {
        return myInfoMapper.getAllMyInfo();
    }
}
