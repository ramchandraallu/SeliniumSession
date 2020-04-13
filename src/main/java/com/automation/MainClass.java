package com.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.CommonLibraries.commonFunctions;

public class MainClass {
	 
	public static void main(String[] args) throws InterruptedException, IOException, ParseException {
		// TODO Auto-generated method stub
		//commonFunctions commanfunc = new commonFunctions();
        //To open browser
			//driver =commanfunc.setDriver("https://www.facebook.com/");
			//OpenBrowser.openChromeBrowser();
		//Alert
			//HandlingAlert handle= new HandlingAlert();
			//handle.windowAlert();
		//Action
			//Actionclas act = new Actionclas();
			//act.ActionTest();
		//ScreenShot
			//screenShot sc= new screenShot();
			//sc.screenshot();
		//WindowPopup
			//windowPopup window = new windowPopup();
			//window.popup();
		//javascript highligter
			//JavascripObjectHighLight jb= new JavascripObjectHighLight();
			//jb.hihglight();
		//google search
			//googleSUggestions gd = new googleSUggestions();
			//gd.suggestion();
		//calende
			System.out.println("etets");
			Calander c=new Calander();
			c.selectDate();
			//c.newWaytoSelectDat("02-06-2020");
		//sikuli flash automation 
			//SikuliAutomation s= new SikuliAutomation();
			//s.sikuliTest();
			
		
	}

}
