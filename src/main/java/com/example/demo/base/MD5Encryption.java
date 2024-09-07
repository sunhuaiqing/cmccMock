package com.example.demo.base;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class MD5Encryption {
	private static final Logger logger = LoggerFactory.getLogger(MD5Encryption.class);
	public String getMD5(String encryptString) throws Exception {
		String result = null;

		if (StringUtils.isEmpty(encryptString)) {
			return null;
		}
		try {
			// 首先进行实例化和初始化
			MessageDigest md = MessageDigest.getInstance("MD5");
			// 得到一个操作系统默认的字节编码格式的字节数组
			byte[] btInput = encryptString.getBytes();
			logger.info("MD5Encryption加密，byte[] btInput："+btInput);
			// 对得到的字节数组进行处理
			md.update(btInput);
			logger.info("MD5Encryption加密，md："+btInput);
			// 进行哈希计算并返回结果
			byte[] btResult = md.digest();
			logger.info("MD5Encryption加密，btResult："+btInput);
			// 进行哈希计算后得到的数据的长度
			StringBuffer sb = new StringBuffer();
			for (byte b : btResult) {
				int bt = b & 0xff;
				if (bt < 16) {
					sb.append(0);
				}
				sb.append(Integer.toHexString(bt));
			}
			result = sb.toString();
			logger.info("MD5Encryption加密，result："+btInput);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
}