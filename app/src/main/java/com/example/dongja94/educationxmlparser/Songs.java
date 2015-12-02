package com.example.dongja94.educationxmlparser;

import java.util.ArrayList;

public class Songs implements XMLObjectHandler {
	public ArrayList<Song> song = new ArrayList<Song>();

	@Override
	public XMLObjectHandler createChildHandler(String tag) {
		if ("song".equals(tag)) {
			return new Song();
		}
		return null;
	}

	@Override
	public void setData(String tag, Object value) {
		if ("song".equals(tag)) {
			song.add((Song)value);
		}
	}

}
