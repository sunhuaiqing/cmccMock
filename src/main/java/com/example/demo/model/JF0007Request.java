package com.example.demo.model;

public class JF0007Request {
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
	
	//交易流水号
	private String deTradeID;
	//保留字段1
	private String reserved1;
	//保留字段2
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

	public String getDeTradeID() {
		return deTradeID;
	}

	public void setDeTradeID(String deTradeID) {
		this.deTradeID = deTradeID;
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
