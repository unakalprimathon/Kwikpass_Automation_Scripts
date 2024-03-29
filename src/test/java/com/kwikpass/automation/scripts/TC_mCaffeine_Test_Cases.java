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

public class TC_mCaffeine_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_mCaffeine_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.mcaffeine.com/");
		logger.info("URL is open");
		logger.info("mCaffeine does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		WebElement later = driver.findElement(By.xpath(mcaffeine_later));
		WebDriverWait later_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		later_wait.until(ExpectedConditions.elementToBeClickable(later));
		later.click();
		logger.info("closed popup");
		WebElement dropdown = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(mCaffeine_signup_btn)); 
		loginOption.click();
		logger.info("Login / Signup button clicked");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobileinputfield = By.id(mobile_input); 
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobileinputfieldpresent = !driver.findElements(mobileinputfield).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobileinputfieldpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_mCaffeine_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_mCaffeine_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_mCaffeine_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_mCaffeine_KwikPass_login_modal_verification failed");
		}
	}
	

	@Test
	public void Verify_mCaffeine_Kwikpass_login_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_Kwikpass_login_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://www.mcaffeine.com/");
		logger.info("URL is open");
		logger.info("mCaffeine does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		WebElement later = driver.findElement(By.xpath(mcaffeine_later));
		WebDriverWait later_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		later_wait.until(ExpectedConditions.elementToBeClickable(later));
		later.click();
		logger.info("closed popup");
		WebElement dropdown = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(mCaffeine_signup_btn)); 
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
		sleep(12);
		driver.switchTo().defaultContent();
		WebElement dropdown1 = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(mCaffeine_profile_button)); 
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass Login Successful !");
			logger.info("Verify_mCaffeine_Kwikpass_login_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_mCaffeine_Kwikpass_login_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_mCaffeine_Kwikpass_login_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_mCaffeine_Kwikpass_login_using_OTP_Via_SMS failed");
		}
	}
	
	@Test
	public void Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login() throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login Test case is running.....");
		driver.get("https://www.mcaffeine.com/");
		logger.info("URL is open");
		logger.info("mCaffeine does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		WebElement later = driver.findElement(By.xpath(mcaffeine_later));
		WebDriverWait later_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		later_wait.until(ExpectedConditions.elementToBeClickable(later));
		later.click();
		logger.info("closed popup");
		WebElement dropdown = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(mCaffeine_signup_btn)); 
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
		driver.switchTo().defaultContent();
		sleep(12);
		WebElement dropdown1 = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(mCaffeine_profile_button)); 
		if(myaccount.isDisplayed()) {
			logger.info("Kwikpass login successful");
			myaccount.click();
			sleep(5);
			String url = driver.getCurrentUrl();
			String vurl = "https://www.mcaffeine.com/account";
			if(url.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login passed");
				logger.info("Test case completed");
			}else {
				logger.info("Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				captureScreen(driver, "Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
				Assert.fail("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			}
		}else {
			logger.info("Kwikpass login unsuccessful");
			logger.info("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			captureScreen(driver, "Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
			Assert.fail("Verify_mCaffeine_Shopify_Login_and_session_creation_Ater_Kwikpass_Login failed");
		}
	}

	@Test
	public void Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://www.mcaffeine.com/");
		logger.info("URL is open");
		logger.info("mCaffeine does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		WebElement later = driver.findElement(By.xpath(mcaffeine_later));
		WebDriverWait later_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		later_wait.until(ExpectedConditions.elementToBeClickable(later));
		later.click();
		logger.info("closed popup");
		WebElement dropdown = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(mCaffeine_signup_btn)); 
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
		sleep(12);
		driver.switchTo().defaultContent();
		WebElement dropdown1 = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(mCaffeine_profile_button)); 
		if(myaccount.isDisplayed()) {
			logger.info("Login Successful !");
			sleep(3);
			driver.navigate().to("https://www.mcaffeine.com/products/espresso-coffee-body-wash-with-natural-aha-300ml");
			logger.info("Navigated to PDP page");
			WebElement addtocart = driver.findElement(By.xpath(mCaffeine_addtocart));
			WebDriverWait addtocart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			addtocart_wait.until(ExpectedConditions.elementToBeClickable(addtocart));
			addtocart.click();
			logger.info("Clicked Buy now button");
			sleep(5);
			WebElement placeorder = driver.findElement(By.className(mCaffeine_placeorder));
			WebDriverWait placeorder_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			placeorder_wait.until(ExpectedConditions.elementToBeClickable(placeorder));
			placeorder.click();
			logger.info("Clicked Buy now button");
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
				logger.info("Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "FVerify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_mCaffeine_Kwikpass_login_Done_Gokwik_login_should_happen failed");
		}
	}
	
	@Test
	public void Verify_mCaffeine_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://www.mcaffeine.com/account");
		logger.info("URL is open");
		logger.info("mCaffeine does not have Kwikpass AP");
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
			logger.info("Verify_mCaffeine_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_mCaffeine_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_mCaffeine_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_mCaffeine_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_mCaffeine_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.mcaffeine.com/account");
		logger.info("URL is open");
		logger.info("mCaffeine does not have Kwikpass AP");
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
			sleep(12);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.mcaffeine.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_mCaffeine_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_mCaffeine_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_mCaffeine_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_mCaffeine_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_mCaffeine_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_mCaffeine_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_mCaffeine_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://www.mcaffeine.com/");
		logger.info("URL is open");
		logger.info("mCaffeine does not has Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		WebElement later = driver.findElement(By.xpath(mcaffeine_later));
		WebDriverWait later_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		later_wait.until(ExpectedConditions.elementToBeClickable(later));
		later.click();
		logger.info("closed popup");
		WebElement dropdown = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).perform();
		WebElement loginOption = driver.findElement(By.xpath(mCaffeine_signup_btn)); 
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
		sleep(12);
		driver.switchTo().defaultContent();
		WebElement dropdown1 = driver.findElement(By.id(mCaffeine_login_icon));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(dropdown1).perform();
		WebElement myaccount = driver.findElement(By.xpath(mCaffeine_profile_button)); 
		if(myaccount.isDisplayed()) {
			driver.navigate().to("https://www.mcaffeine.com/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.mcaffeine.com/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_mCaffeine_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}
}
