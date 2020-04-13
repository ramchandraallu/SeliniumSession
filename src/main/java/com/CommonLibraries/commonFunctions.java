package com.CommonLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonFunctions {

public static WebDriver driver;
public static  WebDriver setDriver(String url) throws InterruptedException {
	
	System.out.println( "Set driver for chromedriver" );
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Lalitha\\Desktop\\PanduAutomation\\chromedriver.exe");
    driver = new ChromeDriver();
    System.out.println("open url");
    driver.get(url);
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    System.out.println("title"+driver.getTitle());
    //driver.navigate().refresh();
    System.out.println("Opened Url");
    //Thread.sleep(3000);
	return driver;
}
public static void clcikElement(WebDriver driver,WebElement locater,int timeout ) {
	Date date = new Date();
	System.out.println("waititme "+date.getTime());
	new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locater));
	System.out.println("waititme2 "+date.getTime());
	locater.click();
	System.out.println("clicked" );
}
public static  void envvariablles() throws FileNotFoundException, IOException {
	Properties prop	=new Properties();
	prop.load(new FileInputStream("C:\\Users\\Lalitha\\eclipse-workspace\\SeliniumSessions\\src\\main\\java\\environmnet.properties"));
	System.out.println(prop.getProperty("name"));
		
}

}
