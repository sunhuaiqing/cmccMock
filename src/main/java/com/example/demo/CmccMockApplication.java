package com.example.demo;

import com.example.demo.base.MD5Encryption;
import com.example.demo.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
@RequestMapping(value = "/jfInter")
public class CmccMockApplication {
	//读取配置文件，中移动兑分验证码是否进行校验12
	//@Value("${cmcc.jf006.ValildVerifCode}")
	//String cmccValildVerifCode;

	@Autowired
	private Environment env;

	// 定义加密key
	//private static final String securtyKey = "123456";
	//b6112e80780357e3a35af0cc8d7996a33AB17DB95999C1BE204F2E
	private static final String securtyKey = "b6112e80780357e3a35af0cc8d7996a33AB17DB95999C1BE204F2E";

	// 设置log
	private static final Logger logger = LoggerFactory.getLogger(CmccMockApplication.class);

	static int wait1 = 0, i1 = 0, wait2 = 0, i2 = 0, wait10 = 0, i10 = 0, wait9 = 0, i9 = 0, wait7 = 0, i7 = 0,
			wait6 = 0, i6 = 0, wait5 = 0, i5 = 0, wait3 = 0, i3 = 0;

	// 设置基本参数
	public BaseList getBaseList() {
		BaseList baseList = new BaseList();
		baseList.setReturnCode("0000");
		baseList.setMessage("业务处理成功Moker");
		return baseList;
	}

