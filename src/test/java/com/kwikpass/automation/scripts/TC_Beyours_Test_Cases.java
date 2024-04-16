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

public class TC_Beyours_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_Beyours_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Beyours_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.beyours.in/");
		logger.info("URL is open");
		logger.info("Beyours does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(Beyours_usericon));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		sleep(3);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobileinputfield = By.id(mobile_input); 
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobileinputfieldpresent = !driver.findElements(mobileinputfield).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobileinputfieldpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_Beyours_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Beyours_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Beyours_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Beyours_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_Beyours_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_Beyours_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.beyours.in/");
		logger.info("URL is open");
		logger.info("Beyours does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(Beyours_usericon));
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
		WebElement kp_login_btn1 = driver.findElement(By.xpath(Beyours_usericon));
		WebDriverWait kp1_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp1_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn1));
		kp_login_btn1.click();
		logger.info("Clicked Kwikpass Icon");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.beyours.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in Beyours after Kwikpass login passed.");
			logger.info("Verify_Beyours_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in Beyours after Kwikpass login failed.");
			logger.info("Verify_Beyours_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_Beyours_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_Beyours_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	
	@Test
	public void Verify_Beyours_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Beyours_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://www.beyours.in/account");
		logger.info("URL is open");
		logger.info("Beyours does not have Kwikpass AP");
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
			logger.info("Verify_Beyours_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Beyours_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Beyours_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Beyours_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Beyours_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Beyours_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.beyours.in/account");
		logger.info("URL is open");
		logger.info("Beyours does not have Kwikpass AP");
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
			String vurl = "https://www.beyours.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Beyours_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Beyours_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Beyours_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Beyours_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Beyours_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Beyours_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Beyours_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Beyours_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Beyours_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://www.beyours.in/");
		logger.info("URL is open");
		logger.info("Beyours does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(Beyours_usericon));
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
			driver.navigate().to("https://www.beyours.in/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.beyours.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Beyours_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Beyours_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Beyours_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Beyours_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
	}
}
