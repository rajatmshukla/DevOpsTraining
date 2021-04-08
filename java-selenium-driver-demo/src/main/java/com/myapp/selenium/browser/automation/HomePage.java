package com.myapp.selenium.browser.automation;

public class HomePage {
	static String url = "https://www.ibm.com/in-en";
	static String title = "IBM - India";

	public void goTo() {
		Browser.goTo(url);

	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}
}