package com.kwikpass.dailycheck;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwikpass.pageObjects.BaseClass;
import com.kwikpass.pageObjects.Locator;
import com.kwikpass.pageObjects.LoginPage;

public class All_Live_Merchant_Shopify_login_and_session_creation_after_Kwikpass_login_daily_check extends BaseClass implements Locator{
	
	@Test
	public void Verify_AdilQadri_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_AdilQadri_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.adilqadri.com/");
		logger.info("URL is open");
		logger.info("AdilQadri does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.adilqadri.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in AdilQadri after Kwikpass login passed.");
			logger.info("Verify_AdilQadri_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in AdilQadri after Kwikpass login failed.");
			logger.info("Verify_AdilQadri_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_AdilQadri_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_AdilQadri_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Amydus_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Amydus_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.amydus.com/");
		logger.info("URL is open");
		logger.info("Amydus does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.amydus.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Amydus after Kwikpass login passed.");
			logger.info("Verify_Amydus_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Amydus after Kwikpass login failed.");
			logger.info("Verify_Amydus_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Amydus_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Amydus_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()throws IOException, InterruptedException {
		logger.info("Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://assemblytravel.com/");
		logger.info("URL is open");
		logger.info("Assembly has Kwikpass AP");
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://assemblytravel.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Assembly_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}
	}
	
