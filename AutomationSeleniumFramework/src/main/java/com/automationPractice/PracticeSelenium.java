package com.automationPractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PracticeSelenium {
	
	public static void main(String[] args) {
	
		
		  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver ();
		  
		/*
		 * FileInputStream fis = new FileInputStream(filepath); //bytecode
		 * pro.load(fis);
		 * 
		 * System.out.println(pro.getProperty("email"));
		 */
		  
		  driver.navigate().to("http://automationpractice.com/index.php");
		  
		  LoginPage pf = new LoginPage(driver);
		  
		  JavascriptExecutor obj = (JavascriptExecutor)driver;
		  
		  obj.executeScript("arguments[0].style.border='3px solid blue'",
		  driver.findElement(By.xpath("//*[@class ='login']")));
		  
		  pf.getsignINBtn().click();
		  
		 // WebDriverWait wait, new WebDriverWait(driver, 5);
		  
		  // wait.until(ExpectedCondition.elementToBeClickable(pf.getmailInput));
		  
		  obj.executeScript("arguments[0].style.border='3px solid blue'",
				  
		  driver.findElement(By.xpath("//*[@class ='login']")));
		  
		  pf.getemailInputBox().sendKeys("alam.koli@gmail.com");
		  
		  driver.manage().window().maximize();
		  
		  driver.get("http://automationpractice.com/index.php");
		  
		  //driver.navigate().to("http://automationpractice.com/index.php");
		  
		  //JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting
		  
		  obj.executeScript("arguments[0].style.border='3px solid blue'",
				  
		  driver.findElement(By.xpath("//*[@class ='login']")));
		  
		  driver.findElement(By.xpath("//*[@class ='login']")).click();
		 
		
		
	}
}
