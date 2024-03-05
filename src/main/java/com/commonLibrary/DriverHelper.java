package com.commonLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverHelper {

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
