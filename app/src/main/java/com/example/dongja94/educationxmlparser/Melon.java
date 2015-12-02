package com.example.dongja94.educationxmlparser;

public class Melon implements XMLObjectHandler {
	public int menuId;
	public int count;
	public int page;
	public int totalPages;
	public String rankDay;
	public String rankHour;
	public Songs songs;
	@Override
	public XMLObjectHandler createChildHandler(String tag) {
		if ("songs".equals(tag)) {
			return new Songs();
		}
		return null;
	}
	@Override
	public void setData(String tag, Object value) {
		if ("menuId".equals(tag)) {
			menuId = Integer.parseInt((String) value);
		} else if ("count".equals(tag)) {
			count = Integer.parseInt((String) value);
		} else if ("page".equals(tag)) {
			page = Integer.parseInt((String) value);
		} else if ("totalPages".equals(tag)) {
			totalPages = Integer.parseInt((String) value);
		} else if ("rankDay".equals(tag)) {
			rankDay = (String)value;
		} else if ("rankHour".equals(tag)) {
			rankHour = (String)value;
		} else if ("songs".equals(tag)) {
			songs = (Songs)value;
		}
	}
}
