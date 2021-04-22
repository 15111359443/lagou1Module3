package com.lagou.studymvc.dome.service.impl;

import com.lagou.studymvc.dome.service.IDemoService;
import com.lagou.studymvc.mvcframe.annotations.LagouStudyService;

@LagouStudyService("demoService")
public class DemoServiceImpl implements IDemoService {
    @Override
    public String get(String name) {
        System.out.println("service 实现类中的name参数：" + name) ;
        return name;
    }
}
