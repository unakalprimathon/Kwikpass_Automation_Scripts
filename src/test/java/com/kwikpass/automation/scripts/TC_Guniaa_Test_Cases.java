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

public class TC_Guniaa_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_Guniaa_KwikPass_AP_Modal_visibility_at_Collection_Page()throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_Collection_Page Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		driver.navigate().to("https://guniaa.com/collections/");
		logger.info("Navigated to collections pages");
		LoginPage lp = new LoginPage(driver);
		sleep(7);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass Auto Load popup iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("KwikPass Auto Load Popup is visible");
			logger.info("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_Collection_Page Test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("KwikPass Auto Load Popup is not visible");
			logger.info("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_Collection_Page Test case failed!");
			captureScreen(driver, "Verify_Guniaa_KwikPass_AP_Modal_visibility_at_Collection_Page failed");
			logger.info("Screen shot taken!");
			Assert.fail("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_Collection_Page failed");
		}

	}
	
	@Test
	public void Verify_Guniaa_KwikPass_AP_Modal_visibility_at_PDP_Page()
			throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_PDP_Page Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		driver.navigate().to("https://guniaa.com/products/men-plus-size-blue-royal-digital-printed-kurta-festive");
		logger.info("Navigated to PDP page");
		LoginPage lp = new LoginPage(driver);
		sleep(7);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass Auto Load popup iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("KwikPass Auto Load Popup is visible");
			logger.info("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_PDP_Page Test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("KwikPass Auto Load Popup is not visible");
			logger.info("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_PDP_Page Test case failed!");
			captureScreen(driver, "Verify_Guniaa_KwikPass_AP_Modal_visibility_at_PDP_Page failed");
			logger.info("Screen shot taken!");
			Assert.fail("Verify_Guniaa_KwikPass_AP_Modal_visibility_at_PDP_Page failed");
		}

	}
	
	@Test
	public void Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Modal_Verification() throws IOException, InterruptedException {
		logger.info("Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Modal_Verification Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		LoginPage lp = new LoginPage(driver);
		sleep(7);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass Auto Load popup iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("KwikPass Auto Load Popup is visible");
			logger.info("Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Modal_Verification Test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("KwikPass Auto Load Popup is not visible");
			logger.info("Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Modal_Verification Test case failed!");
			captureScreen(driver, "Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Modal_Verification failed");
			logger.info("Screen shot taken!");
			Assert.fail("Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Modal_Verification failed");
		}

	}

	@Test
	public void Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Visibilty() throws IOException, InterruptedException {
		logger.info("Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Visibilty Test Case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		LoginPage lp = new LoginPage(driver);
		sleep(7);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass Auto Load popup iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("KwikPass Auto Load Popup is visible");
			logger.info("Verfiy KwikPass_Auto_Load_Popup visibility Test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("KwikPass Auto Load Popup is not visible");
			logger.info("Verfiy KwikPass_Auto_Load_Popup visibilty Test case failed!");
			captureScreen(driver, "Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Visibilty failed");
			logger.info("Screen shot taken!");
			Assert.fail("Verfiy_Guniaa_KwikPass_Auto_Load_Popup_Visibilty failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_KwikPass_Auto_Load_Popup_Visibilty_At_Home_Page() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_Auto_Load_Popup_Visibilty_At_Home_Page Test Case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		LoginPage lp = new LoginPage(driver);
		sleep(7);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass Auto Load popup iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("KwikPass Auto Load Popup is visible");
			logger.info("Verify_Guniaa_KwikPass_Auto_Load_Popup_Visibilty_At_Home_Page Test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("KwikPass Auto Load Popup is not visible");
			logger.info("Verify_Guniaa_KwikPass_Auto_Load_Popup_Visibilty_At_Home_Page Test case failed!");
			captureScreen(driver, "Verify_Guniaa_KwikPass_Auto_Load_Popup_Visibilty_At_Home_Page failed");
			logger.info("Screen shot taken!");
			Assert.fail("Verify_Guniaa_KwikPass_Auto_Load_Popup_Visibilty_At_Home_Page failed");
		}

	}
	
	@Test
	public void Verfiy_Guniaa_KwikPass_icon_visibilty() throws IOException, InterruptedException {
		logger.info("Verfiy_Guniaa_KwikPass_icon_visibilty Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl)); 
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verfiy_Guniaa_KwikPass_icon_visibilty Test case passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verfiy_Guniaa_KwikPass_icon_visibilty Test case Failed !");
			captureScreen(driver, "Verfiy_Guniaa_KwikPass_icon_visibilty failed");
			Assert.fail("Verfiy_Guniaa_KwikPass_icon_visibilty failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_Kwikpass_login_from_AP_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_Kwikpass_login_from_AP_using_OTP_Via_SMS Test case Running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		sleep(7);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass AP modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
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
			logger.info("Verify_Guniaa_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Guniaa_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_Kwikpass_login_from_AP_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Guniaa_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		WebElement kp_before_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_before_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_before_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_before_login_btn));
		kp_before_login_btn.click();
		logger.info("Clicked kwikpass icon");
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		sleep(3);
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
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
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Guniaa_KwikPass_login_from_Login_modal_Using_OTP_Via_SMS failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		LoginPage lp = new LoginPage(driver);
		WebElement kp_before_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_before_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_before_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_before_login_btn));
		kp_before_login_btn.click();
		logger.info("Clicked Kwikpass Iocn");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification failed");
			Assert.fail("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Auto_Load_Popup() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Auto_Load_Popup Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		LoginPage lp = new LoginPage(driver);
		sleep(7);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(7);
		String curl = driver.getCurrentUrl();
		String vurl = "https://guniaa.com/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Guniaa after Kwikpass login .");
			logger.info("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Auto_Load_Popup Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Guniaa after Kwikpass login .");
			logger.info("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Auto_Load_Popup Test Case failed!");
			captureScreen(driver, "Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Auto_Load_Popup failed");
			Assert.fail("Verify_Guniaa_Shopify_login_and_session_creation_after_Kwikpass_login_From__Auto_Load_Popup failed");
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
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
		driver.switchTo().defaultContent();
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		driver.findElement(By.xpath(orderhistory_btn)).click();
		sleep(7);
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
	public void Verify_Guniaa_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://guniaa.com/account");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass AP");
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
			logger.info("Verify_Guniaa_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Guniaa_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Guniaa_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Guniaa_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://guniaa.com/account");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass AP");
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
			String vurl = "https://guniaa.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Guniaa_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Guniaa_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Guniaa_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Guniaa_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Guniaa_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Guniaa_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass AP");
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
			driver.navigate().to("https://guniaa.com/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://guniaa.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_Guniaa_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}
	}
}
