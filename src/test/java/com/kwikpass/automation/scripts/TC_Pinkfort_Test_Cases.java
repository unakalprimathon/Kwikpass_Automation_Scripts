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

public class TC_Pinkfort_Test_Cases extends BaseClass implements Locator{


	@Test
	public void Verify_Pinkfort_KwikPass_icon_visibilty() throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_KwikPass_icon_visibilty Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort does not have Kwikpass AP");
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl));
		if(s.isDisplayed()) {
			logger.info("Kwikpass icon visible");
			logger.info("Verify_Pinkfort_KwikPass_icon_visibilty Test case passed !");
			logger.info("Test case completed");
		}
		else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_Pinkfort_KwikPass_icon_visibilty Test case failed !");
			captureScreen(driver, "Verify_Pinkfort_KwikPass_icon_visibilty failed");
			Assert.fail("Verify_Pinkfort_KwikPass_icon_visibilty failed");
		}
	}
	
	@Test
	public void Verify_Pinkfort_Kwikpass_Normal_Login_Verification()throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_Kwikpass_Normal_Login_Verification Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort does not have Kwikpass AP");
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
			logger.info("Verify_Pinkfort_Kwikpass_Normal_Login_Verification Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Pinkfort_Kwikpass_Normal_Login_Verification Test Case failed!");
			captureScreen(driver, "Verify_Pinkfort_Kwikpass_Normal_Login_Verification failed");
			Assert.fail("Verify_Pinkfort_Kwikpass_Normal_Login_Verification failed");
		}
		
	}
	
	@Test
	public void Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException, InterruptedException {
		logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort does not have Kwikpass AP");
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
			String vurl = "https://pinkfort.co/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Pinkfort after Kwikpass login .");
				logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Pinkfort after Kwikpass login .");
				logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
				captureScreen(driver, "Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
				Assert.fail("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			}
			
		} else {
			logger.info("Shopify login and session not created after Kwikpass login.");
			logger.info("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login test case failed !");
			captureScreen(driver, "Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verfiy_Pinkfort_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}
	

	@Test
	public void Verify_Pinkfort_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort does not have Kwikpass AP");
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
			logger.info("Verify_Pinkfort_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test case completed");

		} else {
			logger.info("Kwikpass login is Unsuccessfull !");
			logger.info("Verify_Pinkfort_Kwikpass_login_using_OTP_Via_SMS Test Case failed!");
			captureScreen(driver, "Verify_Pinkfort_Kwikpass_login_using_OTP_Via_SMS failed");
			Assert.fail("Verify_Pinkfort_Kwikpass_login_using_OTP_Via_SMS failed");
		}
	}

	@Test
	public void Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort does not have Kwikpass AP");
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
			driver.navigate().to("https://pinkfort.co/products/satin-ethnic-motif-dress-green-pfdr1342grmi?variant=43884166512802");
			logger.info("Navigated to PDP page");
			WebElement size = driver.findElement(By.xpath(pinkfort_size));
			WebDriverWait size_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			size_wait.until(ExpectedConditions.elementToBeClickable(size));
			size.click();
			logger.info("Clicked on select size button");
			WebElement buy_now = driver.findElement(By.xpath(pinkfort_addtocart));
			WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
			buy_now.click();
			logger.info("Clicked Add to Cart button");
			sleep(3);
			WebElement gokwik_checkout = driver.findElement(By.className(pinkfort_UPI_CARD_COD));
			WebDriverWait gokwik_checkout_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			gokwik_checkout_wait.until(ExpectedConditions.elementToBeClickable(gokwik_checkout));
			gokwik_checkout.click();
			logger.info("Clicked UPI/CARD/COD button");
			sleep(3);
			lp.switchToGokwikIframe(gokwik_iframe);
			logger.info("Switched to gokwik checkout");
			String X = driver.findElement(By.xpath(gokwikname)).getText();
			logger.info(X);
			String x1 = "Automation Testing";
			if (X.equals(x1)) {
				logger.info("Gokwik login successfull !");
				sleep(2);
				logger.info("Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_Pinkfort_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_Pinkfort_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://pinkfort.co/account");
		logger.info("URL is open");
		logger.info("Pinkfort has Kwikpass AP");
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
			logger.info("Verify_Pinkfort_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Pinkfort_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Pinkfort_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Pinkfort_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Pinkfort_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://pinkfort.co/account");
		logger.info("URL is open");
		logger.info("Pinkfort has Kwikpass AP");
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
			String vurl = "https://pinkfort.co/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Pinkfort_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Pinkfort_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Pinkfort_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Pinkfort_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Pinkfort_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Pinkfort_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Pinkfort_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://pinkfort.co/");
		logger.info("URL is open");
		logger.info("Pinkfort has Kwikpass AP");
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
			driver.navigate().to("https://pinkfort.co/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://pinkfort.co/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_Pinkfort_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
}