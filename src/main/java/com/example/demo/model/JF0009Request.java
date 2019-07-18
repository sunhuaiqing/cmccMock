package com.example.demo.model;

public class JF0009Request {
	// 接口编码
	private String interCode;
	// 字符集
	private String character;
	// IP地址
	private String ipAddress;
	// 商户编号
	private String partnerId;
	// 商户请求号
	private String requestId;
	// 签名方式
	private String signType;
	// 接口类型
	private String type;
	// 版本号
	private String version;
	// 签名数据
	private String hmac;

	// 扣减回退流水号
	private String roTradeID;
	// 对应扣减交易流水号
	private String deTradeID;
	// 操作角色
	private String role;
	// 短信验证码
	private String optCode;
	// 验证码标识
	private String smsCodeId;
	// 第三方用户账号
	private String thirdAccount;
	// 手机号
	private String mobile;
	// 积分值
	private String andPoint;
	// 第三方回退积分值
	private String thirdPoint;
	// 备注
	private String comments;
	// 保留字段1
	private String reserved1;
	// 保留字段2
	private String reserved2;

	public String getInterCode() {
		return interCode;
	}

	public void setInterCode(String interCode) {
		this.interCode = interCode;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSignType() {
		return signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getHmac() {
		return hmac;
	}

	public void setHmac(String hmac) {
		this.hmac = hmac;
	}

	public String getRoTradeID() {
		return roTradeID;
	}

	public void setRoTradeID(String roTradeID) {
		this.roTradeID = roTradeID;
	}

	public String getDeTradeID() {
		return deTradeID;
	}

	public void setDeTradeID(String deTradeID) {
		this.deTradeID = deTradeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getOptCode() {
		return optCode;
	}

	public void setOptCode(String optCode) {
		this.optCode = optCode;
	}

	public String getSmsCodeId() {
		return smsCodeId;
	}

	public void setSmsCodeId(String smsCodeId) {
		this.smsCodeId = smsCodeId;
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

	public String getThirdPoint() {
		return thirdPoint;
	}

	public void setThirdPoint(String thirdPoint) {
		this.thirdPoint = thirdPoint;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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
