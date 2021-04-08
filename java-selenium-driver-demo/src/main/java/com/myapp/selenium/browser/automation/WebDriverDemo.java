package com.myapp.selenium.browser.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),DesiredCapabilities.chrome());
		
		driver.get("http://www.google.com");
		
		WebElement searchField=driver.findElement(By.name("q"));
		searchField.sendKeys(("ibm"));
		searchField.submit();
		WebElement imagesLink=driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		WebElement imagesElement=driver.findElements(By.cssSelector("a[class=rg_i]")).get(0);
		WebElement imageLink=imagesElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
		
	}

}

