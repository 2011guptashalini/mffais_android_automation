package com.browserstack.suite;

import io.appium.java_client.android.AndroidElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.browserstack.BrowserStackTestNGTest;

public class AppKeyWords extends BrowserStackTestNGTest {
	SoftAssert softAssertion = new SoftAssert();
	
public void addMultipleBill(String addAccountBal, String addBillAmount1, String addBillAmount2,String addBillAmount3) throws Exception {
        
    	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(15000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
        Thread.sleep(15000); 
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
        Thread.sleep(5000);
        
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
        Thread.sleep(5000);
        if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").isDisplayed())
        {
      	  dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      	  Thread.sleep(5000);
        }
        else{
      	  dr.hideKeyboard();
      	  Thread.sleep(5000);
        }
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
        Thread.sleep(15000); 
        //dr.hideKeyboard();
        if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").isDisplayed())
        {
      	  dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      	  Thread.sleep(5000);
        }
        else{
      	  dr.hideKeyboard();
      	  Thread.sleep(5000);
        }
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
       
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
                 //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("aaa");
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addBillAmount1);

        //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
        Thread.sleep(5000);
       // dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(5000);
      // Adding another bill
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
                 //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("bbb");
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addBillAmount2);

        //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
        Thread.sleep(5000);
       // dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(5000);
        
        // adding third bill
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
                 //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("ccc");
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addBillAmount3);

        //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
        Thread.sleep(5000);
       // dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(5000);

        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        
        Thread.sleep(5000);
        float temp1 = Float.parseFloat(addAccountBal);
        float temp2 = Float.parseFloat(addBillAmount1);
        float temp3 = Float.parseFloat(addBillAmount2);
        float temp4 = Float.parseFloat(addBillAmount3);
        float totalBillAmount = temp2 + temp3 + temp4;
        float expectedAvlBal= temp1 -totalBillAmount;
        Thread.sleep(5000);
        String actualavlBal =  dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]").getText();
        String newString = actualavlBal.substring(1);
        float actualBalfl = Float.parseFloat(newString);
        softAssertion.assertEquals((int)actualBalfl, (int)expectedAvlBal);
        softAssertion.assertAll();
        
    
	}
	
	public void addBill(String addAccountBal, String addBillAmount) throws Exception {
        
    	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(15000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
        Thread.sleep(15000); 
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
        Thread.sleep(5000);
        
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
        Thread.sleep(5000);
        if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").isDisplayed())
        {
      	  dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      	  Thread.sleep(5000);
        }
        else{
      	  dr.hideKeyboard();
      	  Thread.sleep(5000);
        }
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
        Thread.sleep(15000); 
        //dr.hideKeyboard();
        if(dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").isDisplayed())
        {
      	  dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
      	  Thread.sleep(5000);
        }
        else{
      	  dr.hideKeyboard();
      	  Thread.sleep(5000);
        }
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
       
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
                 //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("aaa");
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addBillAmount);

        //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
        Thread.sleep(5000);
       // dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(5000);
      

        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
        float temp1 = Float.parseFloat(addAccountBal);
        float temp2 = Float.parseFloat(addBillAmount);
        float expectedAvlBal= temp1 -temp2;
        Thread.sleep(5000);
        String actualavlBal =  dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]").getText();
        String newString = actualavlBal.substring(1);
        float actualBalfl = Float.parseFloat(newString);
        softAssertion.assertEquals((int)actualBalfl, (int)expectedAvlBal);
        softAssertion.assertAll();
        
    
	}
	public void addABillAndAPay(String addAccountBal, String addBillAmount, String addaPay) throws InterruptedException{
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
        Thread.sleep(15000); 
        //Thread.sleep(15000); 
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
        Thread.sleep(5000);
        ////dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        //Thread.sleep(5000);
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Bill\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();              
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("aaa");
        ////dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addBillAmount);
        //dr.hideKeyboard();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
        Thread.sleep(5000);
        Thread.sleep(5000);

        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add a Pay\")").click();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter name\")").click();              
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter name\")").sendKeys("Employee");
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addaPay);
        
        //dr.hideKeyboard();
        Thread.sleep(5000);
       
        
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click(); 
        float temp1 = Float.parseFloat(addAccountBal);
        float temp2 = Float.parseFloat(addBillAmount);
        float temp3 = Float.parseFloat(addaPay);
        float expectedAvlBal = (temp1+temp3)-temp2;
        Thread.sleep(5000);
        String actualavlBal =  dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]").getText();
        String newString = actualavlBal.substring(1);
        float actualBalfl = Float.parseFloat(newString);
        softAssertion.assertEquals((int)actualBalfl, (int)expectedAvlBal);
        softAssertion.assertAll();
	}
	
	public void addPayRecurrent(String addAccountBal, String addPay) throws InterruptedException{
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
        Thread.sleep(15000); 
        //Thread.sleep(15000); 
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
        Thread.sleep(5000);
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        //Thread.sleep(5000);
        Thread.sleep(15000); 
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Skip\")").click();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add a Pay\")").click();
        Thread.sleep(5000);
        dr.findElement(By.xpath("//*[@class='android.widget.ImageView' and @index='1']")).click();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter name\")").click();              
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter name\")").sendKeys("Employee");
        ////dr.hideKeyboard();
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
        //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
        //dr.hideKeyboard();
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addPay);
        Thread.sleep(5000);
        //dr.hideKeyboard();
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click(); 
        
        float temp1 = Float.parseFloat(addAccountBal);
        float temp2 = Float.parseFloat(addPay);
        float expectedAvlBal= temp1 + temp2;
        Thread.sleep(5000);
        String actualavlBal =  dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.TextView[2]").getText();
        String newString = actualavlBal.substring(1);
        float actualBalfl = Float.parseFloat(newString);
        softAssertion.assertEquals((int)actualBalfl, (int)expectedAvlBal);
        Thread.sleep(5000);
        dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"FORECAST\")").click(); 
        Thread.sleep(5000);
        Boolean entry = dr.findElementByAndroidUIAutomator("UiSelector().text(\"Employee\")").isDisplayed();
        softAssertion.assertTrue(entry,"There is no entry for recurring pay");
        System.out.println("There are entries for recurring pay");
        softAssertion.assertAll();
	}
	
