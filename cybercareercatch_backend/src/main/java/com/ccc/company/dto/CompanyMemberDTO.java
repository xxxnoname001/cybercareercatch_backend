package com.ccc.company.dto;

public class CompanyMemberDTO {
	private int userNumber;
	private int companyNumber;
	private String companyManagerState;

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public int getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(int companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyManagerState() {
		return companyManagerState;
	}

	public void setCompanyManagerState(String companyManagerState) {
		this.companyManagerState = companyManagerState;
	}

	@Override
	public String toString() {
		return "CompanyMemberDTO [userNumber=" + userNumber + ", companyNumber=" + companyNumber
				+ ", companyManagerState=" + companyManagerState + "]";
	}

}
