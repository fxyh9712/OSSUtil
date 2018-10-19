package com.fxyh.ossutil.storage;

/**
 * 上传图像和查看图像
 * @author fxyh
 *
 */
public class AliStorage {
	
	/**
	 * 上传单张图片；返回上传图片的key
	 * @param buff
	 */
	public static String uploadImage(byte[] buff){
		String key = AliWrapper.upload(buff);
		return key;
	}
	
	/**
	 * 上传单张图片；返回上传图片的url
	 * @param buff
	 * @param img
	 * @return
	 */
	public static AliImg uploadImage(byte[] buff,AliImg img){
		String key = AliWrapper.upload(buff);
		img.setKey(key);
		return img;
	}
	
	
	/**
	 * 上传多个图片
	 * @param imageBuffs 图片字节数组
	 * @param img 分组图片的属性
	 * @return
	 */
	public static AliImg[] uploadImages(byte[][] imageBuffs,AliImg img){
		AliImg[] images = new AliImg[imageBuffs.length];
		for(int i = 0; i < imageBuffs.length; i++){
			AliImg newImg = new AliImg();
			uploadImage(imageBuffs[i],img);
			newImg.setKey(img.getKey());
			images[i] = newImg;
		}
		return images;
	}
	
	
	/**
	 * 获取图片链接
	 * @param key
	 * @return
	 */
	public static String getUrl(String key){
		return AliWrapper.getUrl(key);
	}
	
		
	/**
	 * 获取图片链接
	 * @param key
	 * @return
	 */
	public static String getUrl(String key,ThumbModel model){
		return AliWrapper.getUrl(key,model.getValue());
	}
}
