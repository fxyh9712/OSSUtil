package com.fxyh;

import java.io.File;

import org.junit.Test;

import com.fxyh.ossutil.storage.AliStorage;
import com.fxyh.ossutil.storage.ThumbModel;
import com.fxyh.ossutil.util.CommonUtil;

/**
 * 测试工具类使用
 */
public class AppTest{
	
	@Test
	public void test1() {
		String key = "ocProject/image/20180911/0b1f998e-fb4f-40f8-8b3b-fa6ccfd6b8a8.jpeg";
		String url = AliStorage.getUrl(key);
		System.out.println("默认样式：" + url);
		String url2 = AliStorage.getUrl(key, ThumbModel.THUMB_48);
		System.out.println("THUMB_48样式：" + url2);
		
		byte[] buff = CommonUtil.getFileBytes(new File("/home/fxyh/tools/DemoList/MyUtils/OSSUtil/src/main/resources/oss.png"));
		String uploadImageKey = AliStorage.uploadImage(buff);
		System.out.println(uploadImageKey);
		
	}
	
	
}
