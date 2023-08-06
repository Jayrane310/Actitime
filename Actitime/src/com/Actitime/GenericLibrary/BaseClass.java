package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.Pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	FileLibrary f=new FileLibrary();
	
	public static WebDriver driver;
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database is connected",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database disconnected",true);
	}
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Url = f.readdatafromproperty("url");
		driver.get(Url);
		Reporter.log("browser is launched");
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		Reporter.log("browser is closed");
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String UN = f.readdatafromproperty("username");
		String PW = f.readdatafromproperty("password");
        LoginPage lp=new LoginPage(driver);
        lp.logintoActitime(UN, PW);
        Reporter.log("Logged in succesfully"); 
		
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logged out succesfully"); 
	}
}
