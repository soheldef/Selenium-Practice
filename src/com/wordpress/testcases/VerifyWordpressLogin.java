/**
 * 
 */
package com.wordpress.testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;


/**
 * @author Sohel
 *
 */
public class VerifyWordpressLogin {
	
	@Test
	public void VerifyValidLogin(){
		
		/*
		 * Below line requires only for chrome. Not required for firefox 
		 */
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\eclipse\\ChromeDriver\\ChromeDriver.exe");
		
		/*
		 * Below 3 lines will go into all testcase
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
	
		LoginPage Login = new LoginPage(driver);
		
		Login.typeusername();
		Login.typepassword();
		Login.clickonloginbutton();

		driver.quit();
		
	}

}
