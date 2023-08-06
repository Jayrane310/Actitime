package com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasklink;
	
	
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reportslink;
	
	@FindBy(xpath = "//div[.='Users']")
	private WebElement userslink;
	
	@FindBy(id  = "logoutLink")
	private WebElement logoutlink;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
   //declaration
	public WebElement getTasklink() {
		return tasklink;
	}


	public WebElement getReportslink() {
		return reportslink;
	}


	public WebElement getUserslink() {
		return userslink;
	}


	public WebElement getLogoutlink() {
		return logoutlink;
	}
	//bussiness logic 
}
