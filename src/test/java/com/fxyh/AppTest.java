package com.fxyh;

import org.junit.Test;

import com.fxyh.ossutil.storage.AliStorage;
import com.fxyh.ossutil.storage.ThumbModel;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void test1() {
		String key = "ocProject/image/20180911/0b1f998e-fb4f-40f8-8b3b-fa6ccfd6b8a8.jpeg";
		String url = AliStorage.getUrl(key);
		System.out.println("默认样式：" + url);
		String url2 = AliStorage.getUrl(key, ThumbModel.THUMB_48);
		System.out.println("THUMB_48样式：" + url2);
		
	}
	
	
}
