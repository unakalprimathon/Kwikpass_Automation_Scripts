package com.kwikpass.pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.kwikpass.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public static WebDriver driver;
	public static Logger logger;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless=new");
		options.addArguments("enable-automation");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-notifications");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-extensions");
		options.addArguments("--test-type");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
//		options.addArguments("--remote-debugging-port=9222"); //devTool not connected issue
		options.addArguments("--remote-allow-origins=*");
//		options.addArguments("--window-size=1920,1080");
		options.addArguments("--window-size=1440,900");
		options.addArguments("--disable-gpu");
		options.addArguments("--dns-prefetch-disable");
//		options.addArguments("--allow-insecure-localhost");
		options.addArguments("Chrome/114.0.5735.90");
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		// cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setExperimentalOption("w3c", true);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		driver = new ChromeDriver(options);
		logger = Logger.getLogger("Kwikpass");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			logger.info("Thread sleep interrupted: " + e.getMessage());
		}
	}
}
