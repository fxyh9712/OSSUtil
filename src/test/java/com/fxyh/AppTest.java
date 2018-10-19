package com.fxyh;

import org.junit.Test;

import com.fxyh.ossutil.storage.AliWrapper;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
	@Test
	public void test1() {
		String url = AliWrapper.getUrl("ocProject/image/20180911/0b1f998e-fb4f-40f8-8b3b-fa6ccfd6b8a8.jpeg");
		System.out.println(url);
	}
	
	
}