	@RequestMapping()
	public @ResponseBody String jfInter(HttpServletRequest request) throws Exception {

		CmccMockApplication cmccMockApplication = new CmccMockApplication();

		String interCode = request.getParameter("interCode");

		logger.info("请求的接口为：" + interCode);

		Map<String, String[]> requestMap = request.getParameterMap();
		Enumeration<String> name = request.getParameterNames();
		String requestString = "@@@Enumeration<String> name = request.getParameterNames():"+name;
		System.out.println("");
		while (name.hasMoreElements()) {

			String keyString = name.nextElement();
			String[] value = requestMap.get(keyString);

			for (int i = 0; i < value.length; i++) {
				if (requestString.isEmpty()) {
					requestString = keyString + "=" + value[i];
				} else {
					requestString = requestString + "&" + keyString + "=" + value[i];
				}
			}
		}
		logger.info("接收到的请求为requestString：" + requestString);

		// 取出其他基本参数
		String partnerId = request.getParameter("partnerId");
		String requestId = request.getParameter("requestId");
		String signType = request.getParameter("signType");
		String type = request.getParameter("type");
		String version = request.getParameter("version");
		// 设置基本参数
		BaseList baseList = new BaseList();
		baseList = this.getBaseList();
		baseList.setInterCode(interCode);
		baseList.setPartnerId(partnerId);
		baseList.setRequestId(requestId);
		baseList.setSignType(signType);
		baseList.setType(type);
		baseList.setVersion(version);

		// 设置接口等待的随机时间1~10秒，
		Random random = new Random();

		switch (interCode.toLowerCase()) {
		case "jf0001":
			if (i1 >= 10) {
				i1 = 0;
			}
			switch (i1) {
			case 4:
				wait1 = random.nextInt(6) + 10;
				break;
			case 9:
				wait1 = random.nextInt(6) + 10;
				break;
			default:
				wait1 = random.nextInt(3) + 1;
				break;
			}
			i1 = i1 + 1;
			logger.info("i1的值为：" + i1);
			logger.info("jf0001返回等待时间为：" + wait1 + "秒");
			TimeUnit.SECONDS.sleep(wait1);
			return cmccMockApplication.jf0001(request, baseList);
		case "jf0002":

			if (i2 >= 10) {
				i2 = 0;
			}
			switch (i2) {
			case 4:
				wait2 = random.nextInt(3) + 10;
				break;
			case 9:
				wait2 = random.nextInt(3) + 10;
				break;
			default:
				wait2 = random.nextInt(3) + 1;
				break;
			}
			i2 = i2 + 1;
			logger.info("i2的值为：" + i2);
			logger.info("jf0002返回等待时间为：" + wait2 + "秒");
			TimeUnit.SECONDS.sleep(wait2);
			return cmccMockApplication.jf0002(request, baseList);
		case "jf0003":

			if (i3 >= 10) {
				i3 = 0;
			}
			switch (i3) {
			case 4:
				wait3 = random.nextInt(3) + 10;
				break;
			case 9:
				wait3 = random.nextInt(3) + 10;
				break;
			default:
				wait3 = random.nextInt(3) + 1;
				break;
			}
			i3 = i3 + 1;
			logger.info("i3的值为：" + i3);
			logger.info("jf0003返回等待时间为：" + wait3 + "秒");
			TimeUnit.SECONDS.sleep(wait3);
			return cmccMockApplication.jf0003(request, baseList);
		case "jf0005":

			if (i5 >= 10) {
				i5 = 0;
			}
			switch (i5) {
			case 4:
				wait5 = random.nextInt(3) + 10;
				break;
			case 9:
				wait5 = random.nextInt(3) + 10;
				break;
			default:
				wait5 = random.nextInt(3) + 1;
				break;
			}
			i5 = i5 + 1;
			logger.info("i5的值为：" + i5);
			logger.info("jf0005返回等待时间为：" + wait5 + "秒");
			TimeUnit.SECONDS.sleep(wait5);
			return cmccMockApplication.jf0005(request, baseList);
		case "jf0006":

			if (i6 >= 10) {
				i6 = 0;
			}
			switch (i6) {
			case 4:
				wait6 = random.nextInt(3) + 10;
				break;
			default:
				wait6 = random.nextInt(3) + 1;
				break;
			}
			i6 = i6 + 1;
			logger.info("i6的值为：" + i6);
			logger.info("jf0006返回等待时间为：" + wait6 + "秒");
			TimeUnit.SECONDS.sleep(wait6);
			return cmccMockApplication.jf0006(request, baseList);
		case "jf0007":

			if (i7 >= 10) {
				i7 = 0;
			}
			switch (i7) {
			case 4:
				wait7 = random.nextInt(3) + 10;
				break;
			case 9:
				wait7 = random.nextInt(3) + 10;
				break;
			default:
				wait7 = random.nextInt(3) + 1;
				break;
			}
			i7 = i7 + 1;
			logger.info("i7的值为：" + i7);
			logger.info("jf0007返回等待时间为：" + wait7 + "秒");
			TimeUnit.SECONDS.sleep(wait7);
			return cmccMockApplication.jf0007(request, baseList);
		case "jf0009":

			if (i9 >= 10) {
				i9 = 0;
			}
			switch (i9) {
			case 4:
				wait9 = random.nextInt(3) + 10;
				break;
			case 9:
				wait9 = random.nextInt(3) + 10;
				break;
			default:
				wait9 = random.nextInt(3) + 1;
				break;
			}
			i9 = i9 + 1;
			logger.info("i9的值为：" + i9);
			logger.info("jf0009返回等待时间为：" + wait9 + "秒");
			TimeUnit.SECONDS.sleep(wait9);
			return cmccMockApplication.jf0009(request, baseList);
		case "jfd001":
			if (i10 >= 10) {
				i10 = 0;
			}
			switch (i10) {
			case 4:
				wait10 = random.nextInt(3) + 10;
				break;
			case 9:
				wait10 = random.nextInt(3) + 10;
				break;
			default:
				wait10 = random.nextInt(3) + 1;
				break;
			}
			i10 = i10 + 1;
			logger.info("i10的值为：" + i10);
			logger.info("jfd001返回等待时间为：" + wait10 + "秒");
			TimeUnit.SECONDS.sleep(wait10);
			return cmccMockApplication.jfd001(request, baseList);
		default:
			break;
		}
		return null;
	}

	// JF0001用户绑定请求接口mock
	/*
	 * 参数名称 参数命名 长度 类型 备注 可 否为空 第三方用户账号 thirdAccount V(1,50) String 第三方系统渠道中用户账号 否
	 * 页面返回URL callbackUrl V(1,100) String 页面通知结果时将返回到这个 URL 否 保留字段1 reserved1
	 * V(0,256) String 交易返回时原样返回给第三方系统，给商户备用 是 保留字段2 reserved2 V(0,256) String
	 * 交易返回时原样返回给第三方系统，给商户备用 是
	 */
	public String jf0001(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JF0001Response responseJson = new JF0001Response();

		responseJson.setMobileUrl("url<hi:=>http://open.jf.10086.cn/<hi:$$>method<hi:=>post<hi:$$>tokenId<hi:=>" + UUID.randomUUID());

		singData = singData + responseJson.getMobileUrl() + securtyKey;

		logger.info("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", baseList.getReturnCode());
		responseMap.put("message", baseList.getMessage());
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());
		responseMap.put("mobileUrl", responseJson.getMobileUrl());
		responseMap.put("hmac", baseList.getHmac());

		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.info("返回的报文为：" + responseString);

