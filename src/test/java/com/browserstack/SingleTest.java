package com.browserstack;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
		
		//click on getStarted button
      AndroidElement getStarted = (AndroidElement) new WebDriverWait(dr, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.AndroidUIAutomator("new UiSelector().index(0)")));
      //AndroidElement getStarted = (AndroidElement) new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable()
      getStarted.click();
	  
	  //Provide newbalance
     // AndroidElement newBalance = (AndroidElement) new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.EditText")));
		//  newBalance.sendKeys("200");
		  //click on next
	 //AndroidElement nextbutton = (AndroidElement) new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));
		//  nextbutton.click();
		  
		  //click on next
		 //AndroidElement nextbutton2 = (AndroidElement) new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(MobileBy.className("android.widget.TextView")));
		  //nextbutton2.click();
      
      Thread.sleep(5000);

     // List<AndroidElement> allProductsName = driver.findElementsByClassName("android.widget.TextView");
      //Assert.assertTrue(allProductsName.size() > 0);
    }
}
