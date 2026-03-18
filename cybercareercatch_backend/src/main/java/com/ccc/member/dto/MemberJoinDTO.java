package com.ccc.member.dto;

public class MemberJoinDTO {
	private String userId;
	private String userPw;
	private String userPwConfirm;
	private String userName;
	private String userPhone;
	private String memberDob;
	private String memberGender;
	private String authCode;

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

	public String getMemberDob() {
		return memberDob;
	}

	public void setMemberDob(String memberDob) {
		this.memberDob = memberDob;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	@Override
	public String toString() {
		return "MemberJoinDTO [userId=" + userId + ", userPw=" + userPw + ", userPwConfirm=" + userPwConfirm
				+ ", userName=" + userName + ", userPhone=" + userPhone + ", memberDob=" + memberDob + ", memberGender="
				+ memberGender + ", authCode=" + authCode + "]";
	}

}
