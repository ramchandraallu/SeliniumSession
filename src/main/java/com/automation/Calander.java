package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.Alert;
import com.CommonLibraries.commonFunctions;
enum monthf {
	  january,
	 february,
	  march
	}


public class Calander {

	
	public static void selectDate() throws InterruptedException, ParseException {
		int year = 2021;
		String Expectedmoth= "June";
		WebDriver driver= commonFunctions.setDriver("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		//Alert alerttest =driver.switchTo().alert();
		//alerttest.accept();
		driver.findElement(By.xpath("//button[@class='btn btn-primary' and @type='submit'][1]")).click();
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c12-5 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']")).click();
		
		String data = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println("date"+data); 
		int Actualdate =Integer.parseInt(data.substring(data.length()-4));
		if (year>Actualdate) {
			clickuntilexpected(driver,"//a[@class='ui-datepicker-next ui-corner-all']",year);
		}
		else {
			clickuntilexpected(driver,"//a[@class='ui-datepicker-prev ui-corner-all']",year);
		}
		
		int expetedMothnumber=mothnumber(Expectedmoth);
		int actualMonthNumber=mothnumber(data.substring(0,data.length()-4));
		if(expetedMothnumber>actualMonthNumber) {
			ClickMoth(driver,"//a[@class='ui-datepicker-next ui-corner-all']",Expectedmoth);
		}else {
			ClickMoth(driver,"//a[@class='ui-datepicker-prev ui-corner-all']",Expectedmoth);
		}
		
	}
	
	public static void clickuntilexpected(WebDriver driver, String xpath,int ExpectedValue ) {
		String data = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
				int Actualdate =Integer.parseInt(data.substring(data.length()-4));
		while(!(Actualdate==ExpectedValue)){
			
			driver.findElement(By.xpath(xpath)).click();
			 data = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 Actualdate =Integer.parseInt(data.substring(data.length()-4));
		}
	}
	
	public static void ClickMoth(WebDriver driver,String xpath,String motnh){
		String data = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().toUpperCase();
		while(!data.contains(motnh.toUpperCase())) {
			driver.findElement(By.xpath(xpath)).click();
			 data = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().toUpperCase();
		}
		
	}
	
	public static int mothnumber(String motnh) throws ParseException {
			
		Date date = new SimpleDateFormat("MMMM").parse(motnh);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//Month.valueOf(monthName.toUpperCase()).getValue();
	//}
		return cal.get(Calendar.MONTH);
		
	}
	
	public static void newWaytoSelectDat(String date) throws InterruptedException {
		WebDriver driver= commonFunctions.setDriver("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		//Alert alerttest =driver.switchTo().alert();
		//alerttest.accept();
		driver.findElement(By.xpath("//button[@class='btn btn-primary' and @type='submit'][1]")).click();
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+date+"');", driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")));
		System.out.println("completed");
	}
}
