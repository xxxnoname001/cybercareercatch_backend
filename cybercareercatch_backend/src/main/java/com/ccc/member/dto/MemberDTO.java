package com.ccc.member.dto;

public class MemberDTO {
	private int userNumber;
	private String memberDob;
	private String memberGender;
	private int jobNumber;

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
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

	public int getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}

	@Override
	public String toString() {
		return "MemberDTO [userNumber=" + userNumber + ", memberDob=" + memberDob + ", memberGender=" + memberGender
				+ ", jobNumber=" + jobNumber + "]";
	}
}
