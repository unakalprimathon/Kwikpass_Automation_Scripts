package com.kwikpass.automation.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwikpass.pageObjects.BaseClass;
import com.kwikpass.pageObjects.Locator;
import com.kwikpass.pageObjects.LoginPage;

public class TC_BSC_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_BSC_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_BSC_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
			logger.info("Verify_BSC_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_BSC_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_BSC_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_BSC_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_BSC_KwikPass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_BSC_KwikPass_login_icon_Visibilty Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is opened");
		logger.info("BSC does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		if (kp_login_btn.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verify_BSC_KwikPass_login_icon_Visibilty Test case Passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_BSC_KwikPass_login_icon_Visibilty Test case Failed !");
			captureScreen(driver, "Verify_BSC_KwikPass_login_icon_Visibilty failed");
			Assert.fail("Verify_BSC_KwikPass_login_icon_Visibilty failed");
		}
	}
	

	@Test
	public void Verify_BSC_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
			logger.info("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_BSC_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS failed");
		}
	}
	
	@Test
	public void Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login() throws IOException{
		logger.info("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
		WebElement kp_after_login_btn = driver.findElement(By.id(kwikpass_icon_al));
		WebDriverWait kp_after_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_after_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_after_login_btn));
		kp_after_login_btn.click();
		logger.info("Clicked Kwikpass Icon after login");
		WebElement order_history_btn = driver.findElement(By.xpath(orderhistory_btn));
		WebDriverWait order_history_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		order_history_btn_wait.until(ExpectedConditions.elementToBeClickable(order_history_btn));
		order_history_btn.click();
		logger.info("Clicked order_history_btn");
		sleep(10);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.bombayshavingcompany.com/account#order";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(BSC_logout)).isDisplayed();
			logger.info("Shopify login and session created in BSC after Kwikpass login passed.");
			logger.info("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Shopify login and session not created in BSC after Kwikpass login failed.");
			logger.info("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login Test Case failed!");
			captureScreen(driver, "Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login failed");
			Assert.fail("Verify_BSC_Shopify_login_and_session_creation_after_Kwikpass_login failed");
		}
	}

	@Test
	public void Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
			sleep(3);
			driver.navigate().to("https://www.bombayshavingcompany.com/products/sensi-smart-3-value-pack-1-handle-3-cartridge");
			logger.info("Navigated to PDP page");
			String script = String.format("window.scrollTo(%d, %d);", 500, 500);
			((JavascriptExecutor) driver).executeScript(script);
			WebElement add_to_cart = driver.findElement(By.className(BSC_addtocart));
			WebDriverWait add_to_cart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			add_to_cart_wait.until(ExpectedConditions.elementToBeClickable(add_to_cart));
			add_to_cart.click();
			logger.info("Clicked Add to Cart button");
			sleep(8);
			WebElement cart_btn = driver.findElement(By.xpath(BSC_cart_btn));
			WebDriverWait cart_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			cart_btn_wait.until(ExpectedConditions.elementToBeClickable(cart_btn));
			cart_btn.click();
			logger.info("clicked on Express checkout button");
			sleep(5);
			WebElement placeorder = driver.findElement(By.className(BSC_placeorder));
			WebDriverWait placeorder_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			placeorder_wait.until(ExpectedConditions.elementToBeClickable(placeorder));
			placeorder.click();
			logger.info("clicked on Place order button");
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
				logger.info("Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "FVerify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_BSC_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_BSC_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_BSC_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/account#order");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
			logger.info("Verify_BSC_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_BSC_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_BSC_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_BSC_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_BSC_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_BSC_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/account");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
			String vurl = "https://www.bombayshavingcompany.com/account#profile";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(BSC_logout)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_BSC_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_BSC_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_BSC_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_BSC_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_BSC_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_BSC_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_BSC_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
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
			driver.navigate().to("https://www.bombayshavingcompany.com/account#profile");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.bombayshavingcompany.com/account#profile";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(BSC_logout)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_BSC_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
	
	@Test
	public void Verify_BSC_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://www.bombayshavingcompany.com/");
		logger.info("URL is open");
		logger.info("BSC does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(3);
		WebElement rewards_btn = driver.findElement(By.xpath(BSC_rewards_btn));
		WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
		rewards_btn.click();
		logger.info("Clicked rewards_btn ");
		sleep(5);
		WebElement rewards_sign_btn = driver.findElement(By.xpath(BSC_rewards_joinnow_btn));
		WebDriverWait rewards_sign_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_sign_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_sign_btn));
		rewards_sign_btn.click();
		logger.info("Clicked rewards_joinnow_btn ");
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		logger.info("Mobile number entered");
		sleep(2);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		driver.switchTo().defaultContent();
		sleep(8);
		String curl = driver.getCurrentUrl();
		String vurl = "https://www.bombayshavingcompany.com/account#profile";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_BSC_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_BSC_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}
}