	@Test
	public void Verify_Bersache_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Bersache_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://bersache.com/");
		logger.info("URL is open");
		logger.info("Bersache does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://bersache.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Bersache after Kwikpass login passed.");
			logger.info("Verify_Bersache_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Bersache after Kwikpass login failed.");
			logger.info("Verify_Bersache_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Bersache_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Bersache_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Blue_island_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Blue_island_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://blueisland.in/");
		logger.info("URL is open");
		logger.info("Blue_island does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(Blue_island_kp_login_btn));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(10);
		lp.switchToIframe(Blue_island_iframe);
		WebElement closepopup = driver.findElement(By.className(Blue_island_close_popup));
		WebDriverWait closepopup_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closepopup_wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		if (closepopup.isDisplayed()) {
			closepopup.click();
			logger.info("closed popup");
		}
		driver.switchTo().defaultContent();
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.xpath(Blue_island_kp_login_btn));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://blueisland.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Blue_island after Kwikpass login passed.");
			logger.info("Verify_Blue_island_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Blue_island after Kwikpass login failed.");
			logger.info("Verify_Blue_island_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Blue_island_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Blue_island_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_BlueTyga_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_BlueTyga_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://bluetyga.com/");
		logger.info("URL is open");
		logger.info("BlueTyga does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.className(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.className(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(BlurTgya_orderhistory)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://bluetyga.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in BlueTyga after Kwikpass login passed.");
			logger.info("Verify_BlueTyga_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in BlueTyga after Kwikpass login failed.");
			logger.info("Verify_BlueTyga_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_BlueTyga_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_BlueTyga_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_Bombae_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Bombae_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://mybombae.in/");
		logger.info("URL is open");
		logger.info("Bombae does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(bombae_orderhistory)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://mybombae.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.className(bombae_acclogout)).isDisplayed();
			logger.info("Shopify login and session created in Bombae after Kwikpass login passed.");
			logger.info("Verify_Bombae_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Bombae after Kwikpass login failed.");
			logger.info("Verify_Bombae_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Bombae_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Bombae_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		WebElement order_history_btn = driver.findElement(By.xpath(orderhistory_btn));
		WebDriverWait order_history_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		order_history_btn_wait.until(ExpectedConditions.elementToBeClickable(order_history_btn));
		order_history_btn.click();
		logger.info("Clicked order_history_btn");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.bombayshavingcompany.com/account#order";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(BSC_logout)).isDisplayed();
			logger.info("Shopify login and session created in BSC after Kwikpass login passed.");
			logger.info("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in BSC after Kwikpass login failed.");
			logger.info("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Dennis_Lingo_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Dennis_Lingo_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.dennislingo.com/");
		logger.info("URL is open");
		logger.info("Dennis_Lingo does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.dennislingo.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Dennis_Lingo after Kwikpass login passed.");
			logger.info("Verify_Dennis_Lingo_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Dennis_Lingo after Kwikpass login failed.");
			logger.info("Verify_Dennis_Lingo_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Dennis_Lingo_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Dennis_Lingo_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://www.dotandkey.com/");
		logger.info("URL is open");
		logger.info("Dot_And_Key has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click();
			By logoutbtn = By.xpath(logout_btn);
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				driver.findElement(By.xpath(orderhistory_btn)).click();
				sleep(10);
				String curl = driver.getCurrentUrl();
				String vurl = "https://www.dotandkey.com/account";
				if (curl.equals(vurl)) {
					driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
					logger.info("Shopify login and session created in Dot_And_Key after Kwikpass login .");
					logger.info("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in Dot_And_Key after Kwikpass login .");
					logger.info("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
					captureScreen(driver, "Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
					Assert.fail("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				}
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
				captureScreen(driver, "Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
				Assert.fail("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Dot_And_Key_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Eyewearlabs_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Eyewearlabs_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.eyewearlabs.com/");
		logger.info("URL is open");
		logger.info("Eyewearlabs does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click(); 
		sleep(8);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.eyewearlabs.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Eyewearlabs after Kwikpass login .");
			logger.info("Verify_Eyewearlabs_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Eyewearlabs after Kwikpass login .");
			logger.info("Verify_Eyewearlabs_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Eyewearlabs_Shopify_login_and_session_creation_after_Kwikpass_login failed!");
			Assert.fail("Verify_Eyewearlabs_Shopify_login_and_session_creation_after_Kwikpass_login failed!");
		}

	}
	
	@Test
	public void Verify_FireBoltt_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_FireBoltt_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.fireboltt.com/");
		logger.info("URL is open");
		logger.info("FireBoltt does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.fireboltt.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in FireBoltt after Kwikpass login passed.");
			logger.info("Verify_FireBoltt_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in FireBoltt after Kwikpass login failed.");
			logger.info("Verify_FireBoltt_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_FireBoltt_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_FireBoltt_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Formen_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Formen_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.formen.health/");
		logger.info("URL is open");
		logger.info("Formen does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(15);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.formen.health/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Formen after Kwikpass login passed.");
			logger.info("Verify_Formen_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Formen after Kwikpass login failed.");
			logger.info("Verify_Formen_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Formen_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Formen_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_Foxtale_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Foxtale_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://foxtale.in/");
		logger.info("URL is open");
		logger.info("Foxtale does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		WebElement order_history_btn = driver.findElement(By.xpath(orderhistory_btn));
		WebDriverWait order_history_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		order_history_btn_wait.until(ExpectedConditions.elementToBeClickable(order_history_btn));
		order_history_btn.click();
		logger.info("Clicked order_history_btn");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://foxtale.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Foxtale after Kwikpass login passed.");
			logger.info("Verify_Foxtale_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Foxtale after Kwikpass login failed.");
			logger.info("Verify_Foxtale_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Foxtale_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Foxtale_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Freakins_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Freakins_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://freakins.com/pages/men/");
		logger.info("URL is open");
		logger.info("Freakins does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://freakins.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Freakins after Kwikpass login passed.");
			logger.info("Verify_Freakins_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Freakins after Kwikpass login failed.");
			logger.info("Verify_Freakins_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Freakins_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Freakins_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_GBT_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_GBT_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://growbilliontrees.com/");
		logger.info("URL is open");
		logger.info("GBT does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://growbilliontrees.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in GBT after Kwikpass login passed.");
			logger.info("Verify_GBT_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in GBT after Kwikpass login failed.");
			logger.info("Verify_GBT_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_GBT_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_GBT_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://genietravel.com/");
		logger.info("URL is open");
		logger.info("GenieBags has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://genietravel.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Genie Bags after Kwikpass login .");
				logger.info("Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Genie Bags after Kwikpass login .");
				logger.info("Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_GenieBags_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}
	}
	
	@Test
	public void Verify_Grandmaa_Secret_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Grandmaa_Secret_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://grandmaasecret.com/");
		logger.info("URL is open");
		logger.info("Grandmaa_Secret does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://grandmaasecret.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Grandmaa_Secret after Kwikpass login passed.");
			logger.info("Verify_Grandmaa_Secret_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Grandmaa_Secret after Kwikpass login failed.");
			logger.info("Verify_Grandmaa_Secret_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Grandmaa_Secret_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Grandmaa_Secret_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Gritstones_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Gritstones_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.gritstones.com/");
		logger.info("URL is open");
		logger.info("Gritstones does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.gritstones.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Gritstones after Kwikpass login passed.");
			logger.info("Verify_Gritstones_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Gritstones after Kwikpass login failed.");
			logger.info("Verify_Gritstones_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Gritstones_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Gritstones_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		WebElement kp_before_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_before_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_before_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_before_login_btn));
		kp_before_login_btn.click();
		logger.info("Clicked Kwikpass icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(20);
		String curl = driver.getCurrentUrl();
		String vurl = "https://guniaa.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Guniaa after Kwikpass login .");
			logger.info("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Login_Modal Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Guniaa after Kwikpass login .");
			logger.info("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Login_Modal Test Case failed!");
			captureScreen(driver, "Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Login_Modal failed");
			Assert.fail("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Hammer_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Hammer_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://hammeronline.in/");
		logger.info("URL is open");
		logger.info("Hammer does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));   
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked Kwikpass icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://hammeronline.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Hammer after Kwikpass login .");
			logger.info("Verify_Hammer_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Hammer after Kwikpass login .");
			logger.info("Verify_Hammer_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Hammer_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Hammer_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://hausandkinder.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://heelium.in/");
		logger.info("URL is open");
		logger.info("Heelium has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://heelium.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Heelium_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		sleep(2);
		By closehok = By.xpath(hokclose);
		boolean closehokPresent = !driver.findElements(closehok).isEmpty();
		if(closehokPresent) {
			driver.findElement(closehok).click();
			logger.info("closed merchant popups");
		}
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked Kwikpass Icon");
		driver.findElement(By.xpath(hokorderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://houseofkari.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in HOK after Kwikpass login .");
			logger.info("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in HOK after Kwikpass login .");
			logger.info("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://houseofmangalam.com/");
		logger.info("URL is open");
		logger.info("HOM has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click(); 
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://houseofmangalam.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in HOM after Kwikpass login .");
				logger.info("Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in HOM after Kwikpass login .");
				logger.info("Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_HOM_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}

	@Test
	public void Verify_Includ_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Includ_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://includ.com/");
		logger.info("URL is open");
		logger.info("Includ does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		logger.info("switched to main page");
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		logger.info("clicked on kwikpass icon");
		driver.findElement(By.xpath(orderhistory_btn)).click();  
		logger.info("clicked order history");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://includ.com/account";
		if (curl.equals(vurl)) {
			logger.info("Shopify login and session created in Includ after Kwikpass login .");
			logger.info("Verify_Includ_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Includ after Kwikpass login .");
			logger.info("Verify_Includ_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Includ_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Includ_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://www.italiancolony.com/");
		logger.info("URL is open");
		logger.info("Italian_Colony has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.italiancolony.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Italian_Colony_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}

	@Test
	public void Verify_Krishnaayurved_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Krishnaayurved_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://krishnaayurved.com/");
		logger.info("URL is open");
		logger.info("Krishnaayurved does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked Kwikpass Icon");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://krishnaayurved.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Krishnaayurved after Kwikpass login .");
			logger.info("Verify_Krishnaayurved_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Krishnaayurved after Kwikpass login .");
			logger.info("Verify_Krishnaayurved_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Krishnaayurved_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Krishnaayurved_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_Levis_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Levis_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://levi.in/");
		logger.info("URL is open");
		logger.info("Levis does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(Levis_kwikpass_login_btn));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.className(Levis_kwikpass_aflogin));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(Levis_orderbtn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://levi.in/pages/order-details";
		if (curl.equals(vurl)) {
			logger.info("Shopify login and session created in Levis after Kwikpass login passed.");
			logger.info("Verify_Levis_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Levis after Kwikpass login failed.");
			logger.info("Verify_Levis_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Levis_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Levis_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_LotusBotanical_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException, InterruptedException {
		logger.info("Verify_LotusBotanicals_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.lotusbotanicals.com/");
		logger.info("URL is open");
		logger.info("LotusBotanicals does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.lotusbotanicals.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in LotusBotanicals after Kwikpass login passed.");
			logger.info("Verify_LotusBotanicals_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in LotusBotanicals after Kwikpass login failed.");
			logger.info("Verify_LotusBotanicals_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_LotusBotanicals_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_LotusBotanicals_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_Luxaderme_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Luxaderme_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://luxaderme.in/");
		logger.info("URL is open");
		logger.info("Luxaderme does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://luxaderme.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Luxaderme after Kwikpass login passed.");
			logger.info("Verify_Luxaderme_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Luxaderme after Kwikpass login failed.");
			logger.info("Verify_Luxaderme_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Luxaderme_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Luxaderme_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://miglowstore.in/");
		logger.info("URL is open");
		logger.info("MiGlow has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://miglowstore.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_MiGlow_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}

	@Test
	public void Verify_Mivi_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Mivi_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.mivi.in/");
		logger.info("URL is open");
		logger.info("Mivi does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		lp.switchToIframe(Mivi_popup_iframe);
		WebElement close = driver.findElement(By.className(Mivi_close_popup_btn));
		WebDriverWait close_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		close_wait.until(ExpectedConditions.elementToBeClickable(close));
		if (close.isDisplayed()) {
			close.click();
			logger.info("close popup");
		}
		driver.switchTo().defaultContent();
		sleep(2);
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.mivi.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Mivi after Kwikpass login passed.");
			logger.info("Verify_Mivi_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Mivi after Kwikpass login failed.");
			logger.info("Verify_Mivi_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Mivi_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Mivi_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_MyFitness_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException, InterruptedException {
		logger.info("Verify_MyFitness_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://myfitness.in/");
		logger.info("URL is open");
		logger.info("MyFitness does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://myfitness.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Myfitness after Kwikpass login .");
			logger.info("Verify_MyFitness_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Myfitness after Kwikpass login .");
			logger.info("Verify_MyFitness_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_MyFitness_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_MyFitness_Shopify_login_and_session_creation_after_Kwikpass_login Failed");
		}

	}
	
	@Test
	public void Verify_MyWishCare_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_MyWishCare_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.mywishcare.com/");
		logger.info("URL is open");
		logger.info("MyWishCare does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		sleep(2);
		WebElement nothanks = driver.findElement(By.xpath(MyWishCare_closepopup));
		WebDriverWait nothanks_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		nothanks_wait.until(ExpectedConditions.elementToBeClickable(nothanks));
		if (nothanks.isDisplayed()) {
			nothanks.click();
			logger.info("Closed popup");
		}
		sleep(2);
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.mywishcare.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in MyWishCare after Kwikpass login passed.");
			logger.info("Verify_MyWishCare_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in MyWishCare after Kwikpass login failed.");
			logger.info("Verify_MyWishCare_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_MyWishCare_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_MyWishCare_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login() throws IOException, InterruptedException {
		logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login Test case is running.....");
		driver.get("https://nobero.com/");
		logger.info("URL is open");
		logger.info("Nobero does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		WebElement popup = driver.findElement(By.xpath(nobero_close_iframe));
		WebDriverWait popup_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		popup_wait.until(ExpectedConditions.elementToBeClickable(popup));
		if (popup.isDisplayed()) {
			popup.click();
			logger.info("closed popup");
		}
		driver.switchTo().defaultContent();
		sleep(2);
		WebElement dropdown = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(nobero_login_btn)); 
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement dropdown1 = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(nobero_myaccount));
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			myaccount.click();
			sleep(8);
			String url = driver.getCurrentUrl();
			String vurl = "https://nobero.com/account";
			if(url.equals(vurl)) {
				driver.findElement(By.xpath(nobero_logout_btn)).isDisplayed();
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Test case completed");
			}else {
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				captureScreen(driver, "Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				Assert.fail("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			}
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			captureScreen(driver, "Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			Assert.fail("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
		}
	}
	
	@Test
	public void Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://pune.nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive_Pune does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.className(Nurserylive_Pune_kp_icon));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_afterlogin_btn = driver.findElement(By.className(Nurserylive_Pune_myaccount_btn));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked Myaccount btn");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://pune.nurserylive.com/account";
		if (curl.equals(vurl)) {			
			logger.info("Shopify login and session created in Nurserylive_Pune after Kwikpass login .");
			logger.info("Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Nurserylive_Pune after Kwikpass login .");
			logger.info("Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://organicbazar.net/");
		logger.info("URL is open");
		logger.info("Organic_Bazaar has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click(); 
			By logoutbtn = By.xpath(logout_btn); 
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				driver.findElement(By.xpath(orderhistory_btn)).click();
				sleep(10);
				String curl = driver.getCurrentUrl();
				String vurl = "https://organicbazar.net/account";
				if (curl.equals(vurl)) {
					driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
					logger.info("Shopify login and session created in Organic Bazaar after Kwikpass login .");
					logger.info("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in Organic Bazaar after Kwikpass login .");
					logger.info("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
					captureScreen(driver, "Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
					Assert.fail("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				}
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
				captureScreen(driver, "Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
				Assert.fail("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			Assert.fail("Verify_Organic_Bazaar_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}
	}
	
	@Test
	public void Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://photojewels.in/");
		logger.info("URL is open");
		logger.info("Photo_Jewels has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://photojewels.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Photo_Jewels_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException, InterruptedException {
		logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click(); 
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://pinkfort.co/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Pinkfort after Kwikpass login .");
				logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Pinkfort after Kwikpass login .");
				logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
				captureScreen(driver, "Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
				Assert.fail("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			}
			
		} else {
			logger.info("Shopify login and session not created after Kwikpass login.");
			logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login test case failed !");
			captureScreen(driver, "Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://plumgoodness.com/");
		logger.info("URL is open");
		logger.info("Plum_Goodness has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(20);
			String curl = driver.getCurrentUrl();
			String vurl = "https://plumgoodness.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Plum_Goodness_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Portronics_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Portronics_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.portronics.com/");
		logger.info("URL is open");
		logger.info("Portronics does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(Portronics_iframe);
		WebElement allow = driver.findElement(By.xpath(Portronics_allow));
		WebDriverWait allow_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		allow_wait.until(ExpectedConditions.elementToBeClickable(allow));
		if (allow.isDisplayed()) {
			allow.click();
			logger.info("Clicked allow btn");
		}
		driver.switchTo().defaultContent();
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(15);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.portronics.com/account?p=0";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Portronics after Kwikpass login passed.");
			logger.info("Verify_Portronics_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Portronics after Kwikpass login failed.");
			logger.info("Verify_Portronics_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Portronics_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Portronics_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://pueronline.in/");
		logger.info("URL is open");
		logger.info("Puer has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://pueronline.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Puer_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://www.ritualistic.in/");
		logger.info("URL is open");
		logger.info("Ritualistic has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			lp.switchToIframe(Ritualistic_iframe);
			WebElement popup = driver.findElement(By.className(Ritualistic_close_popup));
			WebDriverWait popup_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			popup_wait.until(ExpectedConditions.elementToBeClickable(popup));
			if (popup.isDisplayed()) {
				popup.click();
				logger.info("closed popup");
			}
			driver.switchTo().defaultContent();
			WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
			WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
			kp_after_login_btn.click();
			By logoutbtn = By.xpath(logout_btn);
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				driver.findElement(By.xpath(orderhistory_btn)).click();
				sleep(10);
				String curl = driver.getCurrentUrl();
				String vurl = "https://www.ritualistic.in/account";
				if (curl.equals(vurl)) {
					driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
					logger.info("Shopify login and session created in Ritualistic after Kwikpass login .");
					logger.info("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in Ritualistic after Kwikpass login .");
					logger.info("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
					captureScreen(driver, "Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
					Assert.fail("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				}
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
				captureScreen(driver, "Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
				Assert.fail("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Ritualistic_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://saadaa.in/");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(Saadaa_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked hamburger button");
		sleep(3);
		WebElement kwikpass_btn = driver.findElement(By.id(Saadaa_kwikpass_btn));
		WebDriverWait kwikpass_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kwikpass_btn_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn));
		kwikpass_btn.click();
		logger.info("Clicked kwikpass_btn");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		lp.switchToIframe(Saadaa_popup_iframe);
		WebElement popup = driver.findElement(By.className(Saadaa_popup_close));
		WebDriverWait popup_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		popup_wait.until(ExpectedConditions.elementToBeClickable(popup));
		if (popup.isDisplayed()) {
			popup.click();
			logger.info("close saadaa popup");
		}
		driver.switchTo().defaultContent();
		String x = driver.findElement(By.id(Saadaa_account_txt)).getText();
		logger.info(x);
		String x11 = "ACCOUNT";
		if (x.equals(x11)) {
			logger.info("Login Successful !");
			WebElement kwikpass_btn1 = driver.findElement(By.id(Saadaa_account_txt));
			WebDriverWait kwikpass_btn1_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			kwikpass_btn1_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn1));
			kwikpass_btn1.click();
			logger.info("Clicked kwikpass_btn");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://saadaa.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://safaribags.com/");
		logger.info("URL is open");
		logger.info("SafariBags does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click(); 
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://safaribags.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Pinkfort after Kwikpass login .");
				logger.info("Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Pinkfort after Kwikpass login .");
				logger.info("Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
				captureScreen(driver, "Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login failed");
				Assert.fail("Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			}
			
		} else {
			logger.info("Shopify login and session not created after Kwikpass login.");
			logger.info("Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login test case failed !");
			captureScreen(driver, "Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_SafariBags_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://serekoshop.com/");
		logger.info("URL is open");
		logger.info("Sereko has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://serekoshop.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Sereko after Kwikpass login .");
				logger.info("Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Sereko after Kwikpass login .");
				logger.info("Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Sereko_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}
	}
	
	@Test
	public void Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click();
			By logoutbtn = By.xpath(logout_btn);
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				driver.findElement(By.xpath(orderhistory_btn)).click();
				sleep(10);
				String curl = driver.getCurrentUrl();
				String vurl = "https://www.silvertraq.com/account";
				if (curl.equals(vurl)) {
					driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
					logger.info("Shopify login and session created in Silvertraq after Kwikpass login .");
					logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in Silvertraq after Kwikpass login .");
					logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
					captureScreen(driver, "Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
					Assert.fail("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				}
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
				captureScreen(driver, "Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
				Assert.fail("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}

	@Test
	public void Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://swissbeauty.in/");
		logger.info("URL is open");
		logger.info("Swiss_Beauty does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click(); 
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://swissbeauty.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Pinkfort after Kwikpass login .");
				logger.info("Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Pinkfort after Kwikpass login .");
				logger.info("Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
				captureScreen(driver, "Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login failed");
				Assert.fail("Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			}
			
		} else {
			logger.info("Shopify login and session not created after Kwikpass login.");
			logger.info("Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login test case failed !");
			captureScreen(driver, "Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Swiss_Beauty_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://thehatke.com/");
		logger.info("URL is open");
		logger.info("TheHatke has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(hatke_login_btn));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		By logoutbtn = By.xpath(acc_logout_btn); 
		By orderhistorybtn = By.xpath(hatke_myaccount_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent || orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(hatke_myaccount_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://thehatke.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_TheHatke_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	

	@Test
	public void Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://theloveco.in/");
		logger.info("URL is open");
		logger.info("TheLoveCO has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent || orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(18);
			String curl = driver.getCurrentUrl();
			String vurl = "https://theloveco.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_TheLoveCO_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True Elements has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(True_Elements_kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click(); 
			sleep(8);
			String curl = driver.getCurrentUrl();
			String vurl = "https://true-elements.com/account";
			if (curl.equals(vurl)) {
				logger.info("Shopify login and session created in TrueElements after Kwikpass login .");
				logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in TrueElements after Kwikpass login .");
				logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	

	@Test
	public void Verify_Urbangabru_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Urbangabru_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.urbangabru.in/");
		logger.info("URL is open");
		logger.info("Urbangabru does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.urbangabru.in/account";
		if (curl.equals(vurl)) {
			logger.info("Shopify login and session created in Urbangabru after Kwikpass login passed.");
			logger.info("Verify_Urbangabru_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Urbangabru after Kwikpass login failed.");
			logger.info("Verify_Urbangabru_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Urbangabru_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Urbangabru_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://urbanjungle.shop/");
		logger.info("URL is open");
		logger.info("Urban Jungle has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement close = driver.findElement(By.xpath(urbanjungle_popupclose));
		if(close.isDisplayed()) {
			WebDriverWait close_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			close_wait.until(ExpectedConditions.elementToBeClickable(close));
			close.click();
		}
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://urbanjungle.shop/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_UrbanJungle_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Weryze_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://weryze.com/");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(8);
		WebElement spin = driver.findElement(By.className(weryze_spinwheel));
		WebDriverWait spin_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spin_wait.until(ExpectedConditions.elementToBeClickable(spin));
		if (spin.isDisplayed()) {
			spin.click();
			logger.info("Closed spin wheel");
		}
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://weryze.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Weryze after Kwikpass login .");
			logger.info("Verify_Weryze_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Weryze after Kwikpass login .");
			logger.info("Verify_Weryze_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Weryze_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Weryze_Shopify_login_and_session_creation_after_Kwikpass_login Failed");
		}

	}
	
	@Test
	public void Verify_Whatsup_Wellness_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://whatsupwellness.in/");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(whatsup_wellness_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked Hamburger");
		sleep(2);
		WebElement login_btn = driver.findElement(By.xpath(whatsup_wellness_login_btn));
		WebDriverWait login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		login_btn_wait.until(ExpectedConditions.elementToBeClickable(login_btn));
		login_btn.click();
		logger.info("Clicked login btn");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement after_login_btn = driver.findElement(By.xpath(whatsup_wellness_login_btn));
		WebDriverWait after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(after_login_btn));
		after_login_btn.click();
		logger.info("Clicked Account btn");
		sleep(15);
		String curl = driver.getCurrentUrl();
		String vurl = "https://whatsupwellness.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Whatsup_Wellness after Kwikpass login .");
			logger.info("Verify_Whatsup_Wellness_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Whatsup_Wellness after Kwikpass login .");
			logger.info("Verify_Whatsup_Wellness_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Whatsup_Wellness_Shopify_login_and_session_creation_after_Kwikpass_login Failed");
		}
	}
	
	@Test
	public void Verify_Xctasy_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Xctasy_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://xctasy.co/account");
		logger.info("URL is open");
		logger.info("Xctasy has Kwikpass AP");
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://xctasy.co/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Xctasy_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Xctasy_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Xctasy_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Xctasy_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Xctasy_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Xctasy_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Xctasy_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Yoho_LifeStyle_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Yoho_LifeStyle_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://yoholife.in/");
		logger.info("URL is open");
		logger.info("Yoho_LifeStyle does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://yoholife.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Yoho_LifeStyle after Kwikpass login passed.");
			logger.info("Verify_Yoho_LifeStyle_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Yoho_LifeStyle after Kwikpass login failed.");
			logger.info("Verify_Yoho_LifeStyle_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Yoho_LifeStyle_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Yoho_LifeStyle_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_Soul_Flower_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.soulflower.in/account");
		logger.info("URL is open");
		logger.info("Soul_Flower has Kwikpass AP");
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.soulflower.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Clensta_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Clensta_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://clensta.com/");
		logger.info("URL is open");
		logger.info("Clensta does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://clensta.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Clensta after Kwikpass login passed.");
			logger.info("Verify_Clensta_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Clensta after Kwikpass login failed.");
			logger.info("Verify_Clensta_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Clensta_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Clensta_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Just_Herbs_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Just_Herbs_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.justherbs.in/");
		logger.info("URL is open");
		logger.info("Just Herbs does not have Kwikpass AP");
		WebElement user_icon = driver.findElement(By.xpath(Just_Herbs_user_icon));
		WebDriverWait user_icon_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		user_icon_wait.until(ExpectedConditions.elementToBeClickable(user_icon));
		user_icon.click();
		logger.info("Clicked user icon Icon");
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(Just_Herbs_kp_login_btn));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		lp.switchToIframe(Just_Herbs_iframe);
		WebElement closepopup = driver.findElement(By.cssSelector(Just_Herbs_close_popup));
		WebDriverWait closepopup_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closepopup_wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		if (closepopup.isDisplayed()) {
			closepopup.click();
			logger.info("Clicked user icon after login");
		}
		driver.switchTo().defaultContent();
		WebElement account_btn = driver.findElement(By.xpath(Just_Herbs_account_btn));
		WebDriverWait account_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		account_btn_wait.until(ExpectedConditions.elementToBeClickable(account_btn));
		account_btn.click();
		logger.info("Clicked account btn after login");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.justherbs.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Clensta after Kwikpass login passed.");
			logger.info("Verify_Just_Herbs_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Clensta after Kwikpass login failed.");
			logger.info("Verify_Just_Herbs_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Just_Herbs_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Just_Herbs_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Punekar_Cotton_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Punekar_Cotton_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.punekarcotton.com/");
		logger.info("URL is open");
		logger.info("Punekar Cotton has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.punekarcotton.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Clensta after Kwikpass login passed.");
			logger.info("Verify_Punekar_Cotton_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Clensta after Kwikpass login failed.");
			logger.info("Verify_Punekar_Cotton_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Punekar_Cotton_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Punekar_Cotton_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Stickitup_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Stickitup_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.stickitup.xyz/");
		logger.info("URL is open");
		logger.info("Stick it up has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.stickitup.xyz/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Clensta after Kwikpass login passed.");
			logger.info("Verify_Stickitup_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Clensta after Kwikpass login failed.");
			logger.info("Verify_Stickitup_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Stickitup_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Stickitup_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Karagiri_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Karagiri_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.karagiri.com/account");
		logger.info("URL is open");
		logger.info("Karagiri doesn't has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.karagiri.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Karagiri_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Karagiri_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Karagiri_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Karagiri_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Karagiri_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Karagiri_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Karagiri_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()throws IOException, InterruptedException {
		logger.info("Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://www.themancompany.com/");
		logger.info("URL is open");
		logger.info("The_Man_Company has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		By kp_account = By.id(kwikpass_icon_al);
		boolean kp_account_present = !driver.findElements(kp_account).isEmpty();
		if (kp_account_present) {
			logger.info("Login Successful !");
			driver.findElement(By.id(kwikpass_icon_al)).click();
			sleep(20);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.themancompany.com/account#profile";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Man Company after Kwikpass login .");
				logger.info("Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Man Company after Kwikpass login .");
				logger.info("Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_The_Man_Company_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}
	
	@Test
	public void Verify_Louis_Stitch_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Louis_Stitch_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.louisstitch.com/");
		logger.info("URL is open");
		logger.info("Louis_Stitch does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.louisstitch.com/account#profile";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Louis Stitch after Kwikpass login passed.");
			logger.info("Verify_Louis_Stitch_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Louis Stitch after Kwikpass login failed.");
			logger.info("Verify_Louis_Stitch_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Louis_Stitch_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Louis_Stitch_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Japam_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Japam_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://japam.in/");
		logger.info("URL is open");
		logger.info("Japam does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://japam.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Japam after Kwikpass login passed.");
			logger.info("Verify_Japam_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Japam after Kwikpass login failed.");
			logger.info("Verify_Japam_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Japam_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Japam_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Hyphen_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Hyphen_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://letshyphen.com/");
		logger.info("URL is open");
		logger.info("Hyphen does not have Kwikpass AP");
		sleep(2);
		WebElement popup = driver.findElement(By.id(Hyphen_popup));
		WebDriverWait popup_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		popup_wait.until(ExpectedConditions.elementToBeClickable(popup));
		if (popup.isDisplayed()) {
			popup.click();
			logger.info("Closed popup");
		}
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://letshyphen.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Hyphen after Kwikpass login passed.");
			logger.info("Verify_Hyphen_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Hyphen after Kwikpass login failed.");
			logger.info("Verify_Hyphen_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Hyphen_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Hyphen_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Slurrp_Farm_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Slurrp_Farm_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://slurrpfarm.com/");
		logger.info("URL is open");
		logger.info("Slurrp Farm does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://slurrpfarm.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Slurrp Farm after Kwikpass login passed.");
			logger.info("Verify_Slurrp_Farm_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Slurrp Farm after Kwikpass login failed.");
			logger.info("Verify_Slurrp_Farm_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Slurrp_Farm_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Slurrp_Farm_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Case_Mania_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Case_Mania_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://casemania.in/");
		logger.info("URL is open");
		logger.info("Case Mania does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://casemania.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Case Mania after Kwikpass login passed.");
			logger.info("Verify_Case_Mania_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Case Mania after Kwikpass login failed.");
			logger.info("Verify_Case_Mania_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Case_Mania_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Case_Mania_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login() throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login Test case is running.....");
		driver.get("https://www.mcaffeine.com/");
		logger.info("URL is open");
		logger.info("mCaffeine does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		WebElement dropdown = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(mCaffeine_signup_btn)); 
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		driver.switchTo().defaultContent();
		sleep(12);
		WebElement dropdown1 = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(mCaffeine_profile_button)); 
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			myaccount.click();
			sleep(8);
			String url = driver.getCurrentUrl();
			String vurl = "https://www.mcaffeine.com/account";
			if(url.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Test case completed");
			}else {
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				captureScreen(driver, "Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				Assert.fail("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			}
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			captureScreen(driver, "Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			Assert.fail("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
		}
	}
	
	@Test
	public void Verify_Libas_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Libas_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.libas.in/");
		logger.info("URL is open");
		logger.info("Libas does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.libas.in/account#profile";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Libas after Kwikpass login passed.");
			logger.info("Verify_Libas_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Libas after Kwikpass login failed.");
			logger.info("Verify_Libas_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Libas_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Libas_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	

	@Test
	public void Verify_Chemistry_India_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Chemistry_India_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://chemistryindia.com/");
		logger.info("URL is open");
		logger.info("Chemistry india does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://chemistryindia.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in chemistry india after Kwikpass login passed.");
			logger.info("Verify_Chemistry_India_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in chemistry india after Kwikpass login failed.");
			logger.info("Verify_Chemistry_India_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Chemistry_India_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Chemistry_India_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

}
