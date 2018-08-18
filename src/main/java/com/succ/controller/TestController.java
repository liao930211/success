package com.succ.controller;

import com.alibaba.fastjson.JSON;
import com.succ.entity.BaseInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2018/8/18.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setCreateTime(new Date());
        baseInfo.setFive(1);
        return JSON.toJSONString(baseInfo);
    }
}
