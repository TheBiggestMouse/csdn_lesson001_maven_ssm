package com.lgf.maven_ssm.system.entity;

public class CsdnUser {
    private String userId;

    private String userName;

    private String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

	@Override
	public String toString() {
		return "CsdnUser [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}
    
    
}