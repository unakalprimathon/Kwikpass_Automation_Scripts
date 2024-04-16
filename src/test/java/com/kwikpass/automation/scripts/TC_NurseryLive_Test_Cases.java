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

public class TC_NurseryLive_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Nurserylive_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.className(Nurserylive_Pune_kp_icon));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		sleep(3);
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Nurserylive_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Nurserylive_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Nurserylive_KwikPass_login_modal_verification failed");
		}
	}
	

	@Test
	public void Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive does not have Kwikpass AP");
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
		By logoutbtn = By.className(Nurserylive_Pune_logout_btn); 
		By myaccountbtn = By.className(Nurserylive_Pune_myaccount_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean myaccountbtnPresent = !driver.findElements(myaccountbtn).isEmpty();
		if (logoutbtnPresent && myaccountbtnPresent) {
			logger.info("Login Successful !");
			logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS failed");
		}

	}
	
	@Test
	public void Verify_Nurserylive_Kwikpass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_Kwikpass_login_icon_Visibilty Test case is running.....");
		driver.get("https://nurserylive.com/");
		logger.info("URL is opened");
		logger.info("Nurserylive does not have Kwikpass AP");
		WebElement s = driver.findElement(By.className(Nurserylive_Pune_kp_icon));
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verify_Nurserylive_Kwikpass_login_icon_Visibilty Test case Passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_Nurserylive_Kwikpass_login_icon_Visibilty Test case Failed !");
			captureScreen(driver, "Verify_Nurserylive_Kwikpass_login_icon_Visibilty failed");
			Assert.fail("Verify_Nurserylive_Kwikpass_login_icon_Visibilty failed");
		}
	}
	
	@Test
	public void Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Nurserylive_Pune_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive does not have Kwikpass AP");
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
		String vurl = "https://nurserylive.com/account";
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
	public void Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://nurserylive.com/account");
		logger.info("URL is open");
		logger.info("Nurserylive does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By optid = By.id(mobile_input); 
		By whatsapp_id = By.id(whatsappid); 
		boolean optidpresent = !driver.findElements(optid).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_id).isEmpty();
		if (optidpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage failed");
			Assert.fail("Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test case is running.....");
		logger.info("Verify_Nurserylive_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://nurserylive.com/account");
		logger.info("URL is open");
		logger.info("Nurserylive does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By optid = By.id(mobile_input); 
		By whatsapp_id = By.id(whatsappid); 
		boolean optidpresent = !driver.findElements(optid).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_id).isEmpty();
		if (optidpresent && whatsappidpresent) {
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://nurserylive.com/account";
			if (curl.equals(vurl)) {				
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass login unsuccessful.");
				logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case failed!");
				captureScreen(driver, "Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
				Assert.fail("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed !");
			Assert.fail("Verify_Nurserylive_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
		}

	}
	
	@Test
	public void Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive does not have Kwikpass AP");
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
		By logoutbtn = By.className(Nurserylive_Pune_logout_btn);
		By myaccountbtn = By.className(Nurserylive_Pune_myaccount_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean myaccountbtnPresent = !driver.findElements(myaccountbtn).isEmpty();
		if (logoutbtnPresent && myaccountbtnPresent) {
			driver.navigate().to("https://nurserylive.com/account");
			logger.info("Switched to default page");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://nurserylive.com/account";
			if (curl.equals(vurl)) {
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver, "Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_Nurserylive_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Nurserylive_Pune_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_Pune_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive_Pune does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		WebElement iframe = driver.findElement(By.xpath(Nursery_live_iframe));
		driver.switchTo().frame(iframe);
		sleep(5);
		WebElement rewards_join_now_btn = driver.findElement(By.xpath(Nursery_live_signin));
		WebDriverWait rewards_join_now_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_join_now_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_join_now_btn));
		rewards_join_now_btn.click();
		logger.info("Clicked rewards_Signin_btn ");
		driver.switchTo().defaultContent();
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
		String curl = driver.getCurrentUrl();
		String vurl = "https://nurserylive.com/account";
		if (curl.equals(vurl)) {
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_Nurserylive_Pune_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Nurserylive_Pune_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_Pune_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_Nurserylive_Pune_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}
}
