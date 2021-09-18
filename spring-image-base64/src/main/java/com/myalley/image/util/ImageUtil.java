package com.myalley.image.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ImageUtil {
	
	public static void main(String[] args) throws Exception {
		toBase64(null);
	}
	
	public static String toBase64(String imageUrl) throws Exception {
		if(imageUrl == null) {
			imageUrl = "http://code2.car2b.com/data/_NewCarDB/FrontImage/20140319/forte.png";
		}
		
		URL url = new URL(imageUrl);		
		BufferedImage img = ImageIO.read(url);		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();		
		ImageIO.write(img, "png", bos);
		byte[] imageBytes = bos.toByteArray();		
		String imageString = Base64.encodeBase64String(imageBytes);
		
		if(log.isDebugEnabled()) {
			log.debug("imageString={}", imageString);
		}
		
		return imageString;	
	}
	
}
