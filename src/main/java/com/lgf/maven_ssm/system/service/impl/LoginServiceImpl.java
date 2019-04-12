package com.lgf.maven_ssm.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgf.maven_ssm.system.entity.CsdnUser;
import com.lgf.maven_ssm.system.mapper.CsdnUserMapper;
import com.lgf.maven_ssm.system.service.ILoginService;

/**
 *  描述: 登录模型实现
 *  作者: 郎国峰 
 *  时间: 2019年4月11日 上午11:23:08
 */
@Service
public class LoginServiceImpl implements ILoginService {
	@Autowired
	private CsdnUserMapper csdnUserMapper;
	
	@Override
	public CsdnUser queryUserByNameAndPassword(CsdnUser user) {
		// TODO Auto-generated method stub
		//根据用户名和密码查询用户
		user = csdnUserMapper.queryUserByNameAndPassword(user.getUserName(),user.getUserPassword());
		return user;
	}

}
