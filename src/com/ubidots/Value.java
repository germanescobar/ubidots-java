package com.ubidots;

import java.util.Map;

public class Value extends ApiObject {

	Value(Map<String, Object> raw, ApiClient api) {
		super(raw, api);
	}
	
	public int getTimestamp() {
		return Integer.valueOf(getAttributeString("timestamp")).intValue();
	}
	
	public double getValueDouble() {
		return getAttributeDouble("value").doubleValue();
	}
	
	public int getValueInt() {
		return getAttributeInteger("value").intValue();
	}
}