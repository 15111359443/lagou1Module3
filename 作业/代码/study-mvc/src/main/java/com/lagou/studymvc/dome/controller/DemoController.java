package com.lagou.studymvc.dome.controller;

import com.lagou.studymvc.dome.service.IDemoService;
import com.lagou.studymvc.mvcframe.annotations.LagouStudyAutowired;
import com.lagou.studymvc.mvcframe.annotations.LagouStudyController;
import com.lagou.studymvc.mvcframe.annotations.LagouStudyRequestMapping;
import com.lagou.studymvc.mvcframe.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouStudyController
@LagouStudyRequestMapping("/demo")
public class DemoController {


    @LagouStudyAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param name
     * @return
     */
    @LagouStudyRequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response, String name) throws IOException {
        System.out.println("访问成功！！！");
        demoService.get(name);
        response.sendRedirect("/success.jsp");
        return;
    }
}
