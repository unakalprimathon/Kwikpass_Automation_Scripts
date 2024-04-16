package com.kwikpass.automation.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwikpass.pageObjects.BaseClass;
import com.kwikpass.pageObjects.Locator;
import com.kwikpass.pageObjects.LoginPage;

public class TC_Matural_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Matural_KwikPass_icon_visibility_Login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Matural_KwikPass_icon_visibility Test case is running.....");
		driver.get("https://matural.in/");
		logger.info("URL is open");
		logger.info("Matural does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
		WebElement dropdown = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.id(Matural_kplogin_btn));
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input); 
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Matural_KwikPass_icon_visibility Test Case passed!");
			logger.info("Test Cases done !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login.");
			logger.info("Verify_Matural_KwikPass_icon_visibility Test Cases failed!");
			captureScreen(driver, "Verify_Matural_KwikPass_icon_visibility failed!");
			Assert.fail("Verify_Matural_KwikPass_icon_visibility failed");
		}
	}
	
	@Test
	public void Verify_Matural_KwikPass_Login_Using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Matural_KwikPass_Login_Using_OTP_Via_SMS Test case is running.....");
		driver.get("https://matural.in/");
		logger.info("URL is open");
		logger.info("Matural does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
		WebElement dropdown = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.id(Matural_kplogin_btn));
		loginOption.click();
		logger.info("Login / Signup button clicked");
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
		WebElement dropdown1 = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(Matural_kpaccount));
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			logger.info("Verify_Matural_KwikPass_Login_Using_OTP_Via_SMS passed");
			logger.info("Test case completed");
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_Matural_KwikPass_Login_Using_OTP_Via_SMS failed");
			captureScreen(driver, "Verify_Matural_KwikPass_Login_Using_OTP_Via_SMS failed");
			Assert.fail("Verify_Matural_KwikPass_Login_Using_OTP_Via_SMS failed");
		}
	}
	
	@Test
	public void Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login() throws IOException, InterruptedException {
		logger.info("Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login Test case is running.....");
		driver.get("https://matural.in/");
		logger.info("URL is open");
		logger.info("Matural does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
		WebElement dropdown = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.id(Matural_kplogin_btn));
		loginOption.click();
		logger.info("Login / Signup button clicked");
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
		WebElement dropdown1 = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(Matural_kpaccount));
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			myaccount.click();
			sleep(8);
			String url = driver.getCurrentUrl();
			String vurl = "https://matural.in/account";
			if(url.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Test case completed");
			}else {
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				logger.info("Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				captureScreen(driver, "Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				Assert.fail("Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			}
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			captureScreen(driver, "Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			Assert.fail("Verify_Matural_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
		}
	}
	
	@Test
	public void Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen()throws IOException, InterruptedException {
		logger.info("Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://matural.in/");
		logger.info("URL is open");
		logger.info("Matural does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
		WebElement dropdown = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.id(Matural_kplogin_btn));
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
			logger.info("Mobile number entered");
			sleep(2);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(8);
			driver.switchTo().defaultContent();
				logger.info("Kwikpass Login successfull!");
				driver.navigate().to("https://matural.in/products/aloe-vera-chamomile-face-moisturiser-for-men");
				logger.info("Navigated to PDP page");
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollTo(1200, 1100)");
				WebElement add_to_cart = driver.findElement(By.xpath(Matural_addtocart));
				WebDriverWait add_to_cart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				add_to_cart_wait.until(ExpectedConditions.elementToBeClickable(add_to_cart));
				add_to_cart.click();
				logger.info("Clicked Add to cart button");
				sleep(8);
				WebElement express_checkout = driver.findElement(By.className(Matrual_placeorder));
				WebDriverWait express_checkout_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				express_checkout_wait.until(ExpectedConditions.elementToBeClickable(express_checkout));
				express_checkout.click();
				logger.info("clicked on Proceed to checkout button");
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
					logger.info("Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed");
					logger.info("Test case completed");
				} else {
					logger.info("Gokwik login fail");
					logger.info("Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed");
					captureScreen(driver, "Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen fail");
					Assert.fail("Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				}
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed");
			captureScreen(driver, "Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			Assert.fail("Verify_Matural_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_Matural_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Matural_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://matural.in/account");
		logger.info("URL is open");
		logger.info("Matural does not have Kwikpass AP");
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
			logger.info("Verify_Matural_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Matural_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Matural_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Matural_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Matural_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Matural_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://matural.in/account");
		logger.info("URL is open");
		logger.info("Matural does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
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
			String vurl = "https://matural.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Matural_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Matural_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Matural_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Matural_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Matural_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Matural_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Matural_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Matural_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Matural_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://matural.in/");
		logger.info("URL is open");
		logger.info("Matural does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(2);
		WebElement dropdown = driver.findElement(By.xpath(Matural_kpicon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.id(Matural_kplogin_btn));
		loginOption.click();
		logger.info("Login / Signup button clicked");
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
			driver.navigate().to("https://matural.in/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://matural.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Matural_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Matural_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Matural_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Matural_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
	}
	
	@Test
	public void Verify_Matural_Kwikpass_login_using_OTP_Via_SMS_from_Rewards() throws IOException, InterruptedException {
		logger.info("Verify_Matural_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test case is running.....");
		driver.get("https://matural.in/");
		logger.info("URL is open");
		logger.info("Matural does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		WebElement rewards_btn = driver.findElement(By.className(MaturaL_rewardsbtn));
		WebDriverWait rewards_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		rewards_btn_wait.until(ExpectedConditions.elementToBeClickable(rewards_btn));
		rewards_btn.click();
		logger.info("Clicked rewards_btn ");
		sleep(10);
		lp.switchToIframe(Matural_rewardsiframe);
		logger.info("Switched to rewards iframe");
		WebElement rewards_sign_btn = driver.findElement(By.xpath(Matural_signinbtn));
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
		sleep(8);
		driver.switchTo().defaultContent();
		String curl = driver.getCurrentUrl();
		String vurl = "https://matural.in/account";
		if (curl.equals(vurl)) {
			driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_Matural_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_Matural_Kwikpass_login_using_OTP_Via_SMS_from_Rewards Test Cases failed!");
			captureScreen(driver, "Verify_Matural_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed !");
			Assert.fail("Verify_Matural_Kwikpass_login_using_OTP_Via_SMS_from_Rewards failed");
		}

	}

}
