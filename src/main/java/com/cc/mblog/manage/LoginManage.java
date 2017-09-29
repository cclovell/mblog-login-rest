package com.cc.mblog.manage;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cc.mblog.base.BaseReq;
import com.cc.mblog.base.BaseResp;
import com.cc.mblog.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by chenchao on 2017/9/20.
 */
@Component
public class LoginManage {
    private static final Logger logger = LoggerFactory.getLogger(LoginManage.class);

    @Reference(version = "1.0.0")
    LoginService loginService;

    public BaseResp login(BaseReq baseReq){
        return  loginService.login(baseReq);
    }

}
