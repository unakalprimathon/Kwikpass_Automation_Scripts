package com.kwikpass.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	public String getChromeDriverPath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
		
	}
	public String getfrommail() {
		String fromemail = pro.getProperty("fromemail");
		return fromemail;
		
	}
	public String getfrompass() {
		String frompass = pro.getProperty("frompass");
		return frompass;
		
	}
	public String gettoemail() {
		String toemail = pro.getProperty("toemail");
		return toemail;
		
	}
}
