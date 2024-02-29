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

public class TC_Hause_And_Kinder_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_Hause_And_Kinder_KwikPass_AP_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_AP_modal_Verfication Test Case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_AP_modal_Verfication failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_AP_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Collection_page() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Collection_page Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass Auto Load Popup");
		driver.navigate().to("https://hausandkinder.com/collections/bestsellers");
		logger.info("Navigated to collections pages");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Collection_page Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Collection_page Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Collection_page failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Collection_page failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Home_page() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Home_page Test Case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Home_page Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Home_page Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Home_page failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_Home_page failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_PDP_page() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_PDP_page Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass Auto Load Popup");
		driver.navigate().to("https://hausandkinder.com/products/into-the-ocean-baby-activity-gym-with-set-of-5-rattles");
		logger.info("Navigated to PDPs pages");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_PDP_page Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_PDP_page Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_PDP_page failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_AP_Visiblity_At_PDP_page failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen()throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test Case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
//			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//			logger.info("Mobile number entered");
//			sleep(2);
//			driver.findElement(By.id(otp_input)).sendKeys(otp);
//			logger.info("OTP entered");
//			sleep(8);
			driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
			logger.info("Mobile number entered");
			sleep(20);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click();
			By logoutbtn = By.xpath(logout_btn);
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				sleep(3);
				driver.navigate().to("https://hausandkinder.com/products/into-the-ocean-baby-activity-gym-with-set-of-5-rattles");
				logger.info("Navigated to PDP page");
				WebElement buy_now = driver.findElement(By.id(Hause_And_Kinder_buy_now));
				WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
				buy_now.click();
				logger.info("Clicked buy_now button");
				sleep(5);
				lp.switchToGokwikIframe(gokwik_iframe);
				logger.info("Switched to gokwik checkout");
				WebElement gkpname = driver.findElement(By.xpath(gokwikname));
				WebDriverWait gkpname_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				gkpname_wait.until(ExpectedConditions.elementToBeClickable(gkpname));
				String X = gkpname.getText();
				logger.info(X);
				String x1 = gokwik_name_;
				if (X.equals(x1)) {
					logger.info("Gokwik login successfull !");
					logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Gokwik login fail");
					logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test case failed!");
					captureScreen(driver,"Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
					Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
				}
			} else {
				logger.info("Login Unsuccessful !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test Cases failed!");
				captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed !");
				Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
			}

		}

	}

	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
