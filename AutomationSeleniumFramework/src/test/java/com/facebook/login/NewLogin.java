package com.facebook.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLogin {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
	}
	
	

}
