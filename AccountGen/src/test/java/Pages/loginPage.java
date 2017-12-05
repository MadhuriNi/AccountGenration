package Pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class loginPage {

	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login(String uid,String pass)
	{
		By id=By.id("login");
		By pwd=By.name("password");
		By submit=By.xpath(".//*[@id='submit']");
		
		driver.findElement(id).sendKeys(uid);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(submit).click();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MINUTES);
		
	//	WebDriverWait wait=new WebDriverWait(driver, 100);
	//	WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(".//*[@id='search_input']"))));
		
		
	}
}
