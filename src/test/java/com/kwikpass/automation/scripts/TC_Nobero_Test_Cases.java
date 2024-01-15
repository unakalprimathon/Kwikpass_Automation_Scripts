package com.kwikpass.automation.scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwikpass.pageObjects.BaseClass;
import com.kwikpass.pageObjects.Locator;
import com.kwikpass.pageObjects.LoginPage;

public class TC_Nobero_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Nobero_KwikPass_icon_visibility() throws IOException, InterruptedException {
		logger.info("Verify_Nobero_KwikPass_icon_visibility Test case is running.....");
		driver.get("https://nobero.com/");
		logger.info("URL is open");
		logger.info("Nobero does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		driver.findElement(By.xpath(nobero_close_iframe)).click();
		driver.switchTo().defaultContent();
		WebElement dropdown = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(nobero_login_btn));
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
			logger.info("Verify_Nobero_KwikPass_icon_visibility Test Case passed!");
			logger.info("Test Cases done !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login.");
			logger.info("Verify_Nobero_KwikPass_icon_visibility Test Cases failed!");
			captureScreen(driver, "Verify_Nobero_KwikPass_icon_visibility failed!");
			Assert.fail("Verify_Nobero_KwikPass_icon_visibility failed");
		}
	}
	
	@Test
	public void Verify_Nobero_KwikPass_Login_Using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_Nobero_KwikPass_Login_Using_OTP_Via_SMS Test case is running.....");
		driver.get("https://nobero.com/");
		logger.info("URL is open");
		logger.info("Nobero does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		driver.findElement(By.xpath(nobero_close_iframe)).click();
		driver.switchTo().defaultContent();
		WebElement dropdown = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(nobero_login_btn)); 
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		sleep(8);
		driver.switchTo().defaultContent();
		WebElement dropdown1 = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(nobero_myaccount));
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			logger.info("Verify_Nobero_KwikPass_Login_Using_OTP_Via_SMS passed");
			logger.info("Test case completed");
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_Nobero_KwikPass_Login_Using_OTP_Via_SMS failed");
			captureScreen(driver, "Verify_Nobero_KwikPass_Login_Using_OTP_Via_SMS failed");
			Assert.fail("Verify_Nobero_KwikPass_Login_Using_OTP_Via_SMS failed");
		}
	}
	
	@Test
	public void Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login() throws IOException, InterruptedException {
		logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login Test case is running.....");
		driver.get("https://nobero.com/");
		logger.info("URL is open");
		logger.info("Nobero does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		driver.findElement(By.xpath(nobero_close_iframe)).click();
		driver.switchTo().defaultContent();
		WebElement dropdown = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(nobero_login_btn)); 
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
		WebElement dropdown1 = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(nobero_myaccount));
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			myaccount.click();
			sleep(8);
			String url = driver.getCurrentUrl();
			String vurl = "https://nobero.com/account";
			if(url.equals(vurl)) {
				driver.findElement(By.xpath(nobero_logout_btn)).isDisplayed();
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Test case completed");
			}else {
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				captureScreen(driver, "Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				Assert.fail("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			}
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			captureScreen(driver, "Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			Assert.fail("Verify_Nobero_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
		}
	}
	
	@Test
	public void Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen()throws IOException, InterruptedException {
		logger.info("Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://nobero.com/");
		logger.info("URL is open");
		logger.info("Nobero does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		driver.findElement(By.xpath(nobero_close_iframe)).click();
		driver.switchTo().defaultContent();
		WebElement login_dropdown = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(login_dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(nobero_login_btn)); 																					// accordingly
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
				driver.navigate().to("https://nobero.com/products/classic-hoodie-11");
				logger.info("Navigated to PDP page");
				WebElement add_to_cart = driver.findElement(By.name(nobero_add_to_cart));
				WebDriverWait add_to_cart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				add_to_cart_wait.until(ExpectedConditions.elementToBeClickable(add_to_cart));
				add_to_cart.click();
				logger.info("Clicked Add to cart button");
				sleep(2);
				WebElement express_checkout = driver.findElement(By.xpath(nobero_Proceed_to_buy));
				WebDriverWait express_checkout_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				express_checkout_wait.until(ExpectedConditions.elementToBeClickable(express_checkout));
				express_checkout.click();
				logger.info("clicked on Proceed to checkout button");
				sleep(5);
				lp.switchToGokwikIframe(gokwik_iframe);
				logger.info("switched to gokwik iframe");
				String X = driver.findElement(By.xpath(gokwikname)).getText();
				logger.info(X);
				String x1 = "Automation Testing";
				if (X.equals(x1)) {
					logger.info("Gokwik login successfull !");
					sleep(2);
					logger.info("Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed");
					logger.info("Test case completed");
				} else {
					logger.info("Gokwik login fail");
					logger.info("Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed");
					captureScreen(driver, "Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen fail");
					Assert.fail("Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				}
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed");
			captureScreen(driver, "Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			Assert.fail("Verify_Nobero_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_Nobero_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Nobero_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://nobero.com/account");
		logger.info("URL is open");
		logger.info("Nobero has Kwikpass AP");
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
			logger.info("Verify_Nobero_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Nobero_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Nobero_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Nobero_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Nobero_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Nobero_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://nobero.com/account");
		logger.info("URL is open");
		logger.info("Nobero has Kwikpass AP");
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		driver.findElement(By.xpath(nobero_close_iframe)).click();
		driver.switchTo().defaultContent();
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
			sleep(3);
			driver.findElement(By.id(otp_input)).sendKeys(otp);
			logger.info("OTP entered");
			sleep(15);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://nobero.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(nobero_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Nobero_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Nobero_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Nobero_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Nobero_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Nobero_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Nobero_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Nobero_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Nobero_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Nobero_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://nobero.com/");
		logger.info("URL is open");
		logger.info("Nobero has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToNoberoIframe(nobero_iframe);
		driver.findElement(By.xpath(nobero_close_iframe)).click();
		driver.switchTo().defaultContent();
		WebElement login_dropdown = driver.findElement(By.xpath(nobero_kwikpass_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(login_dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(nobero_login_btn)); 																					// accordingly
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
		sleep(3);
		driver.findElement(By.id(otp_input)).sendKeys(otp);
		logger.info("OTP entered");
		driver.switchTo().defaultContent();
		sleep(15);
			driver.navigate().to("https://nobero.com/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://nobero.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(nobero_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Nobero_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Nobero_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Nobero_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Nobero_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
	}

}
