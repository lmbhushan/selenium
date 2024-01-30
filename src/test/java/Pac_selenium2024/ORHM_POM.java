package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ORHM_POM {
	WebDriver driver;
	
	
	By email= By.name("email");
	By pword = By.name("password");
	By loginbutton = By.tagName("button");
	
	public ORHM_POM(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public void enteremail(String email1)
	{
		driver.findElement(email).sendKeys(email1);
	}
	public void enterpassword(String password1)
	{
		driver.findElement(pword).sendKeys(password1);
	}
	
	public void clickonlogin()
	{
		driver.findElement(loginbutton).click();
	}
}