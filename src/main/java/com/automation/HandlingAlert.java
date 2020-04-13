package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CommonLibraries.commonFunctions;

public class  HandlingAlert {
	
	


public static void AlertTest() throws InterruptedException {
	
WebDriver driver= commonFunctions.setDriver("https://mail.rediff.com/cgi-bin/login.cgi");
	

	driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println("Test lert");
	Alert alerttest =driver.switchTo().alert();
	System.out.println(alerttest.getText());
	alerttest.accept();
}
public static void windowAlert() throws InterruptedException {
WebDriver driver= commonFunctions.setDriver("https://html.com/input-type-file/");
	
	driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Lalitha\\Desktop\\test.txt");
	System.out.println("Test lert");
	
}

}