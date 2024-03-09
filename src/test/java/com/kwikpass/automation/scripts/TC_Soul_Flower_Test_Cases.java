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

public class TC_Soul_Flower_Test_Cases extends BaseClass implements Locator{

	@Test
	public void Verify_Soul_Flower_KwikPass_login_icon_Visibilty() throws IOException, InterruptedException {
		logger.info("Verify_Soul_Flower_KwikPass_login_icon_Visibilty Test case is running.....");
		driver.get("https://www.soulflower.in/");
		logger.info("URL is opened");
		logger.info("Soul_Flower does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		if (kp_login_btn.isDisplayed()) {
			logger.info("Kwikpass icon is visible");
			logger.info("Verify_Soul_Flower_KwikPass_login_icon_Visibilty Test case Passed !");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Kwikpass icon not-visible");
			logger.info("Verify_Soul_Flower_KwikPass_login_icon_Visibilty Test case Failed !");
			captureScreen(driver, "Verify_Soul_Flower_KwikPass_login_icon_Visibilty failed");
			Assert.fail("Verify_Soul_Flower_KwikPass_login_icon_Visibilty failed");
		}
	}
	
	
	@Test
	public void Verify_Soul_Flower_KwikPass_Login_modal_Verfication_at_accountpage()throws IOException, InterruptedException {
		logger.info("Verify_Soul_Flower_KwikPass_Login_modal_Verfication_at_accountpage Test case is running.....");
		driver.get("https://www.soulflower.in/account");
		logger.info("URL is open");
		logger.info("Soul_Flower has Kwikpass AP");
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
			logger.info("Verify_Soul_Flower_KwikPass_Login_modal_Verfication_at_accountpage Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Soul_Flower_KwikPass_Login_modal_Verfication_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Soul_Flower_KwikPass_Login_modal_Verfication_at_accountpage failed");
			Assert.fail("Verify_Soul_Flower_KwikPass_Login_modal_Verfication_at_accountpage failed");
		}
	}

	@Test
	public void Verify_Soul_Flower_KwikPass_Login_at_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test case is running.....");
		driver.get("https://www.soulflower.in/account");
		logger.info("URL is open");
		logger.info("Soul_Flower has Kwikpass AP");
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
			sleep(8);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://www.soulflower.in/account";
			if (curl.equals(vurl)) {
				driver.findElement(By.xpath(acc_logout_btn)).isDisplayed();
				logger.info("The Kwikpass Login successfull.");
				logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test Cases passed!");
				logger.info("Test Cases Completed !");
			} else {
				logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test Case failed!");
				captureScreen(driver,"Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
				Assert.fail("Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
			}
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Soul_Flower_KwikPass_Login_at_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
			Assert.fail("Verify_Soul_Flower_KwikPass_Login_at_accountpage failed");
		}
	}
	
}
