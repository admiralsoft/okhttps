package com.ejlchina.okhttps;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class FastJsonObj implements JsonObj {

	private JSONObject json;
	
	public FastJsonObj(JSONObject json) {
		this.json = json;
	}

	@Override
	public int size() {
		return json.size();
	}

	@Override
	public boolean isEmpty() {
		return json.isEmpty();
	}

	@Override
	public JsonObj getJsonOjb(String key) {
		JSONObject subJson = json.getJSONObject(key);
		if (subJson != null) {
			return new FastJsonObj(subJson);
		}
		return null;
	}

	@Override
	public JsonArr getJsonArr(String key) {
		JSONArray subJson = json.getJSONArray(key);
		if (subJson != null) {
			return new FastJsonArr(subJson);
		}
		return null;
	}

	@Override
	public Boolean getBool(String key) {
		return json.getBoolean(key);
	}

	@Override
	public boolean getBoolVal(String key) {
		return json.getBooleanValue(key);
	}

	@Override
	public Integer getInt(String key) {
		return json.getInteger(key);
	}

	@Override
	public int getIntVal(String key) {
		return json.getIntValue(key);
	}

	@Override
	public Short getShort(String key) {
		return json.getShort(key);
	}

	@Override
	public short getShortVal(String key) {
		return json.getShortValue(key);
	}

	@Override
	public Float getFloat(String key) {
		return json.getFloat(key);
	}

	@Override
	public float getFloatVal(String key) {
		return json.getFloatValue(key);
	}

	@Override
	public Double getDouble(String key) {
		return json.getDouble(key);
	}

	@Override
	public double getDoubleVal(String key) {
		return json.getDoubleValue(key);
	}

	@Override
	public String getString(String key) {
		return json.getString(key);
	}

	@Override
	public BigDecimal getBigDecimal(String key) {
		return json.getBigDecimal(key);
	}

	@Override
	public BigInteger getBigInteger(String key) {
		return json.getBigInteger(key);
	}
	
	@Override
	public boolean has(String key) {
		return json.containsKey(key);
	}

	@Override
	public Set<String> keySet() {
		return json.keySet();
	}

}