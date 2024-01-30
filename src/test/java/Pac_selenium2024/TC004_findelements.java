package Pac_selenium2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.opencart.com/");
      driver.findElement(By.linkText("My Account")).click();
      driver.findElement(By.linkText("Login")).click();
      List<WebElement> l1= (List<WebElement>) driver.findElements(By.xpath("//input[@class='form-control']"));
      System.out.println(l1.size());
      for(int i=0;i<l1.size();i++)
      {
    	  System.out.println(l1.get(i).getAttribute("name"));
    	  System.out.println(l1.get(i).getAttribute("id"));
      }
      }

}
