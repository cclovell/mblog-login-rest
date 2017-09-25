package com.cc.mblog;

import com.cc.mblog.manage.LoginManage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MblogLoginRestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MblogLoginRestApplication.class, args);
		// LoginManage loginManage = run.getBean(LoginManage.class);
		// loginManage.login();
	}
}
