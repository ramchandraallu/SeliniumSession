package com.automation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.CommonLibraries.commonFunctions;

public class Actionclas {

	public static void ActionTest() throws InterruptedException {
		WebDriver driver= commonFunctions.setDriver("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@text='SpiceMax ']")).click();
		commonFunctions.clcikElement(driver, driver.findElement(By.linkText("Hot Meals")), 20);
		//driver.findElement(By.linkText("Hot Meals")).click();
		System.out.println("Action lert");
		List<WebElement> ele =driver.findElements(By.tagName("a"));
		System.out.println(ele.size());
		
		
				//new ArrayList<WebElement>(); 
			 //ele = 	driver.findElement(By.xpath("//a"));
	}
	
}
