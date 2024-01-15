package com.kwikpass.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public  LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToIframe(String iframeId) {
        WebElement iframeElement = driver.findElement(By.id(iframeId));
        driver.switchTo().frame(iframeElement);
    }
    
    public void switchToNoberoIframe(String iframeId) {
        WebElement iframeElement = driver.findElement(By.id(iframeId));
        driver.switchTo().frame(iframeElement);
    }
    
    public void switchTohokrewardsiframe(String iframeId) {
        WebElement iframeElement = driver.findElement(By.xpath(iframeId));
        driver.switchTo().frame(iframeElement);
    }
    
    public void switchToGokwikIframe(String iframeId) {
        WebElement iframeElement = driver.findElement(By.id(iframeId));
        driver.switchTo().frame(iframeElement);
    }
}
