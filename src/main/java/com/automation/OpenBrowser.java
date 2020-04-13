package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.CommonLibraries.commonFunctions;

/**
 * Hello world!
 *
 */

public class OpenBrowser 

{

    public static void openChromeBrowser() throws InterruptedException
    {
    	commonFunctions commanfunc = new commonFunctions();
    	 WebDriver driver =commanfunc.setDriver("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test12");
        WebElement element = driver.findElement(By.xpath("//Select[@name='birthday_month']"));
        try{
        Select select = new Select(element);
        select.selectByVisibleText("Jul");
        //select.selectByIndex(7);
        }catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        driver.close();
        driver.quit();
        System.out.println("close browser");
    }
    
    
}
