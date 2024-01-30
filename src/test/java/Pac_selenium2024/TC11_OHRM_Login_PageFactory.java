package Pac_selenium2024;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC11_OHRM_Login_PageFactory {

	
		WebDriver driver;
		  //By uname=By.name("username");
		@FindBy(name="username")
		WebElement uname;
		
		@FindBy(name="password")
		WebElement pword;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginbutton;

		//By pword=By.name("password");
		
		  //By loginbutton=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");

		
		public void enterusername(String username1)
		{
			uname.sendKeys(username1);
		}
		public void enterpassword(String password1)
		{
			pword.sendKeys(password1);
		}
		public void loginbutton()
		{
			loginbutton.click();
		}
	}

