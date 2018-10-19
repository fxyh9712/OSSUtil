package com.fxyh.ossutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OSSConfigure {
	static Properties pro = new Properties();
	static FileInputStream in;
	static {
		try {
			in = new FileInputStream("src/main/resources/oss.properties");
			pro.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.err.println("文件输入流关闭失败");
				e.printStackTrace();
			}
		}
	}
	
	
	// 华南阿里云oss访问
	public static final String ENDPOINT = "http://"+pro.get("ENDPOINT").toString().trim();

	public static final String ACCESSKEYID = pro.get("ACCESSKEYID").toString().trim();
	public static final String ACCESSKEYSECRET = pro.get("ACCESSKEYSECRET").toString().trim();
	public static final String BUCKETNAME = pro.get("BUCKETNAME").toString().trim();
	// 实例地址
	public static final String ACCESSURL = "http://" + BUCKETNAME + "." + pro.get("ENDPOINT").toString().trim();

}
