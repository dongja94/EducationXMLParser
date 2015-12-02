package com.example.dongja94.educationxmlparser;

public interface XMLObjectHandler {
	public XMLObjectHandler createChildHandler(String tag);
	public void setData(String tag, Object value);
}
