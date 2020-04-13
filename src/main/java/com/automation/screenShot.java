package com.automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.CommonLibraries.commonFunctions;

public class screenShot {
	public static void screenshot() throws InterruptedException, IOException {
		WebDriver driver= commonFunctions.setDriver("https://www.google.com/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Lalitha\\Desktop\\PanduAutomation\\screenshot\\test1.png"));
	}
}
