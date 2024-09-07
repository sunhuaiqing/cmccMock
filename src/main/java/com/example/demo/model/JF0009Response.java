package com.example.demo.model;

public class JF0009Response {
	// 扣减回退交易流水
	private String roTradeID;
	// 第三方用户账号
	private String thirdAccount;
	// 手机号
	private String mobile;
	// 回退分值
	private String andPoint;
	// 交易时间
	private String transTime;
	// 保留字段1
	private String reserved1;
	// 保留字段2
	private String reserved2;

	public String getRoTradeID() {
		return roTradeID;
	}

	public void setRoTradeID(String roTradeID) {
		this.roTradeID = roTradeID;
	}

	public String getThirdAccount() {
		return thirdAccount;
	}

	public void setThirdAccount(String thirdAccount) {
		this.thirdAccount = thirdAccount;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAndPoint() {
		return andPoint;
	}

	public void setAndPoint(String andPoint) {
		this.andPoint = andPoint;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
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

}
