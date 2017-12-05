package Selenium_Prj;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.addAccount;
import Pages.loginPage;

public class mainClass extends baseClass{
	
	@Test
	public void baseNavigation() throws Exception
	{
		
		driver=initializeDriver();
		
		driver.manage().window().maximize();
		
		loginPage lp=new loginPage(driver);
		lp.login("918222","918222");
		
		addAccount ac=new addAccount(driver);
		ac.add();
		
		
	}

}
