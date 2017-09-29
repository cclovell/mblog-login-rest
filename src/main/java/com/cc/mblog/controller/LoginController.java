package com.cc.mblog.controller;

import com.cc.mblog.base.BaseReq;
import com.cc.mblog.base.BaseResp;
import com.cc.mblog.manage.LoginManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenchao on 2017/9/21.
 */
@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    LoginManage loginManage;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BaseResp login(BaseReq baseReq){
        System.out.println(baseReq.getPassword());
        return  loginManage.login(baseReq);
    }
}
