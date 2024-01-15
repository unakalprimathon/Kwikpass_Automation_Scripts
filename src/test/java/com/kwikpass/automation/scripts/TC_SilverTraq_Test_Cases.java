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

public class TC_SilverTraq_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Silvertraq_KwikPass_AP_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_KwikPass_AP_modal_Verfication Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		WebElement spinnow_btn = driver.findElement(By.xpath(silvertraq_spinnow));
		WebDriverWait spinnow_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spinnow_btn_wait.until(ExpectedConditions.elementToBeClickable(spinnow_btn));
		spinnow_btn.click();
		logger.info("Clicked Spin now button");
		sleep(12);
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Silvertraq_KwikPass_AP_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Silvertraq_KwikPass_AP_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_AP_modal_Verfication failed");
			Assert.fail("Verify_Silvertraq_KwikPass_AP_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Silvertraq_KwikPass_AP_Visiblity_At_Collection_page() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Collection_page Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		driver.navigate().to("https://www.silvertraq.com/collections/the-winter-sale");
		logger.info("Navigated to collections pages");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
    	lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		String a = driver.findElement(By.xpath(silvertraq_spinwheel_text_xpath)).getText();
		String b = silvertraq_spinwheel_text;
		if (a.equals(b)) {
			logger.info("The Kwikpass AP is visible.");
			logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Collection_page passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass AP is not visible.");
			logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Collection_page Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_AP_Visiblity_At_Collection_page failed");
			Assert.fail("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Collection_page failed");
		}
	}
	
	@Test
	public void Verify_Silvertraq_KwikPass_AP_Visiblity_At_Home_page() throws IOException, InterruptedException {
		logger.info("Silvertraq KwikPass Auto Load Popup visiblity at Home Page Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
    	lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		String a = driver.findElement(By.xpath(silvertraq_spinwheel_text_xpath)).getText();
		String b = silvertraq_spinwheel_text;
		if (a.equals(b)) {
			logger.info("The Kwikpass AP is visible.");
			logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Home_page passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass AP is not visible.");
			logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Home_page Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_AP_Visiblity_At_Home_page failed");
			Assert.fail("Verify_Silvertraq_KwikPass_AP_Visiblity_At_Home_page failed");
		}
	}

	@Test
	public void Verify_Silvertraq_KwikPass_AP_Visiblity_At_PDP_page() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_PDP_page Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		driver.navigate().to("https://www.silvertraq.com/products/keyhole-back-crop-top-with-clasp-peony-pink");
		logger.info("Navigated to PDP pages");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
    	lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		String a = driver.findElement(By.xpath(silvertraq_spinwheel_text_xpath)).getText();
		String b = silvertraq_spinwheel_text;
		if (a.equals(b)) {
			logger.info("The Kwikpass AP is visible.");
			logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_PDP_page passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass AP is not visible.");
			logger.info("Verify_Silvertraq_KwikPass_AP_Visiblity_At_PDP_page Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_AP_Visiblity_At_PDP_page failed");
			Assert.fail("Verify_Silvertraq_KwikPass_AP_Visiblity_At_PDP_page failed");
		}
	}

	@Test
	public void Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		WebElement spinnow_btn = driver.findElement(By.xpath(silvertraq_spinnow));
		WebDriverWait spinnow_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spinnow_btn_wait.until(ExpectedConditions.elementToBeClickable(spinnow_btn));
		spinnow_btn.click();
		logger.info("Clicked Spin now button");
		sleep(12);
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			sleep(3);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(10);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click(); 
			By logoutbtn = By.xpath(logout_btn); 
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				sleep(3);
				driver.navigate().to("https://www.silvertraq.com/products/keyhole-back-crop-top-with-clasp-peony-pink");
				logger.info("Navigated to PDP page");
				WebElement buy_now = driver.findElement(By.xpath(silvertraq_buynow));
				WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
				buy_now.click();
				logger.info("Clicked Buy Now button");
				sleep(5);
				lp.switchToGokwikIframe(gokwik_iframe);
				logger.info("Switched to gokwik checkout");
				String X = driver.findElement(By.xpath(gokwikname)).getText();
				logger.info(X);
				String x1 = "Automation Testing";
				if (X.equals(x1)) {
					logger.info("Gokwik login successfull !");
					sleep(2);
					logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Gokwik login fail");
					logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test case failed!");
					captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
					Assert.fail("Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
				}
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test Cases failed!");
				captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed !");
				Assert.fail("Verify_Silvertraq_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
			}

		}

	}
	
	@Test
	public void Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		WebElement spinnow_btn = driver.findElement(By.xpath(silvertraq_spinnow));
		WebDriverWait spinnow_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spinnow_btn_wait.until(ExpectedConditions.elementToBeClickable(spinnow_btn));
		spinnow_btn.click();
		logger.info("Clicked Spin now button");
		sleep(12);
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			sleep(3);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(10);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click(); 
			By logoutbtn = By.xpath(logout_btn); 
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
				captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS failed !");
				Assert.fail("Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
			Assert.fail("Verify_Silvertraq_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
		}
	}


	@Test
	public void Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case is running.....");
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
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			sleep(3);
			driver.navigate().to("https://www.silvertraq.com/products/keyhole-back-crop-top-with-clasp-peony-pink");
			logger.info("Navigated to PDP page");
			WebElement buy_now = driver.findElement(By.xpath(silvertraq_buynow));
			WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
			buy_now.click();
			logger.info("Clicked Buy Now button");
			sleep(5);
			lp.switchToGokwikIframe(gokwik_iframe);
			logger.info("Switched to gokwik checkout");
			String X = driver.findElement(By.xpath(gokwikname)).getText();
			logger.info(X);
			String x1 = "Automation Testing";
			if (X.equals(x1)) {
				logger.info("Gokwik login successfull !");
				sleep(2);
				logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
		}

	}

	@Test
	public void Verify_Silvertraq_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test case is running.....");
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
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click(); 
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(orderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Kwikpass Login Successful !");
			sleep(3);
			logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Silvertraq_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed");
		}

	}

	@Test
	public void Verify_Silvertraq_KwikPass_icon_visibility() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_KwikPass_icon_visibility Test case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl));
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon visible in Lotus Botanicals");
			logger.info("Verify_Silvertraq_KwikPass_login_icon_Visibilty test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("Kwikpass icon not-visible in Lotus Botanicals");
			logger.info("Verify_Silvertraq_KwikPass_login_icon_Visibilty test case failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_icon_visibility failed");
			Assert.fail("Verify_Silvertraq_KwikPass_icon_visibility failed");
		}

	}

	@Test
	public void Verify_Silvertraq_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_KwikPass_Login_modal_Verfication Test case is running.....");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Silvertraq_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Silvertraq_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Silvertraq_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		WebElement spinnow_btn = driver.findElement(By.xpath(silvertraq_spinnow));
		WebDriverWait spinnow_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spinnow_btn_wait.until(ExpectedConditions.elementToBeClickable(spinnow_btn));
		spinnow_btn.click();
		logger.info("Clicked Spin now button");
		sleep(12);
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			sleep(3);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(10);
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
					logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in Silvertraq after Kwikpass login .");
					logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case failed!");
					captureScreen(driver, "Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
					Assert.fail("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
				}
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Cases failed!");
				captureScreen(driver, "Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed !");
				Assert.fail("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
			Assert.fail("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
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
			logger.info("Login Successful !");
			driver.findElement(By.xpath(orderhistory_btn)).click();
			sleep(5);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.silvertraq.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Silvertraq_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
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

	}

	@Test
	public void Verify_SilverTraq_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_SilverTraq_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://www.silvertraq.com/account");
		logger.info("URL is open");
		logger.info("SilverTraq has Kwikpass AP");
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
			logger.info("Verify_SilverTraq_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_SilverTraq_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_SilverTraq_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_SilverTraq_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_SilverTraq_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_SilverTraq_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.silvertraq.com/account");
		logger.info("URL is open");
		logger.info("SilverTraq has Kwikpass AP");
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
			sleep(10);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.silvertraq.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_SilverTraq_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_SilverTraq_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_SilverTraq_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_SilverTraq_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_SilverTraq_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_SilverTraq_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_SilverTraq_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("SilverTraq has Kwikpass AP");
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
		sleep(10);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			driver.navigate().to("https://www.silvertraq.com/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.silvertraq.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_SilverTraq_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
}
