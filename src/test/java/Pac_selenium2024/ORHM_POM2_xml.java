package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ORHM_POM2_xml {
	WebDriver driver;
  By uname=By.name("username");
  By pword=By.name("password");
  By loginbutton=By.xpath("//button[@type='submit']");

public ORHM_POM2_xml(WebDriver driver2) {
	this.driver=driver2;
	// TODO Auto-generated constructor stub
}
public void enterusername(String username1)
{
	driver.findElement(uname).sendKeys(username1);
}
public void enterpassword(String password1)
{
	driver.findElement(pword).sendKeys(password1);
}
public void loginbutton()
{
	driver.findElement(loginbutton).click();
}
}
