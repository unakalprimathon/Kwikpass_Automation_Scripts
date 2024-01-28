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

public class TC_HOK_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_HOK_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_HOK_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
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
			logger.info("Verify_HOK_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_HOK_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_HOK_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_HOK_KwikPass_login_modal_verification failed");
		}
	}
	

	@Test
	public void Verify_HOK_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
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
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked Kwikpass Icon");   
		By logoutbtn = By.xpath(logout_btn); 
		By orderhistorybtn = By.xpath(hokorderhistory_btn);
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			logger.info("Login Successful !");
			logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_HOK_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS failed");
		}

	}
	
	@Test
	public void Verify_HOK_KwikPass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_HOK_KwikPass_login_icon_Visibilty Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is opened");
		logger.info("HOK does not have Kwikpass AP");
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl));
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verify_HOK_KwikPass_login_icon_Visibilty Test case Passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_HOK_KwikPass_login_icon_Visibilty Test case Failed !");
			captureScreen(driver, "Verify_HOK_KwikPass_login_icon_Visibilty failed");
			Assert.fail("Verify_HOK_KwikPass_login_icon_Visibilty failed");
		}
	}
	
	@Test
	public void Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
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
		WebElement kp_afterlogin_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_afterlogin_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_afterlogin_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_afterlogin_btn));
		kp_afterlogin_btn.click();
		logger.info("Clicked Kwikpass Icon");
		driver.findElement(By.xpath(hokorderhistory_btn)).click();
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://houseofkari.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Shopify login and session created in HOK after Kwikpass login .");
			logger.info("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in HOK after Kwikpass login .");
			logger.info("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_HOK_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}

	}
	
	@Test
	public void Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
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
			driver.navigate().to("https://houseofkari.in/products/fizaa-black-and-golden-silk-print-set-with-beige-hand-embroidery-hk-set5-20?variant=42862625849520");
			logger.info("Navigated to PDP page");
			WebElement size = driver.findElement(By.xpath(hokselect_size));
			WebDriverWait size_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			size_wait.until(ExpectedConditions.elementToBeClickable(size));
			size.click();
			logger.info("clicked on select size");
			WebElement buy_now = driver.findElement(By.xpath(hokbuynow));
			WebDriverWait buy_now_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			buy_now_wait.until(ExpectedConditions.elementToBeClickable(buy_now));
			buy_now.click();
			logger.info("Clicked Buy Now button");
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
				sleep(2);
				logger.info("Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("HOK_Kwikpass_login_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_HOK_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_HOK_KwikPass_login_modal_verification_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_HOK_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://houseofkari.in/account");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
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
			logger.info("Verify_HOK_KwikPass_login_modal_verification_from_accountpage Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_HOK_KwikPass_login_modal_verification_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_HOK_KwikPass_login_modal_verification_from_accountpage failed");
			Assert.fail("Verify_HOK_KwikPass_login_modal_verification_from_accountpage failed");
		}
	}
	
	@Test
	public void Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test case is running.....");
		logger.info("Verify_HOK_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://houseofkari.in/account");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(10);
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
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
			String curl = driver.getCurrentUrl();
			String vurl = "https://houseofkari.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass login unsuccessful.");
				logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case failed!");
				captureScreen(driver, "Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
				Assert.fail("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed !");
			Assert.fail("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
		}

	}
	
	@Test
	public void Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
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
		By orderhistorybtn = By.xpath(hokorderhistory_btn); 
		boolean logoutbtnPresent = !driver.findElements(logoutbtn).isEmpty();
		boolean orderhistorybtnPresent = !driver.findElements(orderhistorybtn).isEmpty();
		if (logoutbtnPresent && orderhistorybtnPresent) {
			driver.navigate().to("https://houseofkari.in/account");
			logger.info("Switched to default page");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://houseofkari.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver, "Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_HOK_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}
	}
	
	@Test
	public void Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://houseofkari.in/");
		logger.info("URL is open");
		logger.info("HOK does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		WebElement closehok = driver.findElement(By.xpath(hokclose));
		WebDriverWait closehok_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		closehok_wait.until(ExpectedConditions.visibilityOf(closehok));
		if(closehok.isDisplayed()) {
			closehok.click();
		}
		logger.info("closed merchant popups");
		sleep(2);
		WebElement rewards_btn = driver.findElement(By.xpath(hokrewardsbtniframe));
		WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
		rewards_btn.click();
		logger.info("Clicked rewards_btn ");
		sleep(5);
		lp.switchTohokrewardsiframe(hokrewardsiframe);
		logger.info("Switched to rewards iframe");
		WebElement rewards_sign_btn = driver.findElement(By.xpath(hokrewardsjoinnow));
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
		String vurl = "https://houseofkari.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_HOK_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}
	
}
