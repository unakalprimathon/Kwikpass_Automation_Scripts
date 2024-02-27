package com.kwikpass.dailycheck;

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

public class All_Live_Merchant_Kwikpass_verification extends BaseClass implements Locator{
	
	@Test
	public void Verify_AdilQadri_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_AdilQadri_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.adilqadri.com/");
		logger.info("URL is open");
		logger.info("AdilQadri does not have Kwikpass AP");
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
			logger.info("Verify_AdilQadri_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_AdilQadri_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_AdilQadri_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_AdilQadri_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Amydus_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Amydus_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.amydus.com/");
		logger.info("URL is open");
		logger.info("Amydus does not have Kwikpass AP");
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
			logger.info("Verify_Amydus_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Amydus_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Amydus_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Amydus_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Assembly_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Assembly_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://assemblytravel.com/");
		logger.info("URL is open");
		logger.info("Assembly has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Assembly_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Assembly_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Assembly_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Assembly_KwikPass_Login_modal_Verfication failed");
		}
	}
	

	@Test
	public void Verify_BlueTyga_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_BlueTyga_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://bluetyga.com/");
		logger.info("URL is open");
		logger.info("BlueTyga does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.className(kwikpass_icon_bl));
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
			logger.info("Verify_BlueTyga_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_BlueTyga_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_BlueTyga_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_BlueTyga_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Bombae_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Bombae_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://mybombae.in/");
		logger.info("URL is open");
		logger.info("Bombae does not have Kwikpass AP");
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
			logger.info("Verify_Bombae_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Bombae_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Bombae_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Bombae_KwikPass_login_modal_verification failed");
		}
	}
	
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
	public void Verify_Dennis_Lingo_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Dennis_Lingo_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.dennislingo.com/");
		logger.info("URL is open");
		logger.info("Dennis_Lingo does not have Kwikpass AP");
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
			logger.info("Verify_Dennis_Lingo_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Dennis_Lingo_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Dennis_Lingo_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Dennis_Lingo_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_Dot_And_Key_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Dot_And_Key_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://www.dotandkey.com/");
		logger.info("URL is open");
		logger.info("Dot_And_Key has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Dot_And_Key_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Dot_And_Key_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Dot_And_Key_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Dot_And_Key_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_EyeWearLabs_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_EyeWearLabs_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.eyewearlabs.com/");
		logger.info("URL is open");
		logger.info("Eyewearlabs does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass iframe");
		sleep(3);
		By mobile_field = By.id(mobile_input);  
		By whatsapp_btn = By.id(whatsappid);
		boolean mobile_fieldpresent = !driver.findElements(mobile_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_EyeWearLabs_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_EyeWearLabs_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_EyeWearLabs_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_EyeWearLabs_KwikPass_login_modal_verification Test Cases failed!");
		}
	}
	
	@Test
	public void Verify_FireBoltt_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_FireBoltt_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.fireboltt.com/");
		logger.info("URL is open");
		logger.info("FireBoltt does not have Kwikpass AP");
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
			logger.info("Verify_FireBoltt_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_FireBoltt_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_FireBoltt_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_FireBoltt_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Formen_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Formen_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.formen.health/");
		logger.info("URL is open");
		logger.info("Formen does not have Kwikpass AP");
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
			logger.info("Verify_Formen_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Formen_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Formen_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Formen_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Foxtale_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Foxtale_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://foxtale.in/");
		logger.info("URL is open");
		logger.info("Foxtale does not have Kwikpass AP");
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
			logger.info("Verify_Foxtale_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Foxtale_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Foxtale_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Foxtale_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_GBT_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_GBT_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://growbilliontrees.com/");
		logger.info("URL is open");
		logger.info("GBT does not have Kwikpass AP");
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
			logger.info("Verify_GBT_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_GBT_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_GBT_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_GBT_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_GenieBags_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_GenieBags_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://genietravel.com/");
		logger.info("URL is open");
		logger.info("GenieBags has Kwikpass AP");
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
			logger.info("Verify_GenieBags_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_GenieBags_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_GenieBags_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_GenieBags_KwikPass_Login_modal_Verfication failed");

		}
	}
	
	@Test
	public void Verify_Gritstones_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Gritstones_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.gritstones.com/");
		logger.info("URL is open");
		logger.info("Gritstones does not have Kwikpass AP");
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
			logger.info("Verify_Gritstones_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Gritstones_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Gritstones_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Gritstones_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification() throws IOException, InterruptedException {
		logger.info("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification Test case is running.....");
		driver.get("https://guniaa.com/");
		logger.info("URL is open");
		logger.info("Guniaa has Kwikpass Auto Load Popup");
		LoginPage lp = new LoginPage(driver);
		WebElement kp_before_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_before_login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_before_login_btn_wait.until(ExpectedConditions.elementToBeClickable(kp_before_login_btn));
		kp_before_login_btn.click();
		logger.info("Clicked Kwikpass Iocn");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification Test Cases failed!");
			captureScreen(driver, "Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification failed");
			Assert.fail("Verify_Guniaa_Kwikpass_Normal_Login_Modal_Verification failed");
		}
	}
	
	@Test
	public void Verify_Hammer_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Hammer_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://hammeronline.in/");
		logger.info("URL is open");
		logger.info("Hammer does not have Kwikpass AP");
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
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_Hammer_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Hammer_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Hammer_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Hammer_KwikPass_login_modal_verification Failed");
		}
	}
	
	@Test
	public void Verify_Heelium_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Heelium_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://heelium.in/");
		logger.info("URL is open");
		logger.info("Heelium has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Heelium_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Heelium_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Heelium_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Heelium_KwikPass_Login_modal_Verfication failed");
		}
	}
	
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
	public void Verify_HOM_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_HOM_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://houseofmangalam.com/");
		logger.info("URL is open");
		logger.info("HOM has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_HOM_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_HOM_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_HOM_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_HOM_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Includ_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Includ_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://includ.com/");
		logger.info("URL is open");
		logger.info("Includ does not have Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Includ_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Includ_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Includ_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Includ_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Italian_Colony_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Italian_Colony_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://www.italiancolony.com/");
		logger.info("URL is open");
		logger.info("Italian_Colony has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Italian_Colony_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Italian_Colony_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Italian_Colony_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Italian_Colony_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_Krishnaayurved_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Krishnaayurved_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://krishnaayurved.com/");
		logger.info("URL is open");
		logger.info("Krishnaayurved does not have Kwikpass AP");
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
			logger.info("Verify_Krishnaayurved_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Krishnaayurved_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Krishnaayurved_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Krishnaayurved_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Levis_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Levis_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://levi.in/");
		logger.info("URL is open");
		logger.info("Levis does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(Levis_kwikpass_login_btn));
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
			logger.info("Verify_Levis_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Levis_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Levis_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Levis_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_LotusBotanical_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_LotusBotanical_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.lotusbotanicals.com/");
		logger.info("URL is open");
		logger.info("Lotus Botanicals does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		sleep(3);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_LotusBotanical_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_LotusBotanical_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_LotusBotanical_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_LotusBotanical_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Luxaderme_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Luxaderme_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://luxaderme.in/");
		logger.info("URL is open");
		logger.info("Luxaderme does not have Kwikpass AP");
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
			logger.info("Verify_Luxaderme_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Luxaderme_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Luxaderme_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Luxaderme_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_MiGlow_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_MiGlow_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://miglowstore.in/");
		logger.info("URL is open");
		logger.info("MiGlow has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_MiGlow_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_MiGlow_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_MiGlow_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_MiGlow_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_MyFitness_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_MyFitness_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://myfitness.in/");
		logger.info("URL is open");
		logger.info("MyFitness does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		sleep(3);
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
			logger.info("Verify_MyFitness_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_MyFitness_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_MyFitness_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_MyFitness_KwikPass_login_modal_verification failed");
		}
	}
	
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
		sleep(2);
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
	public void Verify_Nurserylive_Pune_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Nurserylive_Pune_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://pune.nurserylive.com/");
		logger.info("URL is open");
		logger.info("Nurserylive_Pune does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.className(Nurserylive_Pune_kp_icon));
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
			logger.info("Verify_Nurserylive_Pune_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Nurserylive_Pune_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Nurserylive_Pune_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Nurserylive_Pune_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Organic_Bazaar_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Organic_Bazaar_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://organicbazar.net/");
		logger.info("URL is open");
		logger.info("Organic_Bazaar has Kwikpass AP");
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
			logger.info("Verify_Organic_Bazaar_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Organic_Bazaar_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Organic_Bazaar_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Organic_Bazaar_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_Photo_Jewels_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Photo_Jewels KwikPass login modal verification Test case is running.....");
		driver.get("https://photojewels.in/");
		logger.info("URL is open");
		logger.info("Photo_Jewels has Kwikpass AP");
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
			logger.info("Verify_Photo_Jewels_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Photo_Jewels_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Photo_Jewels_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Photo_Jewels_KwikPass_Login_modal_Verfication failed");
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
	public void Verify_Portronics_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Portronics_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.portronics.com/");
		logger.info("URL is open");
		logger.info("Portronics does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(Portronics_iframe);
		WebElement allow = driver.findElement(By.xpath(Portronics_allow));
		WebDriverWait allow_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		allow_wait.until(ExpectedConditions.elementToBeClickable(allow));
		allow.click();
		logger.info("Clicked allow btn");
		driver.switchTo().defaultContent();
		sleep(2);
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
		sleep(3);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobileinputfield = By.id(mobile_input); 
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobileinputfieldpresent = !driver.findElements(mobileinputfield).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobileinputfieldpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal verification passed.");
			logger.info("Verify_Portronics_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Portronics_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Portronics_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Portronics_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Puer_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Puer_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://pueronline.in/");
		logger.info("URL is open");
		logger.info("Puer has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Puer_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Puer_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Puer_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Puer_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Ritualistic_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Ritualistic_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://www.ritualistic.in/");
		logger.info("URL is open");
		logger.info("Ritualistic has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Ritualistic_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Ritualistic_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Ritualistic_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Ritualistic_KwikPass_Login_modal_Verfication failed");
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
	public void Verify_SafariBags_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_SafariBags_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://safaribags.com/");
		logger.info("URL is open");
		logger.info("SafariBags does not have Kwikpass AP");
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
			logger.info("Verify_SafariBags_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_SafariBags_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_SafariBags_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_SafariBags_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Sereko_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Sereko_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://serekoshop.com/");
		logger.info("URL is open");
		logger.info("Sereko has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Sereko_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Sereko_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Sereko_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Sereko_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_Silvertraq_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Silvertraq_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://www.silvertraq.com/");
		logger.info("URL is open");
		logger.info("Silvertraq has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Silvertraq_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Silvertraq_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Silvertraq_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Silvertraq_KwikPass_Login_modal_Verfication failed");
		}
	}
	
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
	public void Verify_TheLoveCO_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_TheLoveCO_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://theloveco.in/");
		logger.info("URL is open");
		logger.info("TheLoveCO has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_TheLoveCO_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_TheLoveCO_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_TheLoveCO_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_TheLoveCO_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_True_Elements_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(True_Elements_kwikpass_icon_bl));
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_True_Elements_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_True_Elements_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_True_Elements_KwikPass_Login_modal_Verfication failed");
		}
	}


	@Test
	public void Verify_Urbangabru_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Urbangabru_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://www.urbangabru.in/");
		logger.info("URL is open");
		logger.info("Urbangabru does not have Kwikpass AP");
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
			logger.info("Verify_Urbangabru_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Urbangabru_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Urbangabru_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Urbangabru_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_Urban_Jungle_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://urbanjungle.shop/");
		logger.info("URL is open");
		logger.info("Urban Jungle has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Urban_Jungle_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Urban_Jungle_KwikPass_Login_modal_Verfication failed");
		}
	}

	@Test
	public void Verify_Weryze_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Weryze_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://weryze.com/");
		logger.info("URL is open");
		logger.info("Weryze does not have Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.id(kwikpass_icon_bl));
		WebDriverWait kp_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		kp_wait.until(ExpectedConditions.elementToBeClickable(kp_login_btn));
		kp_login_btn.click();
		logger.info("Clicked Kwikpass Icon");
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
			logger.info("Verify_Weryze_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Weryze_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Weryze_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Weryze_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Whatsup_Wellness_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://whatsupwellness.in/");
		logger.info("URL is open");
		logger.info("Whatsup_Wellness does not have Kwikpass AP");
		WebElement hamburger = driver.findElement(By.xpath(whatsup_wellness_hamburger));
		WebDriverWait hamburger_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		hamburger_wait.until(ExpectedConditions.elementToBeClickable(hamburger));
		hamburger.click();
		logger.info("Clicked Hamburger");
		WebElement login_btn = driver.findElement(By.id(whatsup_wellness_login_btn));
		WebDriverWait login_btn_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		login_btn_wait.until(ExpectedConditions.elementToBeClickable(login_btn));
		login_btn.click();
		logger.info("Clicked login btn");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By optid = By.id(mobile_input); 
		By whatsapp_id = By.id(whatsappid); 
		boolean optidpresent = !driver.findElements(optid).isEmpty();
		boolean whatsappidpresent = !driver.findElements(whatsapp_id).isEmpty();
		if (optidpresent && whatsappidpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_Whatsup_Wellness_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Whatsup_Wellness_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Whatsup_Wellness_KwikPass_login_modal_verification failed");
		}
	}
	
	@Test
	public void Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://hausandkinder.com/");
		logger.info("URL is open");
		logger.info("Hause_And_Kinder has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Hause_And_Kinder_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_TheHatke_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_TheHatke_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://thehatke.com/");
		logger.info("URL is open");
		logger.info("TheHatke has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(hatke_login_btn));
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_TheHatke_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_TheHatke_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_TheHatke_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_TheHatke_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_Freakins_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Freakins_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://freakins.com/pages/women");
		logger.info("URL is open");
		logger.info("Freakins has Kwikpass AP");
		WebElement kp_login_btn = driver.findElement(By.xpath(hatke_login_btn));
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Freakins_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Freakins_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Freakins_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Freakins_KwikPass_Login_modal_Verfication failed");
		}
	}
	
	@Test
	public void Verify_Yoho_LifeStyle_KwikPass_login_modal_verification() throws IOException, InterruptedException {
		logger.info("Verify_Yoho_LifeStyle_KwikPass_login_modal_verification Test case is running.....");
		driver.get("https://yoholife.in/");
		logger.info("URL is open");
		logger.info("Yoho_LifeStyle does not have Kwikpass AP");
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
			logger.info("Verify_Yoho_LifeStyle_KwikPass_login_modal_verification Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal verification failed.");
			logger.info("Verify_Yoho_LifeStyle_KwikPass_login_modal_verification Test Cases failed!");
			captureScreen(driver, "Verify_Yoho_LifeStyle_KwikPass_login_modal_verification failed");
			Assert.fail("Verify_Yoho_LifeStyle_KwikPass_login_modal_verification failed");
		}
	}

	@Test
	public void Verify_Plum_Goodness_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_Plum_Goodness_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://plumgoodness.com/");
		logger.info("URL is open");
		logger.info("Plum_Goodness has Kwikpass AP");
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
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_Plum_Goodness_KwikPass_Login_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_Plum_Goodness_KwikPass_Login_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_Plum_Goodness_KwikPass_Login_modal_Verfication failed");
			Assert.fail("Verify_Plum_Goodness_KwikPass_Login_modal_Verfication failed");
		}
	}

}
