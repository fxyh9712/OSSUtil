package com.fxyh.ossutil.storage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import com.aliyun.oss.OSSClient;
import com.fxyh.ossutil.OSSConfigure;
import com.fxyh.ossutil.OSSUtil;
import com.fxyh.ossutil.util.IOUtil;
import com.fxyh.ossutil.util.StringUtils;

/**
 * 阿里SDK的包装类，以便于业务使用
 * @author fxyh
 *
 */
public class AliWrapper {

	/**
	 * 
	 * @param data	 二进制格式的文件内容
	 * @return		文件在OSS中的key
	 */
	public static String upload(byte[] data) {
		String key = null;
		OSSClient ossClient = null;
		try {
			ossClient = OSSUtil.getOSSClient();
			String fileName = getFullKey(data, UUID.randomUUID().toString());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String tmpFolder = sdf.format(Calendar.getInstance().getTime());
			key = "ocProject/image/" + tmpFolder + "/" + fileName;
			OSSUtil.uploadByInputStream(ossClient, IOUtil.byte2Input(data), OSSConfigure.BUCKETNAME, key);
			System.out.println("文件上传成功，路径：" + key);
		} catch (Exception e) {
			System.out.println("图片上传失败:" + e);
			return null;
		} finally {
			if (ossClient != null) {
				ossClient.shutdown();
			}
		}
		return key;

	}
	
	/**
	 * 判断这个是什么图片类型
	 * @param data
	 * @param key
	 * @return
	 */
	public static String getFullKey(byte[] data, String key) {
		FileType type = FileTypeHelper.getType(data);
		if (type != null) {
			return key + "." + type.name().toLowerCase();
		} else {
			return key;
		}
	}

	/**
	 * 获取多个key图片；
	 * 
	 * @param keys
	 *            逗号隔开的多个key;
	 * @param model
	 * @return
	 */
	public static List<String> getUrls(String keys, String model) {
		List<String> list = null;
		if (StringUtils.isNotBlank(keys)) {
			list = new ArrayList<String>();
			for (String key : keys.split(",")) {
				list.add(getUrl(key, model));
			}
		}
		return list;
	}

	/**
	 * 获取单个key图片；
	 * @param key
	 * @return
	 */
	public static String getUrl(String key) {
		if (!StringUtils.isEmpty(key)) {
			return OSSConfigure.ACCESSURL + "/" + key + "/THUMB_0";
		}
		return null;
	}

	/**
	 * 获取单个key图片；
	 * @param key
	 * @param model
	 * @return
	 */
	public static String getUrl(String key, String model) {
		if (StringUtils.hasText(model)) {
			return OSSConfigure.ACCESSURL + "/" + key + "/" + model;
		} else {
			return OSSConfigure.ACCESSURL + "/" + key + "/THUMB_0";
		}
	}

}
