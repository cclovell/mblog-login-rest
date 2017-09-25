package com.cc.mblog.manage;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cc.mblog.base.BaseResp;
import com.cc.mblog.service.LoginService;
import org.springframework.stereotype.Component;

/**
 * Created by chenchao on 2017/9/20.
 */
@Component
public class LoginManage {
    @Reference(version = "1.0.0")
    LoginService loginService;

    public BaseResp login(){
        String s = loginService.test();
        return  BaseResp.create(s);
    }

}
