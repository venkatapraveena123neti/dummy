package com.cg.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

	public static WebDriver driverInitialize(String driverName) {
		WebDriver driver = null;
		if ("chrome".equals(driverName)) {
			System.setProperty("webdriver.chrome.driver", "Drivers//chromeDriver.exe");
			driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 /* not to be written here should be written in test case*/
			

		} else if ("firefox".equals(driverName)) {
			System.setProperty("webdriver.firefox.driver", "firefoxDriver.exe");
			driver = new FirefoxDriver();

		} else if ("ie".equals(driverName)) {
			System.setProperty("webdriver.ie.driver", "ieDriver.exe");
			driver = new FirefoxDriver();

		}
		return driver;
	}
}
