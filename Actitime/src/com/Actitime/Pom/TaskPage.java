package com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustbtn;
	
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custnametf;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptiontf;
	
	@FindBy(xpath = "(//div[.='- Select Customer -'])[2]")
	private WebElement dropdown;
	
	
	@FindBy(xpath = "(//div[.='Our company'])[10]")
	private WebElement companyname;
	
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	

	//initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


    //utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}



	public WebElement getNewcustbtn() {
		return newcustbtn;
	}



	public WebElement getCustnametext() {
		return custnametf;
	}



	public WebElement getDescriptiontext() {
		return descriptiontf;
	}



	public WebElement getDropdown() {
		return dropdown;
	}



	public WebElement getCompanyname() {
		return companyname;
	}



	public WebElement getCreatebtn() {
		return createbtn;
	}
	
	
	//bussiness logic
	public void createcustomer() {
		
		addnewbtn.click();
		newcustbtn.click();
		custnametf.sendKeys("HDFC_001");
		descriptiontf.sendKeys("Banking");
		dropdown.click();
		companyname.click();
		createbtn.click();
		
		
		
		
		
	}
}
