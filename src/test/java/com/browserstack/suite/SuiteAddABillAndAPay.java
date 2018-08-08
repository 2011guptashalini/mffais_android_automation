package com.browserstack.suite;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.browserstack.BrowserStackTestNGTest;
import com.browserstack.suite.AppKeyWords;

public class SuiteAddABillAndAPay extends AppKeyWords {
	
 
    @Test
    public void test_01() throws Exception {
    	        
    	addABillAndAPay("200","19.7","32.9"); //Provide account bal, bill amount and pay
   
}
}
	