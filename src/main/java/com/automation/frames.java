package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CommonLibraries.commonFunctions;

public class frames {
	public static void frametest() throws InterruptedException {
		WebDriver driver= commonFunctions.setDriver("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Lalitha\\Desktop\\test.txt");
		System.out.println("Test lert");
		driver.switchTo().frame(0);
		
		
	}

}
