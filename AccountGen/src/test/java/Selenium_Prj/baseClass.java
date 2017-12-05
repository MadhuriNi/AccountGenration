package Selenium_Prj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClass {
	
	WebDriver driver;

	public WebDriver initializeDriver() throws Exception {
		
		File src = new File(".//Configuration//Config.property");
		FileInputStream fis = new FileInputStream(src);
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String Browser=prop.getProperty("Browser");
		
		if(Browser.equalsIgnoreCase("firefox"))
		{			
			System.setProperty(prop.getProperty("FirefoxDriverPath"), prop.getProperty("FirefoxDriver"));
			driver=new FirefoxDriver();
		}
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("ChromeDriverPath"), prop.getProperty("ChromeDriver"));
			driver=new ChromeDriver();
		}
		
		driver.get(prop.getProperty("URL"));
		
		return driver;
		
	}
}
