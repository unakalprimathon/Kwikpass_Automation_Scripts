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

public class TC_TrueElements_Test_Cases extends BaseClass implements Locator{
	
	@Test
	public void Verify_True_Elements_KwikPass_AP_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_KwikPass_AP_modal_Verfication Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
    	lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass Login modal has OTP via SMS and WhatsApp login options.");
			logger.info("Verify_True_Elements_KwikPass_AP_modal_Verfication Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_True_Elements_KwikPass_AP_modal_Verfication Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_KwikPass_AP_modal_Verfication failed");
			Assert.fail("Verify_True_Elements_KwikPass_AP_modal_Verfication failed");
		}
	}
	
	
	@Test
	public void Verify_True_Elements_KwikPass_AP_Visiblity_At_Collection_page() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_Collection_page Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		driver.navigate().to("https://true-elements.com/collections/gift");
		logger.info("Navigated to collections pages");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP is visible.");
			logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_Collection_page Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass AP is not visible.");
			logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_Collection_page Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_KwikPass_AP_Visiblity_At_Collection_page failed");
			Assert.fail("Verify_True_Elements_KwikPass_AP_Visiblity_At_Collection_page failed");
		}
	}

	@Test
	public void Verify_True_Elements_KwikPass_AP_Visiblity_At_Home_page() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_Home_page Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP is visible.");
			logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_Home_page Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass AP is not visible.");
			logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_Home_page Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_KwikPass_AP_Visiblity_At_Home_page failed");
			Assert.fail("Verify_True_Elements_KwikPass_AP_Visiblity_At_Home_page failed");
		}
	}

	@Test
	public void Verify_True_Elements_KwikPass_AP_Visiblity_At_PDP_page() throws IOException, InterruptedException {
		logger.info("True_Elements KwikPass Auto Load Popup visiblity at PDP Page Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		driver.navigate().to("https://true-elements.com/collections/new-launches/products/oats-pro-desi-masala");
		logger.info("Navigated to PDP pages");
		sleep(13);
		LoginPage lp = new LoginPage(driver);
		lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP is visible.");
			logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_PDP_page Test Cases passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("The Kwikpass AP is not visible.");
			logger.info("Verify_True_Elements_KwikPass_AP_Visiblity_At_PDP_page Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_KwikPass_AP_Visiblity_At_PDP_page failed");
			Assert.fail("Verify_True_Elements_KwikPass_AP_Visiblity_At_PDP_page failed");
		}
	}
	
	
	@Test
	public void Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
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
				driver.navigate().to("https://true-elements.com/products/9-in-1-snack-mix");
				logger.info("Navigated to PDP page");
				WebElement addtocart = driver.findElement(By.xpath(trueelements_addtocart));
				WebDriverWait addtocart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				addtocart_wait.until(ExpectedConditions.elementToBeClickable(addtocart));
				addtocart.click();
				logger.info("Clicked Add to cart button");
				sleep(3);
				WebElement viewcart = driver.findElement(By.className(trueelements_viewcart));
				WebDriverWait viewcart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				viewcart_wait.until(ExpectedConditions.elementToBeClickable(viewcart));
				viewcart.click();
				logger.info("Clicked viewcart button");
				sleep(3);
				WebElement placeorder = driver.findElement(By.className(trueelements_placeorder));
				WebDriverWait placeorder_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				placeorder_wait.until(ExpectedConditions.elementToBeClickable(placeorder));
				placeorder.click();
				logger.info("clicked on Place Order button");
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
					logger.info("Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Gokwik login fail");
					logger.info("Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test case failed!");
					captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
					Assert.fail("Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
				}
			} else {
				logger.info("Login Unsuccessful !");
				logger.info("Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen Test Cases failed!");
				captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed !");
				Assert.fail("Verify_True_Elements_Kwikpass_login_from_AP_Done_Gokwik_login_should_happen failed");
			}
		}
	}
	
	@Test
	public void Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
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
			sleep(3);
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
				logger.info("Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Login Unsuccessful !");
				logger.info("Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
				captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS failed !");
				Assert.fail("Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
			Assert.fail("Verify_True_Elements_Kwikpass_login_from_AP_using_OTP_Via_SMS failed");
		}
	}

	
	@Test
	public void Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
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
			driver.navigate().to("https://true-elements.com/products/9-in-1-snack-mix");
			logger.info("Navigated to PDP page");
			WebElement addtocart = driver.findElement(By.xpath(trueelements_addtocart));
			WebDriverWait addtocart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			addtocart_wait.until(ExpectedConditions.elementToBeClickable(addtocart));
			addtocart.click();
			logger.info("Clicked Add to cart button");
			sleep(3);
			WebElement viewcart = driver.findElement(By.className(trueelements_viewcart));
			WebDriverWait viewcart_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			viewcart_wait.until(ExpectedConditions.elementToBeClickable(viewcart));
			viewcart.click();
			logger.info("Clicked viewcart button");
			sleep(3);
			WebElement placeorder = driver.findElement(By.className(trueelements_placeorder));
			WebDriverWait placeorder_wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			placeorder_wait.until(ExpectedConditions.elementToBeClickable(placeorder));
			placeorder.click();
			logger.info("clicked on Place Order button");
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
				logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Gokwik login fail");
				logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test case failed!");
				captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
				Assert.fail("Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed !");
			Assert.fail("Verify_True_Elements_Kwikpass_login_from_Login_Modal_Done_Gokwik_login_should_happen failed");
		}

	}

	

	@Test
	public void Verify_True_Elements_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True Elements has Kwikpass AP");
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
		if (logoutbtnPresent || orderhistorybtnPresent) {
			logger.info("Login Successful !");
			logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Case passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_True_Elements_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed !");
			Assert.fail("Verify_True_Elements_Kwikpass_login_from_Login_Modal_using_OTP_Via_SMS failed");
		}

	}

	@Test
	public void Verify_True_Elements_KwikPass_icon_visibility() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_KwikPass_icon_visibility Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
		WebElement s = driver.findElement(By.id(kwikpass_icon_bl));
		if (s.isDisplayed()) {
			logger.info("Kwikpass icon visible in True Elements");
			logger.info("Verify_True_Elements_KwikPass_icon_visibility test case passed!");
			logger.info("Test Cases Completed !");
		} else {
			logger.info("Kwikpass icon not-visible in True Elements");
			logger.info("Verify_True_Elements_KwikPass_icon_visibility test case failed!");
			captureScreen(driver, "Verify_True_Elements_KwikPass_icon_visibility failed");
			Assert.fail("Verify_True_Elements_KwikPass_icon_visibility failed");
		}

	}

	@Test
	public void Verify_True_Elements_KwikPass_Login_modal_Verfication() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_KwikPass_Login_modal_Verfication Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True_Elements has Kwikpass AP");
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
	public void Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True Elements has Kwikpass AP");
		sleep(13);
    	LoginPage lp = new LoginPage(driver);
    	lp.switchToIframe(kwikpass_iframe);
		logger.info("switched to Kwikpass login modal iframe");
		By mobile_input_field = By.id(mobile_input);   
		By whatsapp_btn = By.id(whatsappid); 
		boolean mobile_input_fieldpresent = !driver.findElements(mobile_input_field).isEmpty();
		boolean whatsapp_btnpresent = !driver.findElements(whatsapp_btn).isEmpty();
		if (mobile_input_fieldpresent && whatsapp_btnpresent) {
			logger.info("The Kwikpass AP modal has OTP via SMS and WhatsApp login options.");
			driver.findElement(By.id(mobile_input)).sendKeys(mobile_number);
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
				driver.findElement(By.xpath(orderhistory_btn)).click();
				sleep(8);
				String curl = driver.getCurrentUrl();
				String vurl = "https://true-elements.com/account";
				if (curl.equals(vurl)) {
					logger.info("Shopify login and session created in TrueElements after Kwikpass login .");
					logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case passed!");
					logger.info("Test Case Completed !");
				} else {
					logger.info("Shopify login and session not created in TrueElements after Kwikpass login .");
					logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Case failed!");
					captureScreen(driver, "Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
					Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
				}
			} else {
				logger.info("Login Unsuccessful !");
				logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Cases failed!");
				captureScreen(driver, "Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed !");
				Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
			}
		} else {
			logger.info("The Kwikpass AP modal doesn't has OTP via SMS or WhatsApp login options.");
			logger.info("True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP Test Cases failed!");
			captureScreen(driver, "True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP");
			Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_AP failed");
		}
	}
	
	@Test
	public void Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal() throws IOException, InterruptedException {
		logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("True Elements has Kwikpass AP");
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
			driver.findElement(By.xpath(orderhistory_btn)).click(); 
			sleep(8);
			String curl = driver.getCurrentUrl();
			String vurl = "https://true-elements.com/account";
			if (curl.equals(vurl)) {
				logger.info("Shopify login and session created in TrueElements after Kwikpass login .");
				logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Shopify login and session not created in TrueElements after Kwikpass login .");
				logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Case failed!");
				captureScreen(driver, "Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
				Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
			}
		} else {
			logger.info("Login Unsuccessful !");
			logger.info("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal Test Cases failed!");
			captureScreen(driver, "Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed !");
			Assert.fail("Verify_True_Elements_Shopify_login_and_session_creation_after_Kwikpass_login_from_Login_Modal failed");
		}

	}

	@Test
	public void Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://true-elements.com/account");
		logger.info("URL is open");
		logger.info("TrueElements does not have Kwikpass AP");
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
			logger.info("Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage Test Cases passed!");
			logger.info("Test Case Completed !");
		} else {
			logger.info("The Kwikpass Login modal doesn'tt has OTP via SMS and WhatsApp login.");
			logger.info("Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage failed");
			Assert.fail("Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage failed");
		}
	}
	
	@Test
	public void Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test case is running.....");
		logger.info("Verify_TrueElements_KwikPass_login_modal_verification_from_accountpage Test case is running.....");
		driver.get("https://true-elements.com/account");
		logger.info("URL is open");
		logger.info("TrueElements does not have Kwikpass AP");
		LoginPage lp = new LoginPage(driver);
		sleep(5);
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
			sleep(8);
			driver.switchTo().defaultContent();
			String curl = driver.getCurrentUrl();
			String vurl = "https://true-elements.com/account";
			if (curl.equals(vurl)) {
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Kwikpass login unsuccessful.");
				logger.info("Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Case failed!");
				captureScreen(driver, "Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
				Assert.fail("Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed !");
			Assert.fail("Verify_TrueElements_Kwikpass_login_using_OTP_Via_SMS_from_accountpage failed");
		}

	}
	
	@Test
	public void Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage() throws IOException, InterruptedException {
		logger.info("Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage Test case is running.....");
		driver.get("https://true-elements.com/");
		logger.info("URL is open");
		logger.info("TrueElements does not have Kwikpass AP");
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
			driver.navigate().to("https://true-elements.com/account");
			logger.info("Switched to default page");
			sleep(10);
			String curl = driver.getCurrentUrl();
			String vurl = "https://true-elements.com/account";
			if (curl.equals(vurl)) {
				logger.info("Kwikpass Login Successful !");
				logger.info("Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage Test Case passed!");
				logger.info("Test Case Completed !");
			} else {
				logger.info("Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage Test Case failed!");
				captureScreen(driver, "Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage failed");
				Assert.fail("Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage Failed");
			}
		} else {
			logger.info("Kwikpass Login Unsuccessful !");
			logger.info("Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage Test Cases failed!");
			captureScreen(driver, "Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage failed !");
			Assert.fail("Verify_TrueElements_Kwikpass_login_Done_Redirect_to_accountpage failed");
		}
	}
	

}
