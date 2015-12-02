package com.example.dongja94.educationxmlparser;

public class Artist implements XMLObjectHandler {
	public int artistId;
	public String artistName;
	@Override
	public XMLObjectHandler createChildHandler(String tag) {
		return null;
	}
	
	@Override
	public void setData(String tag, Object value) {
		if ("artistId".equals(tag)) {
			artistId = Integer.parseInt((String) value);
		} else if ("artistName".equals(tag)) {
			artistName = (String)value;
		}
	}
}
