package com.lgf.maven_ssm.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lgf.maven_ssm.system.entity.CsdnUser;
import com.lgf.maven_ssm.system.service.ILoginService;

/**
 *  描述: 登录控制器
 *  作者: 郎国峰 
 *  时间: 2019年4月11日 上午10:37:49
 */
@Controller
@RequestMapping("login")
public class LoginAction {
	@Autowired
	private ILoginService service;
	/**
	 * @方法名: loginAction 
	 * @描述: TODO 登录控制器,根据传入用户名和密码进行登录验证
	 * @作者: 郎国峰
	 * @时间: 2019年4月11日 上午11:17:07
	 * @参数: @return   
	 * @返回类型： String     
	 * @throws
	 */
	@RequestMapping("loginPage")
	public String loginAction(CsdnUser user) {
		user = service.queryUserByNameAndPassword(user);
		if(user==null) {
			return "jsp/error";//如果是null,那么用户不存在,跳转错误页
		}else {
			return "jsp/sys/login";//查询到用户,跳转登录成功页面
		}
	}
}
