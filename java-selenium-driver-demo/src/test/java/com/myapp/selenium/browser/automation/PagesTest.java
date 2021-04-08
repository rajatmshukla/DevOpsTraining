package com.myapp.selenium.browser.automation;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;

public class PagesTest {
	
	@Test
	public void canGoToHomePage() {
		Pages.homePage().goTo();
	assertTrue(Pages.homePage().isAt());
	
	}
	
	@AfterAll
	public static void cleanUp() {
		Browser.close();
	}
}
