package org.test.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class A {

	public static void main(String[] args) {
		
	// to set the property for drivers
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\NAZEEM\\practise1\\Seleniumfristday\\Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver ();
		driver.get("http://azhar-paperpresentation.blogspot.com/2010/04/palm-vein-technology.html");
		
		driver.quit();
		//chnage
		
		
	}
}
