package com.fxyh.ossutil.storage;

public enum ThumbModel {

	THUMB_16("THUMB_16"),
	THUMB_32("THUMB_32"),
	THUMB_48("THUMB_48"),
	THUMB_64("THUMB_64"),
	THUMB_128("THUMB_128"),
	THUMB_256("THUMB_256"),
	THUMB_512("THUMB_512");
	
	private String value;

	private ThumbModel(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
