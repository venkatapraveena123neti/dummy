package com.capg.modulethree.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {
	public DriverUtil() {
		
		
	}

	private static WebDriver drivers;

	public static WebDriver driverInitializer(String driverName) {
		if(driverName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		drivers = new ChromeDriver();
		}
		else if(driverName.equals("firefox"))
		{
		System.setProperty("webdriver.firefox.driver", "Driver//firefox.exe");
		drivers = new FirefoxDriver();
		}
		else if(driverName.equals("Internet Explorer"))
		{
			System.setProperty("webdriver.ie.driver", "Driver//IEDriverServer.exe.exe");
			drivers = new InternetExplorerDriver();
		}
		return drivers;

	}

	public static void driverClose(WebDriver driver) {
		driver.quit();
	}

}