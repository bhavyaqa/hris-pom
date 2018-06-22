package com.qainfotech.automation.hris_login;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static WebDriver driverObj() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhavyakhanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	return driver;
    }
    
    public static boolean isLoginFormPresent(WebDriver driver) {
    	try {
    	 driver.findElement(By.name("loginForm"));
    	}
    	catch(NoSuchElementException e) {
    		return false; 
    	}
		return true;
    }
 
    public static void loginHris(WebDriver driver) {
    	driver.findElement(By.id("txtUserName")).sendKeys("bhavyakhanna");
    	driver.findElement(By.id("txtPassword")).sendKeys("Bhavya@321#");
    	driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[2]/div/input")).click();
    }
}
