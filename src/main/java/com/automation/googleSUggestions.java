package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CommonLibraries.commonFunctions;

public class googleSUggestions {
	public void suggestion() throws InterruptedException {
		WebDriver driver= commonFunctions.setDriver("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("test");
		Thread.sleep(5000);
		List<WebElement>ele=driver.findElements(By.xpath("//li[@role='presentation']//span"));
		System.out.println(ele.size());
		
		for (int i =1;i<ele.size();i++) {
			System.out.println(ele.get(i).getText());
			if (ele.get(i).getText().equalsIgnoreCase("testng")) {
				ele.get(i).click();
				break;
			}
		}
	}
}
