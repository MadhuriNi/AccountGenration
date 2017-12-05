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

public class addAccount {
	
	WebDriver driver;
	
	public addAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void add()
	{
		By add_acc=By.id("new_act_info");

		Wait<WebDriver> wait=new FluentWait(driver)
				 .withTimeout(60,TimeUnit.SECONDS)
				 .pollingEvery(1,TimeUnit.SECONDS)
				 .ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	        public WebElement apply(WebDriver driver) {
	        	return driver.findElement(By.id("new_act_info"));
	        }
		}
		);
		
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("sleeeeeeep"+e);
		}
				
			System.out.println("Add Account is displayed");
					
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(add_acc)).click().perform();
			
			System.out.println("Add Account is clicked");
			
	
	}
	
	}
	


