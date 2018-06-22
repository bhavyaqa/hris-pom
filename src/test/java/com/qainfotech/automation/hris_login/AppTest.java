
package com.qainfotech.automation.hris_login;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends App
{
	WebDriver driver = App.driverObj();
	
	@BeforeClass
	public void launchBrowserAndLoginHris() {
		driver.get("https://hris.qainfotech.com/login.php");
		App.loginHris(driver);
	}

	@Test
	public void login_form_should_not_be_present() {
		Assert.assertFalse(isLoginFormPresent(driver));
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