		return responseString;
	}

	/*
	 * JF0002用户解绑请求接口mock 参数名称 参数命名 长度 类型 备注 可否为空 操作角色 role F2 String 00: 用户 01：客服 否
	 * 第三方用户账号 thirdAccount V(1,50) String 第三方系统渠道中用户账号 否 手机号 mobile F11 String
	 * 移动手机号 否 保留字段1 reserved1 V(0,256) String 交易返回时原样返回给第三方系统，给商户备用 是 保留字段2
	 * reserved2 V(0,256) String 交易返回时原样返回给第三方系统，给商户备用 是
	 */
	public String jf0002(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JF0002Response responseJson = new JF0002Response();
		responseJson.setThirdAccount(request.getParameter("thirdAccount"));
		responseJson.setMobile(request.getParameter("mobile"));

		singData = singData + responseJson.getThirdAccount() + responseJson.getMobile() + responseJson.getReserved1()
				+ responseJson.getReserved2() + securtyKey;

		logger.debug("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", baseList.getReturnCode());
		responseMap.put("message", baseList.getMessage());
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());

		responseMap.put("thirdAccount", responseJson.getThirdAccount());
		responseMap.put("mobile", responseJson.getMobile());
		responseMap.put("reserved1", responseJson.getReserved1());
		responseMap.put("reserved2", responseJson.getReserved2());

		responseMap.put("hmac", baseList.getHmac());

		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.debug("返回的报文为：" + responseString);

		return responseString;

	}

	/*
	 * JF0003用户绑定关系激活接口 参数名称 参数命名 长度 类型 备注 可否为空 第三方用户账号 thirdAccount V(1,50) String
	 * 第三方系统渠道中用户账号 否 手机号 mobile F11 String 移动手机号 否 页面返回URL callbackUrl V(1,100)
	 * String 页面通知结果时将返回到这个 URL 否 保留字段1 reserved1 V(0,256) String
	 * 交易返回时原样返回给第三方系统，给商户备用 是 保留字段2 reserved2 V(0,256) String 交易返回时原样返回给第三方系统，给商户备用
	 * 是
	 */
	public String jf0003(HttpServletRequest request, BaseList baseList) throws Exception {

		JF0003Response responseJson = new JF0003Response();

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		responseJson.setMobileUrl(
				"url<hi:=>http://open.jf.10086.cn/<hi:$$>method<hi:=>post<hi:$$>tokenId<hi:=>" + UUID.randomUUID());

		singData = singData + responseJson.getMobileUrl() + securtyKey;

		logger.debug("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", baseList.getReturnCode());
		responseMap.put("message", baseList.getMessage());
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());
		responseMap.put("mobileUrl", responseJson.getMobileUrl());
		responseMap.put("hmac", baseList.getHmac());

		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.debug("返回的报文为：" + responseString);

		return responseString;
	}

	/*
	 * JF0005积分查询接口mock 参数名称 参数命名 长度 类型 备注 可否为空 第三方用户账号 thirdAccount V(1,50) String
	 * 第三方系统渠道中用户账号 否 手机号 mobile F11 String 移动手机号 否 保留字段1 reserved1 V(0,256) String
	 * 交易返回时原样返回给第三方系统，给商户备用 是 保留字段2 reserved2 V(0,256) String 交易返回时原样返回给第三方系统，给商户备用
	 * 是
	 */
	public String jf0005(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JF0005Response responseJson = new JF0005Response();
		responseJson.setMobile(request.getParameter("mobile"));
		responseJson.setThirdAccount(request.getParameter("thirdAccount"));
		responseJson.setAndPoint("2722");

		//singData = singData + responseJson.getThirdAccount() + responseJson.getMobile() + responseJson.getAndPoint()
		//		+ responseJson.getReserved1() + responseJson.getReserved2() + securtyKey;
		singData = singData + responseJson.getThirdAccount() + responseJson.getMobile() + responseJson.getAndPoint()
				 + securtyKey;
		logger.debug("待加密字符串为(加密原串)：" + singData);
		System.out.println("@加密原串 :"+singData );
		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", baseList.getReturnCode());
		responseMap.put("message", baseList.getMessage());
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());

		responseMap.put("thirdAccount", responseJson.getThirdAccount());
		responseMap.put("mobile", responseJson.getMobile());
		responseMap.put("andPoint", responseJson.getAndPoint());
		//responseMap.put("reserved1", responseJson.getReserved1());
		//responseMap.put("reserved2", responseJson.getReserved2());

		responseMap.put("hmac", baseList.getHmac());
		logger.debug("签名后串)：" + baseList.getHmac());
