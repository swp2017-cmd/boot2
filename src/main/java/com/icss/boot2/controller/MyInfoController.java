package com.icss.boot2.controller;

import com.icss.boot2.domain.MyInfo;
import com.icss.boot2.service.MyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date 2020/4/19 16:05
 * @autho SWP
 * @Version 1.0
 */
@RestController
public class MyInfoController  {
    @Autowired
    MyInfoService myInfoService;
@RequestMapping(path="query.action")
    public Map<String ,Object> getAll() {

    Map<String, Object> mao = new HashMap<>();
    List<MyInfo> list = myInfoService.getAll();
    mao.put("sucess", list);
    return mao;
}
    }

