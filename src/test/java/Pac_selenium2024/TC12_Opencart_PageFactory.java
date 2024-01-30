package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TC12_Opencart_PageFactory {
	WebDriver driver;
	
	//By desk =By.linkText("Desktops");
	@FindBy(linkText="Desktops")
	WebElement l2text;
	
	//By Mac1 = By.linkText("Mac (1)");
	@FindBy(linkText="Mac (1)")
	WebElement l3text;
	
	//By drop1 =By.xpath("//select[@id='input-sort']");
	@FindBy(xpath="//select[@id='input-sort']")
    WebElement id1;
	//By addcart=By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[2]/button[1]");
	
	@FindBy(xpath="//*[@id=\"product-list\"]/div/form/div/div[2]/div[2]/button[1]")
	WebElement id2;
	public void Opencart_POM(WebDriver driver2) {
		this.driver =driver2;
	}

	public void clickOnDeskstops()
	{
		WebElement ele=driver.findElement(By.linkText("Desktops"));
	    Actions op= new Actions(driver);
	    op.moveToElement(ele).perform();
	}
	
	public void clickOnMac()
{
		driver.findElement(By.linkText("Mac1")).click();
}
	
	public void handledropdown() throws InterruptedException
	{
		Select drop=new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));
		Thread.sleep(1000);
		drop.selectByIndex(1);
	}
	
	public void clickonaddcart() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.linkText("addcart")).click();
	}	
}
