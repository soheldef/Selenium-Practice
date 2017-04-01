/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Sohel
 *
 */
public class LoginPage {
	WebDriver driver;
	 
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginButton=By.name("wp-submit");
	 
	 
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}
	 
 
	public void typeusername()
	{
	 
	driver.findElement(username).sendKeys("admin");
	}
	 
	public void typepassword()
	{
	 
	driver.findElement(password).sendKeys("demo123");
	}
	 
	public void clickonloginbutton()
	{
	driver.findElement(loginButton).click();
	}

}
