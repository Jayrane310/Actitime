package com.Actitime.TestScript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.Pom.HomePage;
import com.Actitime.Pom.TaskPage;

public class DeleteCustomer extends BaseClass{
      @Test
      public void deleteCustomer() {
    	HomePage hp=new HomePage(driver);
    	hp.getTasklink().click();

    	TaskPage tp=new TaskPage(driver);
    	tp.getAddnewbtn().click();
    	tp.getNewcustbtn().click();
    	
    	driver.findElement(By.id("container_tasks"));
      }
      
}
