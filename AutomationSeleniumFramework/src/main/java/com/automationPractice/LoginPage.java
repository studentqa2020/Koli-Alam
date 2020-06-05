package com.automationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	  LoginPage(WebDriver driver){ PageFactory.initElements(driver, this);
	  
	  }
	  
	  @FindBy(xpath = "//*[@class = 'login']") private WebElement signINBtn;
	  
	  public WebElement getsignINBtn() {
	  
	  return signINBtn;
	  
	  }
	  
	  @FindBy(xpath = "//*[@id = 'email']") private WebElement emailInputBox;
	  private Object getmailInput;
	  
	  public WebElement getemailInputBox(){
	  
	  return emailInputBox;
	  
	  }

	public WebElement getSignINBtn() {
		return signINBtn;
	}

	public void setSignINBtn(WebElement signINBtn) {
		this.signINBtn = signINBtn;
	}

	public WebElement getEmailInputBox() {
		return emailInputBox;
	}

	public void setEmailInputBox(WebElement emailInputBox) {
		this.emailInputBox = emailInputBox;
	}

	public Object getGetmailInput() {
		return getmailInput;
	}

	public void setGetmailInput(Object getmailInput) {
		this.getmailInput = getmailInput;
	}

}
