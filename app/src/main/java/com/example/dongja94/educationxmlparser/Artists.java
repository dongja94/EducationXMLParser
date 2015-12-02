package com.example.dongja94.educationxmlparser;

import java.util.ArrayList;

public class Artists implements XMLObjectHandler {
	public ArrayList<Artist> artist = new ArrayList<Artist>();

	@Override
	public XMLObjectHandler createChildHandler(String tag) {
		if ("artist".equals(tag)) {
			return new Artist();
		}
		return null;
	}

	@Override
	public void setData(String tag, Object value) {
		if ("artist".equals(tag)) {
			artist.add((Artist)value);
		}
	}

}
