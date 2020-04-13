package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.CommonLibraries.commonFunctions;

public class JavascripObjectHighLight {
	public static void hihglight() throws InterruptedException{
		WebDriver driver= commonFunctions.setDriver("http://www.facebook.com");
		JavascriptExecutor js =  (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.findElement(By.xpath("//input[@name='firstname']")));
		System.out.println("sds");
		//js.executeScript("arguments[0].style.backgroundcolor ="+"'rgb(0,200,0)'", driver.findElement(By.xpath("//input[@name='firstname']")));
		System.out.println("highlighted");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test");
		//button[.='Sign Up'][1]
		js.executeAsyncScript("arguments[0].click()", driver.findElement(By.xpath("//button[.='Sign Up'][1]")));
		if (driver.findElement(By.xpath("//input[@name='firstname']")).isDisplayed()) {
			System.out.println(driver.findElement(By.xpath("//input[@name='firstname']")).isEnabled()+"test"
					+driver.findElement(By.xpath("//input[@name='firstname']")).isSelected());
		}
		//js.executeScript("alert('test alert')");
	}
}