public void addGoal(String addAccountBal, String addGoalAmount,String payGoal) throws InterruptedException{
	dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Get Started\")").click();
    Thread.sleep(15000); 
   // Thread.sleep(15000); 
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter Name\")").sendKeys("testtest");
    Thread.sleep(5000);
    //dr.hideKeyboard();
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.EditText\")").sendKeys(addAccountBal);
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    //Thread.sleep(5000);
    Thread.sleep(15000); 
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Next\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Skip\")").click();
    Thread.sleep(5000);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"GOALS\")").click();
             //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add Goal\")").click();
    Thread.sleep(5000);
    //dr.hideKeyboard();
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").click();
    //dr.findElementByAndroidUIAutomator("UiSelector().index(3)").sendKeys("aaa");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter payee name\")").sendKeys("testgoal");

    //dr.findElementByAndroidUIAutomator("UiSelector().index(5)").sendKeys("19.6");
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(addGoalAmount);
    
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Add\")").click();
    
    
     
    //String targetbal = dr.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='2']")).getText();
    //System.out.println(remainbal);
   
    //String expectedtargetbal="$500.00";
    //System.out.println(exprtargetbal);
    dr.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.support.v4.view.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.ImageView").click();
  //  List<AndroidElement> ae= dr.findElements(By.xpath("//*[@class='android.widget.ImageView']"));
    Thread.sleep(5000);
    //ae.get(2).click();
    //Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").click();
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Enter amount\")").sendKeys(payGoal);
    Thread.sleep(5000);
    dr.findElementByAndroidUIAutomator("UiSelector().textMatches(\"Save\")").click();
    
    String remainbal1 = dr.findElement(By.xpath("//*[@class='android.widget.TextView' and @index='4']")).getText();
    float temp1 = Float.parseFloat(addAccountBal);
    float temp2 = Float.parseFloat(addGoalAmount);
    float temp3 = Float.parseFloat(payGoal);
    
    float expRemainingGoal = temp2-temp3;
   
    String newString = remainbal1.substring(1);
    float actualRemainingBal = Float.parseFloat(newString);
    softAssertion.assertEquals(actualRemainingBal, expRemainingGoal);
    softAssertion.assertAll();
    
    //target
     
    
      }
	}

