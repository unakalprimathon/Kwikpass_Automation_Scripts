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

public class TC_Saadaa_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen()throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://saadaa.in/");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(Saadaa_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked hamburger button");
		sleep(3);
		WebElement kwikpass_btn = driver.findElement(By.id(Saadaa_kwikpass_btn));
		WebDriverWait kwikpass_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kwikpass_btn_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn));
		kwikpass_btn.click();
		logger.info("Clicked kwikpass_btn");
		LoginPage lp = new LoginPage(driver);
		sleep(18);
		lp.switchToIframe(Saadaa_popup_iframe);
		driver.findElement(By.className(Saadaa_popup_close)).click();
		driver.switchTo().defaultContent();
		logger.info("close saadaa popup");
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
		String x = driver.findElement(By.id(Saadaa_account_txt)).getText();
		logger.info(x);
		String x11 = "ACCOUNT";
		if (x.equals(x11)) {
			logger.info("Login Successful !");
			sleep(3);
			driver.navigate().to("https://saadaa.in/products/rose-taupe-airy-linen-short-kurta");
			logger.info("Navigated to PDP page");
			WebElement selectsize = driver.findElement(By.xpath(Saadaa_selectsize));
			WebDriverWait selectsize_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			selectsize_wait.until(ExpectedConditions.elementToBeClickable(selectsize));
			selectsize.click();
			logger.info("Clicked selectsize button");
			sleep(1);
			WebElement addtocart = driver.findElement(By.className(Saadaa_addtocart));
			WebDriverWait addtocart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			addtocart_wait.until(ExpectedConditions.elementToBeClickable(addtocart));
			addtocart.click();
			logger.info("Clicked addtocart button");
			sleep(3);
			WebElement placeorder = driver.findElement(By.className(Saadaa_placeorder));
			WebDriverWait placeorder_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			placeorder_wait.until(ExpectedConditions.elementToBeClickable(placeorder));
			placeorder.click();
			logger.info("Clicked placeorder button");
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
				logger.info("Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver,"Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver,"Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed !");
			Assert.fail(" Verify_Saadaa_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
		}

	}

	@Test
	public void Verify_Saadaa_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS()throws IOException, InterruptedException {
		logger.info("Saadaa_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://saadaa.in/");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(Saadaa_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked hamburger button");
		sleep(3);
		WebElement kwikpass_btn = driver.findElement(By.id(Saadaa_kwikpass_btn));
		WebDriverWait kwikpass_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kwikpass_btn_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn));
		kwikpass_btn.click();
		logger.info("Clicked kwikpass_btn");
		LoginPage lp = new LoginPage(driver);
		sleep(18);
		lp.switchToIframe(Saadaa_popup_iframe);
		driver.findElement(By.className(Saadaa_popup_close)).click();
		driver.switchTo().defaultContent();
		logger.info("close saadaa popup");
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
		String x = driver.findElement(By.id(Saadaa_account_txt)).getText();
		logger.info(x);
		String x11 = "ACCOUNT";
		if (x.equals(x11)) {
			logger.info("Login Successful !");
			logger.info("Verify_Saadaa_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Saadaa_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_Saadaa_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_Saadaa_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed");
		}

	}

	@Test
	public void Verify_Saadaa_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://saadaa.in/");
		logger.info("URL is open");
		WebElement hamburger = driver.findElement(By.xpath(Saadaa_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked hamburger button");
		sleep(3);
		WebElement kwikpass_btn = driver.findElement(By.id(Saadaa_kwikpass_btn));
		WebDriverWait kwikpass_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kwikpass_btn_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn));
		kwikpass_btn.click();
		logger.info("Clicked kwikpass_btn");
		LoginPage lp = new LoginPage(driver);
		sleep(18);
		lp.switchToIframe(Saadaa_popup_iframe);
		driver.findElement(By.className(Saadaa_popup_close)).click();
		driver.switchTo().defaultContent();
		logger.info("close saadaa popup");
		sleep(2);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Saadaa_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Saadaa_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Saadaa_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Saadaa_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal()
			throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://saadaa.in/");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(Saadaa_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked hamburger button");
		sleep(3);
		WebElement kwikpass_btn = driver.findElement(By.id(Saadaa_kwikpass_btn));
		WebDriverWait kwikpass_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kwikpass_btn_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn));
		kwikpass_btn.click();
		logger.info("Clicked kwikpass_btn");
		LoginPage lp = new LoginPage(driver);
		sleep(18);
		lp.switchToIframe(Saadaa_popup_iframe);
		driver.findElement(By.className(Saadaa_popup_close)).click();
		driver.switchTo().defaultContent();
		logger.info("close saadaa popup");
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
		String x = driver.findElement(By.id(Saadaa_account_txt)).getText();
		logger.info(x);
		String x11 = "ACCOUNT";
		if (x.equals(x11)) {
			logger.info("Login Successful !");
			WebElement kwikpass_btn1 = driver.findElement(By.id(Saadaa_account_txt));
			WebDriverWait kwikpass_btn1_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			kwikpass_btn1_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn1));
			kwikpass_btn1.click();
			logger.info("Clicked kwikpass_btn");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://saadaa.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Shopify login and session created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in Urban Jungle after Kwikpass login .");
				logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver,"Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver,"Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_Saadaa_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}

	@Test
	public void Verify_Saadaa_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://saadaa.in/account");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
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
			logger.info("Verify_Saadaa_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Saadaa_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Saadaa_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Saadaa_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Saadaa_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://saadaa.in/account");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		sleep(18);
		lp.switchToIframe(Saadaa_popup_iframe);
		driver.findElement(By.className(Saadaa_popup_close)).click();
		driver.switchTo().defaultContent();
		logger.info("close saadaa popup");
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
			sleep(10);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://saadaa.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Saadaa_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Saadaa_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Saadaa_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Saadaa_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Saadaa_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Saadaa_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Saadaa_KwikPass_Login_at_accountpage failed");
		}
	}
	
	@Test
	public void Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://saadaa.in/");
		logger.info("URL is open");
		logger.info("Saadaa has Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(Saadaa_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked hamburger button");
		sleep(3);
		WebElement kwikpass_btn = driver.findElement(By.id(Saadaa_kwikpass_btn));
		WebDriverWait kwikpass_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kwikpass_btn_wait.until(ExpectedConditions.elementToBeClickable(kwikpass_btn));
		kwikpass_btn.click();
		logger.info("Clicked kwikpass_btn");
		LoginPage lp = new LoginPage(driver);
		sleep(18);
		lp.switchToIframe(Saadaa_popup_iframe);
		driver.findElement(By.className(Saadaa_popup_close)).click();
		driver.switchTo().defaultContent();
		logger.info("close saadaa popup");
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
		String x = driver.findElement(By.id(Saadaa_account_txt)).getText();
		logger.info(x);
		String x11 = "ACCOUNT";
		if (x.equals(x11)) {
			driver.navigate().to("https://saadaa.in/account");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://saadaa.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("Login Successful !");
				logger.info("Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_Saadaa_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}

	}

}