//		//更换一种加密方式：
//		String[] sortedKeys = responseMap.keySet().toArray(new String[]{});
//		Arrays.sort(sortedKeys);// 排序请求参数
//		StringBuilder s2 = new StringBuilder();
//		for (String key : sortedKeys) {
//			s2.append(key).append("=").append(responseMap.get(key)).append("&");
//		}
//		System.out.println("@@@@ s2 :"+s2.toString() );
//		s2.deleteCharAt(s2.length() - 1);
//		System.out.println("@@@3 s2 :"+s2.toString() );
//		System.out.println("@@@4 hm :"+new MD5Encryption().getMD5(s2.toString()));


		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.debug("返回的报文为：" + responseString);

		return responseString;
	}

	/*
	 * JF0006积分扣减接口
	 */
	public String jf0006(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JF0006Response responseJson = new JF0006Response();
		responseJson.setThirdAccount(request.getParameter("thirdAccount"));
		responseJson.setMobile(request.getParameter("mobile"));
		responseJson.setDeTradeID(request.getParameter("deTradeID"));
		responseJson.setAndPoint(request.getParameter("thirdPoint"));
		//responseJson.setTransTime(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()));
		responseJson.setTransTime("20180831002007");

		singData = singData + responseJson.getThirdAccount() + responseJson.getMobile() + responseJson.getDeTradeID()
				+ responseJson.getAndPoint() + responseJson.getTransTime() + responseJson.getReserved1()
				+ responseJson.getReserved2() + securtyKey;

		logger.debug("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));
		System.out.println("@@##$smsCodeId:"+request.getParameter("smsCodeId"));
        System.out.println("@@##optCode:"+request.getParameter("optCode"));
		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", "B025");
		responseMap.put("message", "移动B025错误短信验证码错误mock");
		String optCode = request.getParameter("optCode");
		//System.out.println("@@@@@@@@@ cmccValildVerifCode："+cmccValildVerifCode);
		//System.out.println("@@cmcc.jf006.ValildVerifCode:"+env.getProperty("cmcc.jf006.ValildVerifCode"));

		if(optCode.equals("123456") ){
			responseMap.put("returnCode", "0000");
			responseMap.put("message", "操作成功mock扣减验证OK");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@1");
		}else{
			responseMap.put("returnCode", "B025");
			responseMap.put("message", "移动B025错误短信验证码错误mock");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@2");
		}

        //responseMap.put("returnCode", "0000");
        //responseMap.put("message", "操作成功mock扣减验证OK");

		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());

		responseMap.put("thirdAccount", responseJson.getThirdAccount());
		responseMap.put("mobile", responseJson.getMobile());
		responseMap.put("deTradeID", responseJson.getDeTradeID());
		responseMap.put("andPoint", responseJson.getAndPoint());
		responseMap.put("transTime", responseJson.getTransTime());
		//responseMap.put("reserved1", responseJson.getReserved1());
		//responseMap.put("reserved2", responseJson.getReserved2());
		responseMap.put("hmac", baseList.getHmac());
		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}
		logger.info("返回的报文为：" + responseString);
		return responseString;
	}

	/*
	 * JF0007积分扣减交易查询接口
	 */
	public String jf0007(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JF0007Response responseJson = new JF0007Response();
		responseJson.setDeTradeID(request.getParameter("deTradeID"));
		responseJson.setMobile("18662660117");
		responseJson.setAndPoint("10");
		responseJson.setTransStatus("01");
		responseJson.setOrigResCode("0000");
		responseJson.setOrigResDesc("性能测试用应答描述");
		responseJson.setTransTime(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()));

		singData = singData + responseJson.getDeTradeID() + responseJson.getMobile() + responseJson.getAndPoint()
				+ responseJson.getTransStatus() + responseJson.getOrigResCode() + responseJson.getOrigResDesc()
				+ responseJson.getTransTime() + responseJson.getReserved1() + responseJson.getReserved2() + securtyKey;

		logger.info("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", baseList.getReturnCode());
		responseMap.put("message", baseList.getMessage());
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());

		responseMap.put("deTradeID", responseJson.getDeTradeID());
		responseMap.put("mobile", responseJson.getMobile());
		responseMap.put("andPoint", responseJson.getAndPoint());
		responseMap.put("transStatus", responseJson.getTransStatus());
		responseMap.put("origResCode", responseJson.getOrigResCode());
		responseMap.put("origResDesc", responseJson.getOrigResDesc());
		responseMap.put("transTime", responseJson.getTransTime());
		responseMap.put("reserved1", responseJson.getReserved2());
		responseMap.put("reserved2", responseJson.getReserved2());

		responseMap.put("hmac", baseList.getHmac());

		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.info("返回的报文为：" + responseString);

		return responseString;
	}

	/*
	 * JF0009积分扣减回退接口
	 */
	public String jf0009(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JF0009Response responseJson = new JF0009Response();
		responseJson.setRoTradeID(request.getParameter("roTradeID"));
		responseJson.setThirdAccount(request.getParameter("thirdAccount"));
		responseJson.setMobile(request.getParameter("mobile"));
		responseJson.setAndPoint(request.getParameter("andPoint"));
		responseJson.setTransTime(new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()));

		singData = singData + responseJson.getRoTradeID() + responseJson.getThirdAccount() + responseJson.getMobile()
				+ responseJson.getAndPoint() + responseJson.getTransTime() + responseJson.getReserved1()
				+ responseJson.getReserved2() + securtyKey;

		logger.debug("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());

		String optCode = request.getParameter("optCode");
		System.out.println("@@@@@@@@@ optCode："+optCode);
		if(optCode.equals("123456") ){
			responseMap.put("returnCode", "0000");
			responseMap.put("message", "操作成功mock回退积分验证OK");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@JF009 3");
		}else{
			responseMap.put("returnCode", "B025");
			responseMap.put("message", "移动B025错误回退积分验证码错误mock");
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@JF009 4");
		}
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());

		responseMap.put("roTradeID", responseJson.getRoTradeID());
		responseMap.put("thirdAccount", responseJson.getThirdAccount());
		responseMap.put("mobile", responseJson.getMobile());
		responseMap.put("andPoint", responseJson.getAndPoint());
		responseMap.put("transTime", responseJson.getTransTime());
		responseMap.put("reserved1", responseJson.getReserved2());
		responseMap.put("reserved2", responseJson.getReserved2());

		responseMap.put("hmac", baseList.getHmac());

		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.debug("返回的报文为：" + responseString);

		return responseString;
	}

	/*
	 * JFD001短信服务请求接口
	 */
	public String jfd001(HttpServletRequest request, BaseList baseList) throws Exception {

		HashMap<String, String> responseMap = new HashMap<>();

		String singData = baseList.getInterCode() + baseList.getPartnerId() + baseList.getRequestId()
				+ baseList.getReturnCode() + baseList.getMessage() + baseList.getSignType() + baseList.getType()
				+ baseList.getVersion();

		JFD001Response responseJson = new JFD001Response();
		responseJson.setThirdAccount(request.getParameter("thirdAccount"));
		responseJson.setMobile(request.getParameter("mobile"));
		responseJson.setSmsCodeId("123456");

		singData = singData + responseJson.getThirdAccount() + responseJson.getMobile() + responseJson.getSmsCodeId()
				+ responseJson.getReserved1() + responseJson.getReserved2() + securtyKey;

		logger.debug("待加密字符串为：" + singData);

		baseList.setHmac(new MD5Encryption().getMD5(singData));

		responseMap.put("interCode", baseList.getInterCode());
		responseMap.put("partnerId", baseList.getPartnerId());
		responseMap.put("requestId", baseList.getRequestId());
		responseMap.put("returnCode", baseList.getReturnCode());
		responseMap.put("message", baseList.getMessage());
		responseMap.put("signType", baseList.getSignType());
		responseMap.put("type", baseList.getType());
		responseMap.put("version", baseList.getVersion());
		responseMap.put("thirdAccount", responseJson.getThirdAccount());
		responseMap.put("mobile", responseJson.getMobile());
		responseMap.put("smsCodeId", responseJson.getSmsCodeId());
		responseMap.put("reserved1", responseJson.getReserved2());
		responseMap.put("reserved2", responseJson.getReserved2());

		responseMap.put("hmac", baseList.getHmac());

		String responseString = "";
		for (String key : responseMap.keySet()) {
			String value = responseMap.get(key);
			if (responseString.isEmpty()) {
				responseString = key + "=" + value;
			} else {
				responseString = responseString + "&" + key + "=" + value;
			}
		}

		logger.debug("返回的报文为：" + responseString);

		return responseString;
	}

	public static void main(String[] args) {
		SpringApplication.run(CmccMockApplication.class, args);
	}
}