package com.example.demo.model;

public class JFD001Response {

	// 第三方用户账号
	private String thirdAccount;
	// 手机号
	private String mobile;
	// 验证码标识
	private String smsCodeId;
	// 保留字段1
	private String reserved1;
	// 保留字段2
	private String reserved2;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSmsCodeId() {
		return smsCodeId;
	}

	public void setSmsCodeId(String smsCodeId) {
		this.smsCodeId = smsCodeId;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getThirdAccount() {
		return thirdAccount;
	}

	public void setThirdAccount(String thirdAccount) {
		this.thirdAccount = thirdAccount;
	}
}
