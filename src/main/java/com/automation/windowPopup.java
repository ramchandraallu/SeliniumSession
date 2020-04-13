package com.automation;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Handler;

import org.openqa.selenium.WebDriver;

import com.CommonLibraries.commonFunctions;

public class windowPopup {

public static void popup() throws InterruptedException{	
	//http://www.popuptest.com/popuptest1.html
	WebDriver driver= commonFunctions.setDriver("http://www.popuptest.com/popuptest1.html");
	Set<String>windoes= driver.getWindowHandles();
	System.out.println(windoes.size());
	Iterator it =windoes.iterator();
	String parent=driver.getWindowHandle();
	System.out.println("windows"+it);
	//System.out.println("Parent"+parent);
	//for (ele:windoes.iterator()) {
	Thread.sleep(5000);
	while(it.hasNext()) {
	System.out.println("Window name "+it.next());
	driver.switchTo().window(it.next().toString());
	driver.manage().window().maximize();
	driver.close();
	driver.switchTo().window(parent);
	}
}
}
