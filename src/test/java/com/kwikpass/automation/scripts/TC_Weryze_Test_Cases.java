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

public class TC_Weryze_Test_Cases  extends BaseClass implements Locator{
	
	@Test
	public void Verify_Weryze_KwikPass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_KwikPass_login_icon_Visibilty Test case is running.....");
		driver.get("https://weryze.com/");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_login_btn_wait.until(ExpectedConditions.visibilityOf(kp_login_btn));
		if(kp_login_btn.isDisplayed()) {
			logger.info("The Kwikpass icon visible.");
			logger.info("Verify_Weryze_KwikPass_login_icon_Visibilty Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Weryze_KwikPass_login_icon_Visibilty Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_KwikPass_login_icon_Visibilty failed");
			Assert.fail("Verify_Weryze_KwikPass_login_icon_Visibilty Failed");
		}
	}
	
	@Test
	public void Verify_Weryze_KwikPass_login_modal_verification_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://weryze.com/account");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(8);
		WebElement spin = driver.findElement(By.className(weryze_spinwheel));
		WebDriverWait spin_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spin_wait.until(ExpectedConditions.elementToBeClickable(spin));
		spin.click();
		logger.info("Closed spin wheel");
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By optid = By.id(mobile_input); 
		By whatsapp_id = By.id(whatsappid); 
		boolean optidpresent = !driver.findElements(optid).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_id).isEmpty();
		if (optidpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Weryze_KwikPass_login_modal_verification_from_accountpage Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Weryze_KwikPass_login_modal_verification_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_KwikPass_login_modal_verification_from_accountpage failed");
			Assert.fail("Verify_Weryze_KwikPass_login_modal_verification_from_accountpage failed");
		}
	}

	@Test
	public void Verify_Weryze_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://weryze.com/");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
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
			logger.info("Verify_Weryze_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Weryze_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Weryze_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
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
		spin.click();
		logger.info("Closed spin wheel");
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
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
			logger.info("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS failed");
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
		spin.click();
		logger.info("Closed spin wheel");
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
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
		sleep(15);
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
	public void Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://weryze.com/");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(8);
		WebElement spin = driver.findElement(By.className(weryze_spinwheel));
		WebDriverWait spin_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spin_wait.until(ExpectedConditions.elementToBeClickable(spin));
		spin.click();
		logger.info("Closed spin wheel");
		sleep(2);
		WebElement rewards_btn = driver.findElement(By.xpath(weryze_rewards_btn));
		WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
		rewards_btn.click();
		logger.info("Clicked rewards_btn ");
		sleep(10);
		lp.switchToIframe(weryze_rewards_iframe);
		logger.info("Switched to rewards iframe");
		WebElement rewards_sign_btn = driver.findElement(By.xpath(weryze_rewards_signin_btn));
		WebDriverWait rewards_sign_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_sign_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_sign_btn));
		rewards_sign_btn.click();
		logger.info("Clicked rewards_sign_btn ");
		driver.switchTo().defaultContent();
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
			logger.info("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_Weryze_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}

	@Test
	public void Verify_Weryze_KwikPass_login_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_KwikPass_login_from_accountpage Test case is running.....");
		driver.get("https://weryze.com/account");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(8);
		WebElement spin = driver.findElement(By.className(weryze_spinwheel));
		WebDriverWait spin_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spin_wait.until(ExpectedConditions.elementToBeClickable(spin));
		spin.click();
		logger.info("Closed spin wheel");
		sleep(2);
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
			logger.info("Switched to default page");
			sleep(15);
			String curl = driver.getCurrentUrl();
			String vurl = "https://weryze.com/account";
			if (curl.equals(vurl)) {
				WebElement ageconfim = driver.findElement(By.xpath(weryze_ageconfrim));
				WebDriverWait ageconfim_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				ageconfim_wait.until(ExpectedConditions.elementToBeClickable(ageconfim));
				ageconfim.click();
				logger.info("Clicked Age confirm btn Yes");
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
				logger.info("Verify_Weryze_KwikPass_login_from_accountpage Test Cases passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Weryze after Kwikpass login .");
				logger.info("Verify_Weryze_KwikPass_login_from_accountpage Test Case failed!");
				captureScreen(driver, "Verify_Weryze_KwikPass_login_from_accountpage failed");
				Assert.fail("Verify_Weryze_KwikPass_login_from_accountpage Failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Weryze_KwikPass_login_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_KwikPass_login_from_accountpage failed");
			Assert.fail("Verify_Weryze_KwikPass_login_from_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://weryze.com/");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		sleep(8);
		WebElement spin = driver.findElement(By.className(weryze_spinwheel));
		WebDriverWait spin_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		spin_wait.until(ExpectedConditions.elementToBeClickable(spin));
		spin.click();
		logger.info("Closed spin wheel");
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
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
			driver.navigate().to("https://weryze.com/account");
			logger.info("Switched to default page");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://weryze.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver, "Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_Weryze_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
}