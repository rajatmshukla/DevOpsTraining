package com.myapp.selenium.browser.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxdemo {

	public static void main (String[] args) {
	System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file://C://newdevopsworkspace//devopsjan2021//java-selenium-driver-demo/src/main/webapp/checkbox.html");
	
	WebElement checkbox = driver.findElement(By.id("pizza"));
	checkbox.click();
}
}