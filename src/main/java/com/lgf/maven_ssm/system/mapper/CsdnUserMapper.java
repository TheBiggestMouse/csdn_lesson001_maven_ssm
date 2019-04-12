package com.lgf.maven_ssm.system.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.lgf.maven_ssm.system.entity.CsdnUser;

public interface CsdnUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(CsdnUser record);

    int insertSelective(CsdnUser record);

    CsdnUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(CsdnUser record);

    int updateByPrimaryKey(CsdnUser record);
    /**
     * @方法名: queryUserByNameAndPassword 
     * @描述: TODO 根据传入的用户名和密码查询用户
     * @作者: 郎国峰
     * @时间: 2019年4月11日 上午11:26:11
     * @参数: @param userName
     * @参数: @param userPassword
     * @参数: @return   
     * @返回类型： CsdnUser     
     * @throws
     */
    @Select("select * from csdn_user where user_name = #{userName} and user_password = #{userPassword}")
    @ResultMap("BaseResultMap")
	CsdnUser queryUserByNameAndPassword(@Param("userName") String userName,@Param("userPassword") String userPassword);
}