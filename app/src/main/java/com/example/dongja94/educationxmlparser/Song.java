package com.example.dongja94.educationxmlparser;

public class Song implements XMLObjectHandler {
	public int songId;
	public String songName;
	public Artists artists;
	public int albumId;
	public String albumName;
	public int currentRank;
	public int pastRank;
	public int playTime;
	public String issueDate;
	public String isTitleSong;
	public String isHitSong;
	public String isAdult;
	public String isFree;
	@Override
	public String toString() {
		return "("+currentRank+")"+songName;
	}
	@Override
	public XMLObjectHandler createChildHandler(String tag) {
		if ("artists".equals(tag)) {
			return new Artists();
		}
		return null;
	}
	@Override
	public void setData(String tag, Object value) {
		if ("songId".equals(tag)) {
			songId = Integer.parseInt((String) value);
		} else if ("songName".equals(tag)) {
			songName = (String)value;
		} else if ("artists".equals(tag)) {
			artists = (Artists)value;
		} else if ("albumId".equals(tag)) {
			albumId = Integer.parseInt((String) value);
		} else if ("albumName".equals(tag)) {
			albumName = (String)value;
		} else if ("currentRank".equals(tag)) {
			currentRank = Integer.parseInt((String) value);
		} else if ("pastRank".equals(tag)) {
			pastRank = Integer.parseInt((String) value);
		} else if ("playTime".equals(tag)) {
			playTime = Integer.parseInt((String) value);
		} else if ("issueDate".equals(tag)) {
			issueDate = (String)value;
		} else if ("isTitleSong".equals(tag)) {
			isTitleSong = (String)value;
		} else if ("isHitSong".equals(tag)) {
			isHitSong = (String)value;
		} else if ("isAdult".equals(tag)) {
			isAdult = (String)value;
		} else if ("isFree".equals(tag)) {
			isFree = (String)value;
		}
	}
}
