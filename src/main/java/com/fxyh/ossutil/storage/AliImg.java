package com.fxyh.ossutil.storage;

import java.io.Serializable;

import com.fxyh.ossutil.util.StringUtils;


public class AliImg implements Serializable {
	private static final long serialVersionUID = -3979286175667212921L;

	private String key;//oss的key
	private String url;//原图片的url
	
	private String url16;//
	private String url32;//
	private String url48;//
	private String url64;//
	private String url128;//
	private String url256;//
	private String url512;//
	
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url==null){
			this.url = AliWrapper.getUrl(key);
		}
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUrl16() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url16==null){
			this.url16 = AliWrapper.getUrl(key, ThumbModel.THUMB_16.getValue());
		}
		return this.url16;
	}
	public void setUrl16(String url16) {
		this.url16 = url16;
	}
		
	public String getUrl32() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url32==null){
			this.url32 = AliWrapper.getUrl(key, ThumbModel.THUMB_32.getValue());
		}
		return this.url32;
	}
	
	public void setUrl32(String url32) {
		this.url32 = url32;
	}
	
	
	public String getUrl48() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url48==null){
			this.url48 = AliWrapper.getUrl(key, ThumbModel.THUMB_48.getValue());
		}
		return this.url48;
	}
	public void setUrl48(String url48) {
		this.url48 = url48;
	}
	
	
	public String getUrl64() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url64==null){
			this.url64 = AliWrapper.getUrl(key, ThumbModel.THUMB_64.getValue());
		}
		return this.url64;
	}
	public void setUrl64(String url64) {
		this.url64 = url64;
	}
	
	
	public String getUrl128() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url128==null){
			this.url128 = AliWrapper.getUrl(key, ThumbModel.THUMB_128.getValue());
		}
		return this.url128;
	}
	public void setUrl128(String url128) {
		this.url128 = url128;
	}
	
	
	public String getUrl256() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url256==null){
			this.url256 = AliWrapper.getUrl(key, ThumbModel.THUMB_256.getValue());
		}
		return this.url256;
	}
	public void setUrl256(String url256) {
		this.url256 = url256;
	}
	
	
	public String getUrl512() {
		if(StringUtils.isEmpty(key)) return  null;
		if(this.url512==null){
			this.url512 = AliWrapper.getUrl(key, ThumbModel.THUMB_512.getValue());
		}
		return this.url512;
	}
	public void setUrl512(String url512) {
		this.url512 = url512;
	}
	
	
	
	
}
