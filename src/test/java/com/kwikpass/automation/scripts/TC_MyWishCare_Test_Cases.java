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

public class TC_MyWishCare_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_MyWishCare_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_MyWishCare_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.mywishcare.com/");
		logger.info("URL is open");
		logger.info("MyWishCare does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
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
			logger.info("Verify_MyWishCare_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_MyWishCare_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_MyWishCare_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_MyWishCare_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_MyWishCare_KwikPass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_MyWishCare_KwikPass_login_icon_Visibilty Test case is running.....");
		driver.get("https://www.mywishcare.com/");
		logger.info("URL is opened");
		logger.info("MyWishCare does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		if (kp_login_btn.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verify_MyWishCare_KwikPass_login_icon_Visibilty Test case Passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_MyWishCare_KwikPass_login_icon_Visibilty Test case Failed !");
			captureScreen(driver, "Verify_MyWishCare_KwikPass_login_icon_Visibilty failed");
			Assert.fail("Verify_MyWishCare_KwikPass_login_icon_Visibilty failed");
		}
	}
	

	@Test
	public void Verify_MyWishCare_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_MyWishCare_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
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
		WebElement nothanks = driver.findElement(By.xpath(MyWishCare_closepopup));
		WebDriverWait nothanks_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		nothanks_wait.until(ExpectedConditions.elementToBeClickable(nothanks));
		if (nothanks.isDisplayed()) {
			nothanks.click();
			logger.info("Closed popup");
			sleep(2);
		}
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
			logger.info("Verify_MyWishCare_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_MyWishCare_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_MyWishCare_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_MyWishCare_Kwikpass_login_using_OTP_Via_SMS failed");
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
		WebElement nothanks = driver.findElement(By.xpath(MyWishCare_closepopup));
		WebDriverWait nothanks_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		nothanks_wait.until(ExpectedConditions.elementToBeClickable(nothanks));
		if (nothanks.isDisplayed()) {
			nothanks.click();
			logger.info("Closed popup");
			sleep(2);
		}
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
			sleep(2);
			if (nothanks.isDisplayed()) {
				nothanks.click();
				logger.info("Closed popup");
				sleep(2);
			}
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
	public void Verify_MyWishCare_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_MyWishCare_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://www.mywishcare.com/account");
		logger.info("URL is open");
		logger.info("MyWishCare does not have Kwikpass AP");
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
			logger.info("Verify_MyWishCare_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_MyWishCare_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_MyWishCare_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_MyWishCare_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_MyWishCare_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_MyWishCare_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.mywishcare.com/account");
		logger.info("URL is open");
		logger.info("MyWishCare does not have Kwikpass AP");
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
			String vurl = "https://www.mywishcare.com/account";
			if (curl.equals(vurl)) {
				sleep(2);
				WebElement nothanks = driver.findElement(By.xpath(MyWishCare_closepopup));
				WebDriverWait nothanks_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				nothanks_wait.until(ExpectedConditions.elementToBeClickable(nothanks));
				if (nothanks.isDisplayed()) {
					nothanks.click();
					logger.info("Closed popup");
					sleep(2);
				}
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_MyWishCare_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_MyWishCare_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_MyWishCare_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_MyWishCare_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_MyWishCare_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_MyWishCare_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_MyWishCare_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
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
		WebElement nothanks = driver.findElement(By.xpath(MyWishCare_closepopup));
		WebDriverWait nothanks_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		nothanks_wait.until(ExpectedConditions.elementToBeClickable(nothanks));
		if (nothanks.isDisplayed()) {
			nothanks.click();
			logger.info("Closed popup");
			sleep(2);
		}
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
			driver.navigate().to("https://www.mywishcare.com/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.mywishcare.com/account";
			if (curl.equals(vurl)) {
				sleep(2);
				if (nothanks.isDisplayed()) {
					nothanks.click();
					logger.info("Closed popup");
					sleep(2);
				}
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_MyWishCare_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
}
