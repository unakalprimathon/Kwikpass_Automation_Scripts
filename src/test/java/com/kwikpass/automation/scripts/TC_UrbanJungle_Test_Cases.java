package com.kwikpass.automation.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwikpass.pageObjects.BaseClass;
import com.kwikpass.pageObjects.Locator;
import com.kwikpass.pageObjects.LoginPage;

public class TC_UrbanJungle_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_UrbanJungle_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("UrbanJungle_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test case is running.....");
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
			logger.info("Verify_UrbanJungle_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_UrbanJungle_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_UrbanJungle_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_UrbanJungle_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed");
		}

	}

	@Test
	public void Verify_Urban_Jungle_KwikPass_icon_visibility() throws IOException, InterruptedException {
		logger.info("Verify_Urban_Jungle_KwikPass_icon_visibility Test case is running.....");
		driver.get("https://urbanjungle.shop/");
		logger.info("URL is open");
		logger.info("Urban Jungle has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		if (kp_login_btn.isDisplayed()) {
			logger.info("Kwikpass icon visible in Lotus Botanicals");
			logger.info("Verify_Urban_Jungle_KwikPass_icon_visibility test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("Kwikpass icon not-visible in Lotus Botanicals");
			logger.info("Verify_Urban_Jungle_KwikPass_icon_visibility test case failed!");
			captureScreen(driver, "Verify_Urban_Jungle_KwikPass_icon_visibility failed");
			Assert.fail("Verify_Urban_Jungle_KwikPass_icon_visibility failed");
		}

	}

	@Test
	public void Verify_Urban_Jungle_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication Test case is running.....");
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
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Urban_Jungle_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication failed");
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
	public void Verify_UrbanJungle_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_UrbanJungle_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://urbanjungle.shop/account");
		logger.info("URL is open");
		logger.info("UrbanJungle has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_UrbanJungle_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_UrbanJungle_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_UrbanJungle_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_UrbanJungle_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_UrbanJungle_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_UrbanJungle_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://urbanjungle.shop/account");
		logger.info("URL is open");
		logger.info("UrbanJungle has Kwikpass AP");
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
			String vurl = "https://urbanjungle.shop/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_UrbanJungle_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_UrbanJungle_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_UrbanJungle_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_UrbanJungle_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_UrbanJungle_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_UrbanJungle_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_UrbanJungle_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://urbanjungle.shop/");
		logger.info("URL is open");
		logger.info("UrbanJungle has Kwikpass AP");
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
			driver.navigate().to("https://urbanjungle.shop/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://urbanjungle.shop/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_UrbanJungle_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}

}
