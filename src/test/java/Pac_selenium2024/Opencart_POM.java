package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Opencart_POM {
	
	WebDriver driver;
	//By ltext=By.linkText("My Account");
	//By l1text=By.linkText("Login");
	//By mail=By.name("email");
	//By pword=By.name("password");
	//By logbutton=By.tagName("button");
	By l2text=By.linkText("Desktops");
	By l3text=By.linkText("Mac (1)");
	By id1=By.id("input-sort");
	By l4text=By.linkText("iMac");
	By id2=By.id("button-car");
	
	
	public Opencart_POM(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
//	public void entertext(String linktext)
//	{
//		driver.findElement(ltext).sendKeys(linktext);
//	}
//	public void entertext1(String linktext1)
//	{
//		driver.findElement(l1text).sendKeys(linktext1);
//	}
//	public void entermail(String email)
//	{
//		driver.findElement(mail).sendKeys(email);
//	}
//	public void enterpassword(String password)
//	{
//		driver.findElement(pword).sendKeys(password);
//	}
//	public void logbutton()
//	{
//		driver.findElement(logbutton).click();
//	}
	public void entertext2(String linktext2)
	{
		driver.findElement(l2text).sendKeys(linktext2);
	}
	public void entertext3(String linktext3)
	{
		driver.findElement(l3text).sendKeys(linktext3);
	}
	public void enterid(String Id)
	{
		driver.findElement(id1).sendKeys(Id);
	}
	public void entertext4(String linktext4)
	{
		driver.findElement(l4text).sendKeys(linktext4);
	}
	public void enterid1(String Id1)
	{
		driver.findElement(id2).sendKeys(Id1);
	}
	
}
