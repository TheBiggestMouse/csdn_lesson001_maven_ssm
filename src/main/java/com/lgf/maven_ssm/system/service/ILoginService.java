package com.lgf.maven_ssm.system.service;

import com.lgf.maven_ssm.system.entity.CsdnUser;

/**
 *  描述: 登录模型接口
 *  作者: 郎国峰 
 *  时间: 2019年4月11日 上午11:16:46
 */
public interface ILoginService {
	/**
	 * @方法名: queryUserByNameAndPassword 
	 * @描述: TODO 根据传入的用户名和密码查询用户
	 * @作者: 郎国峰
	 * @时间: 2019年4月11日 上午11:20:40
	 * @参数: @return   
	 * @返回类型： CsdnUser     
	 * @throws
	 */
	CsdnUser queryUserByNameAndPassword(CsdnUser user);

}
