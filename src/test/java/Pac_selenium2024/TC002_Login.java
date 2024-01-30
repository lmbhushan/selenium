package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver();
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.opencart.com/");
     driver.findElement(By.linkText("My Account")).click();
     driver.findElement(By.linkText("Login")).click();
//   driver.findElement(By.id("input-email")).click();
//   driver.findElement(By.id("input-password")).sendKeys("rahul");     driver.findElement(By.tagName("button")).click();
     Actions act=new Actions(driver);
		act.sendKeys("fati@yahoo.com");
		act.sendKeys(Keys.TAB);
		act.sendKeys("welcome");
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER);
		
		act.perform();

	}

}
