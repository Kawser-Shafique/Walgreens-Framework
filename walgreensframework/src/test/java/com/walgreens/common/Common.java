package com.walgreens.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

	WebDriver driver;
	 public void browser() {
		 
		 System.setProperty("webdriver.chrome.driver","./Browser/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.jcpenney.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 
	 }
}
