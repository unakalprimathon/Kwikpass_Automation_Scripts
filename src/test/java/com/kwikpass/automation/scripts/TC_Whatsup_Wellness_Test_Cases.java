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

public class TC_Whatsup_Wellness_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://whatsupwellness.in/account");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By optid = By.id(mobile_input); 
		By whatsapp_id = By.id(whatsappid); 
		boolean optidpresent = !driver.findElements(optid).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_id).isEmpty();
		if (optidpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage failed");
			Assert.fail("Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage failed");
		}
	}

	@Test
	public void Verify_Whatsup_Wellness_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://whatsupwellness.in/");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(whatsup_wellness_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked Hamburger");
		WebElement login_btn = driver.findElement(By.id(whatsup_wellness_login_btn));
		WebDriverWait login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		login_btn_wait.until(ExpectedConditions.elementToBeClickable(login_btn));
		login_btn.click();
		logger.info("Clicked login btn");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By optid = By.id(mobile_input); 
		By whatsapp_id = By.id(whatsappid); 
		boolean optidpresent = !driver.findElements(optid).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_id).isEmpty();
		if (optidpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Whatsup_Wellness_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://whatsupwellness.in/");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(whatsup_wellness_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked Hamburger btn");
		WebElement login_btn = driver.findElement(By.id(whatsup_wellness_login_btn));
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
		sleep(10);
		driver.switchTo().defaultContent();
		logger.info("Clicked Kwikpass Icon after login");
		String account = driver.findElement(By.id(whatsup_wellness_login_btn)).getText();
		String vaccount = "Account";
		if (account.equals(vaccount)) {
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS failed");
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
		logger.info("Clicked Hamburger btn");
		WebElement login_btn = driver.findElement(By.id(whatsup_wellness_login_btn));
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
		sleep(10);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(whatsup_wellness_login_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://whatsupwellness.in/account#profile";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(whatsup_wellness_logout_btn)).isDisplayed();
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
	public void Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test case is running.....");
		logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://whatsupwellness.in/account");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
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
			sleep(10);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://whatsupwellness.in/account#profile";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(whatsup_wellness_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass login unsuccessful.");
				logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case failed!");
				captureScreen(driver, "Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
				Assert.fail("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed !");
			Assert.fail("Verify_Whatsup_Wellness_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
		}

	}
	
	@Test
	public void Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page Test case is running.....");
		driver.get("https://whatsupwellness.in/");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(whatsup_wellness_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked Hamburger btn");
		WebElement login_btn = driver.findElement(By.id(whatsup_wellness_login_btn));
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
		sleep(10);
		driver.switchTo().defaultContent();
		logger.info("Clicked Kwikpass Icon after login");
		String account = driver.findElement(By.id(whatsup_wellness_login_btn)).getText();
		String vaccount = "Account";
		if (account.equals(vaccount)) {
			driver.navigate().to("https://whatsupwellness.in/account#profile");
			logger.info("Navigating to account page");
			sleep(30);
			String geturl = driver.getCurrentUrl();
			logger.info(geturl);
			String expectedUrl = "https://whatsupwellness.in/account#profile";
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.urlToBe(expectedUrl));
	        logger.info("Navigated to account page");
			if (geturl.equals(expectedUrl)) {
				driver.findElement(By.xpath(whatsup_wellness_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass Login Unsuccessful !");
				logger.info("Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page Test Cases failed!");
				captureScreen(driver, "Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page failed !");
				Assert.fail("Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page Test Cases failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page failed !");
			Assert.fail("Verify_Whatsup_Wellness_Kwikpass_login_Done_Redirect_to_Account_page failed");
		}

	}
}