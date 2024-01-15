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

public class TC_SwissBeauty_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Swiss_Beauty_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Swiss_Beauty_KwikPass_login_modal_verification Test case is running.....");
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
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_Swiss_Beauty_KwikPass_login_modal_verification Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Swiss_Beauty_KwikPass_login_modal_verification Test Case failed!");
			captureScreen(driver, "Verify_Swiss_Beauty_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Swiss_Beauty_KwikPass_login_modal_verification failed");
		}
		
	}
	
	@Test
	public void Verify_Swiss_Beauty_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Swiss_Beauty_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
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
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
		driver.switchTo().defaultContent();
		logger.info("Switched back to main page");
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked on kwikpass icon");
		By logoutbtn = By.xpath(logout_btn);   
		By orderhistorybtn = By.xpath(hokorderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Kwikpass login is Successfull !");
			logger.info("Verify_Swiss_Beauty_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test case completed");

		} else {
			logger.info("Kwikpass login is Unsuccessfull !");
			logger.info("Verify_Swiss_Beauty_Kwikpass_login_using_OTP_Via_SMS Test Case failed!");
			captureScreen(driver, "Verify_Swiss_Beauty_Kwikpass_login_using_OTP_Via_SMS failed");
			Assert.fail("Verify_Swiss_Beauty_Kwikpass_login_using_OTP_Via_SMS failed");
		}
	}


	@Test
	public void Verify_Swiss_Beauty_KwikPass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_Swiss_Beauty_KwikPass_login_icon_Visibilty Test case is running.....");
		driver.get("https://swissbeauty.in/");
		logger.info("URL is opened");
		logger.info("Swiss_Beauty does not have Kwikpass AP");
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl));
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verify_Swiss_Beauty_KwikPass_login_icon_Visibilty Test case Passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_Swiss_Beauty_KwikPass_login_icon_Visibilty Test case Failed !");
			captureScreen(driver, "Verify_Swiss_Beauty_KwikPass_login_icon_Visibilty failed");
			Assert.fail("Verify_Swiss_Beauty_KwikPass_login_icon_Visibilty failed");
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
	public void Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
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
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(10);
		driver.switchTo().defaultContent();
		logger.info("Switched back to main page");
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked on kwikpass icon");
		By logoutbtn = By.xpath(logout_btn);   
		By orderhistorybtn = By.xpath(hokorderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			sleep(3);
			driver.navigate().to("https://swissbeauty.in/products/highlighting-primer-sb-1305");
			logger.info("Navigated to PDP page");
			WebElement buy_now = driver.findElement(By.xpath(swissbeauty_addtocart));
			WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
			buy_now.click();
			logger.info("Clicked Add to cart button");
			sleep(3);
			WebElement express_checkout = driver.findElement(By.className(swissbeauty_buynow));
			WebDriverWait express_checkout_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			express_checkout_wait.until(ExpectedConditions.elementToBeClickable(express_checkout));
			express_checkout.click();
			logger.info("clicked on Buy Now button");
			sleep(5);
			lp.switchToGokwikIframe(gokwik_iframe);
			logger.info("Switched to gokwik checkout");
			String X = driver.findElement(By.xpath(gokwikname)).getText();
			logger.info(X);
			String x1 = "Automation Testing";
			if (X.equals(x1)) {
				logger.info("Gokwik login successfull !");
				sleep(2);
				logger.info("Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("kwikpass Login Unsuccessful !");
			logger.info("Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_Swiss_Beauty_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://swissbeauty.in/account");
		logger.info("URL is open");
		logger.info("SwissBeauty does not have Kwikpass AP");
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
			logger.info("Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage failed");
			Assert.fail("Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage failed");
		}
	}
	
	@Test
	public void Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test case is running.....");
		logger.info("Verify_SwissBeauty_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://swissbeauty.in/account");
		logger.info("URL is open");
		logger.info("SwissBeauty does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
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
			String vurl = "https://swissbeauty.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass login unsuccessful.");
				logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case failed!");
				captureScreen(driver, "Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
				Assert.fail("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed !");
			Assert.fail("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
		}

	}
	
	@Test
	public void Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://swissbeauty.in/");
		logger.info("URL is open");
		logger.info("SwissBeauty does not have Kwikpass AP");
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
			driver.navigate().to("https://swissbeauty.in/account");
			logger.info("Switched to default page");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://swissbeauty.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver, "Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_SwissBeauty_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}
	}
	
	@Test
	public void Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://swissbeauty.in/");
		logger.info("URL is open");
		logger.info("SwissBeauty does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		WebElement rewards_btn = driver.findElement(By.id(swissbeauty_reward_btn));
		WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
		rewards_btn.click();
		logger.info("Clicked rewards_btn ");
		sleep(5);
		lp.switchToIframe(swissbeauty_reward_iframe);
		logger.info("Switched to rewards iframe");
		WebElement rewards_sign_btn = driver.findElement(By.xpath(swissbeauty_reward_joinnow));
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
		String curl = driver.getCurrentUrl();
		String vurl = "https://swissbeauty.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_SwissBeauty_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}
}
