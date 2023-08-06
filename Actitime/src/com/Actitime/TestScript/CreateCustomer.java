
package com.Actitime.TestScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.GenericLibrary.ListenerImplementation;
import com.Actitime.Pom.HomePage;
import com.Actitime.Pom.TaskPage;

@Listeners(ListenerImplementation.class)
public class CreateCustomer extends BaseClass{
	
	@Test
	public void createCustomer() throws IOException {
	HomePage hp=new HomePage(driver);
	hp.getTasklink().click();

	TaskPage tp=new TaskPage(driver);
	tp.getAddnewbtn().click();
	tp.getNewcustbtn().click();
	
	FileLibrary f1=new FileLibrary();
	String customer = f1.readdataexcel("Data", 2, 1);
	tp.getCustnametext().sendKeys(customer);
	
	String description = f1.readdataexcel("Data", 3, 2);
	tp.getDescriptiontext().sendKeys(description);
	tp.getCreatebtn();
	
	String expectedresult = customer;
	String actualresult = driver.findElement(By.xpath("(//div[.='"+customer+"'])[2]")).getText();
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualresult, expectedresult);
	
	


		
	}
}