//			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//			logger.info("Mobile number entered");
//			sleep(2);
//			driver.findElement(By.id(otp_input)).sendKeys(otp);
//			logger.info("OTP entered");
//			sleep(8);
			driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
			logger.info("Mobile number entered");
			sleep(20);
			driver.switchTo().defaultContent();
			driver.findElement(By.id(kwikpass_icon_al)).click();
			By logoutbtn = By.xpath(logout_btn);
			By orderhistorybtn = By.xpath(orderhistory_btn);
			boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
			boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
			if (logoutbtnPresent && orderhistorybtnPresent) {
				logger.info("Login Successful !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Login Unsuccessful !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
				captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS login failed !");
				Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
			Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen()throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case is running.....");
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
//		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//		logger.info("Mobile number entered");
//		sleep(2);
//		driver.findElement(By.id(otp_input)).sendKeys(otp);
//		logger.info("OTP entered");
//		sleep(8);
		driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
		logger.info("Mobile number entered");
		sleep(20);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			sleep(3);
			driver.navigate().to("https://hausandkinder.com/products/into-the-ocean-baby-activity-gym-with-set-of-5-rattles");
			logger.info("Navigated to PDP page");
			WebElement buy_now = driver.findElement(By.id(Hause_And_Kinder_buy_now));
			WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
			buy_now.click();
			logger.info("Clicked buy_now button");
			sleep(5);
			lp.switchToGokwikIframe(gokwik_iframe);
			logger.info("Switched to gokwik checkout");
			WebElement gkpname = driver.findElement(By.xpath(gokwikname));
			WebDriverWait gkpname_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			gkpname_wait.until(ExpectedConditions.elementToBeClickable(gkpname));
			String X = gkpname.getText();
			logger.info(X);
			String x1 = gokwik_name_;
			if (X.equals(x1)) {
				logger.info("Gokwik login successfull !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver,"Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver,"Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed !");
			Assert.fail(" Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
		}

	}

	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS()throws IOException, InterruptedException {
		logger.info("Hause_And_Kinder_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test case is running.....");
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
//		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//		logger.info("Mobile number entered");
//		sleep(2);
//		driver.findElement(By.id(otp_input)).sendKeys(otp);
//		logger.info("OTP entered");
//		sleep(8);
		driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
		logger.info("Mobile number entered");
		sleep(20);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed");
		}

	}

	@Test
	public void Verify_Hause_And_Kinder_KwikPass_icon_visibility() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_icon_visibility Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl));
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon visible in Hause_And_Kinder");
			logger.info("Verify_Hause_And_Kinder_KwikPass_icon_visibility test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("Kwikpass icon not-visible in Hause_And_Kinder");
			logger.info("Verify_Hause_And_Kinder_KwikPass_icon_visibility test case failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_icon_visibility failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_icon_visibility failed");
		}

	}

	@Test
	public void Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication Test case is running.....");
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
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP()throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
//			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//			logger.info("Mobile number entered");
//			sleep(2);
//			driver.findElement(By.id(otp_input)).sendKeys(otp);
//			logger.info("OTP entered");
//			sleep(8);
			driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
			logger.info("Mobile number entered");
			sleep(20);
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
					logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
					logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case failed!");
					captureScreen(driver,"Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
					Assert.fail("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
				}
			} else {
				logger.info("Login Unsuccessful !");
				logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Cases failed!");
				captureScreen(driver,"Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed !");
				Assert.fail("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Cases failed!");
			captureScreen(driver,"Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
			Assert.fail("Verify_Hause_And_Kinder_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
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
//		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//		logger.info("Mobile number entered");
//		sleep(2);
//		driver.findElement(By.id(otp_input)).sendKeys(otp);
//		logger.info("OTP entered");
//		sleep(8);
		driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
		logger.info("Mobile number entered");
		sleep(20);
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
	public void Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://hausandkinder.com/account");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
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
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://hausandkinder.com/account");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
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
//			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//			logger.info("Mobile number entered");
//			sleep(2);
//			driver.findElement(By.id(otp_input)).sendKeys(otp);
//			logger.info("OTP entered");
//			sleep(8);
			driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
			logger.info("Mobile number entered");
			sleep(20);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://hausandkinder.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
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
//		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//		logger.info("Mobile number entered");
//		sleep(2);
//		driver.findElement(By.id(otp_input)).sendKeys(otp);
//		logger.info("OTP entered");
//		sleep(8);
		driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
		logger.info("Mobile number entered");
		sleep(20);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			driver.navigate().to("https://hausandkinder.com/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://hausandkinder.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
	
	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		WebElement rewards_btn = driver.findElement(By.className(Hause_And_Kinder_rewards_btn));
		WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
		rewards_btn.click();
		logger.info("Clicked rewards_btn ");
		sleep(10);
		lp.switchToIframe(Hause_And_Kinder_iframe);
		logger.info("Switched to rewards iframe");
		WebElement rewards_sign_btn = driver.findElement(By.xpath(Hause_And_Kinder_rewards_signin_btn));
		WebDriverWait rewards_sign_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_sign_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_sign_btn));
		rewards_sign_btn.click();
		logger.info("Clicked rewards_sign_btn ");
		driver.switchTo().defaultContent();
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
//		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//		logger.info("Mobile number entered");
//		sleep(2);
//		driver.findElement(By.id(otp_input)).sendKeys(otp);
//		logger.info("OTP entered");
//		sleep(8);
		driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
		logger.info("Mobile number entered");
		sleep(20);
		driver.switchTo().defaultContent();
		String curl = driver.getCurrentUrl();
		String vurl = "https://hausandkinder.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}
	
	@Test
	public void Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
//		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
//		logger.info("Mobile number entered");
//		sleep(2);
//		driver.findElement(By.id(otp_input)).sendKeys(otp);
//		logger.info("OTP entered");
//		sleep(8);
		driver.findElement(By.id(mobile_input)).sendKeys("7019281976");
		logger.info("Mobile number entered");
		sleep(20);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(kwikpass_icon_al)).click();
		By logoutbtn = By.xpath(logout_btn);
		By orderhistorybtn = By.xpath(orderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login successful");
			sleep(2);
			WebElement rewards_btn = driver.findElement(By.className(Hause_And_Kinder_rewards_btn));
			WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
			rewards_btn.click();
			logger.info("Clicked rewards_btn ");
			sleep(10);
			lp.switchToIframe(Hause_And_Kinder_iframe);
			logger.info("Switched to rewards iframe");
			WebElement rewards_sign_btn = driver.findElement(By.xpath(Hause_And_Kinder_rewards_signin_btn));
			WebDriverWait rewards_sign_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			rewards_sign_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_sign_btn));
			rewards_sign_btn.click();
			logger.info("Clicked rewards_sign_btn ");
			driver.switchTo().defaultContent();
			sleep(15);
			String curl = driver.getCurrentUrl();
			String vurl = "https://hausandkinder.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen Test Cases failed!");
				captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen failed !");
				Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen failed !");
			Assert.fail("Verify_Hause_And_Kinder_Kwikpass_login_using_OTP_Via_SMS_Done_Rewards_Login_should_happen failed");
		}
	}

}
