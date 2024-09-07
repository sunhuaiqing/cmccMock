package com.example.demo.base;

import java.util.HashMap;

/*
 * 将MAP中的值取出，并拼接成key=value&key2=value2...的形式
 */
public class spliceMap {

	public String getspliceMap(HashMap<String, String> mapIn) {

		String spliceString = null;

		for (String key : mapIn.keySet()) {
			String value = mapIn.get(key);
			if (spliceString == null) {
				spliceString = key + "=" + value;
			} else {
				spliceString = spliceString + "&" + key + "=" + value;
			}
		}

		return spliceString;
	}
}
