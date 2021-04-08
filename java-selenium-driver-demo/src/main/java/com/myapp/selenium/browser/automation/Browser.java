package com.myapp.selenium.browser.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	static {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	}
	static WebDriver driver=new ChromeDriver();
	public static void goTo(String url) {
		driver.get(url);
	}
	public static String title() {
		return driver.getTitle();
	}
	public static void close() {
		driver.close();
		
	}
}