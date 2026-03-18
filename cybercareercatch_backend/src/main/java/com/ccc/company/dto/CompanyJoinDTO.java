package com.ccc.company.dto;

public class CompanyJoinDTO {
	private String companyName;
	private String companyBrn;
	private String companyAddress;
	private String userName;
	private String userPhone;
	private String authCode;
	private String userId;
	private String userPw;
	private String userPwConfirm;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyBrn() {
		return companyBrn;
	}

	public void setCompanyBrn(String companyBrn) {
		this.companyBrn = companyBrn;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserPwConfirm() {
		return userPwConfirm;
	}

	public void setUserPwConfirm(String userPwConfirm) {
		this.userPwConfirm = userPwConfirm;
	}

	@Override
	public String toString() {
		return "CompanyJoinDTO [companyName=" + companyName + ", companyBrn=" + companyBrn + ", companyAddress="
				+ companyAddress + ", userName=" + userName + ", userPhone=" + userPhone + ", authCode=" + authCode
				+ ", userId=" + userId + ", userPw=" + userPw + ", userPwConfirm=" + userPwConfirm + "]";
	}

}
