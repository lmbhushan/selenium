package Pac_selenium2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_6_demoRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver();
       WebDriver driver=new ChromeDriver();
       driver.get("https://demo.opencart.com/");
       System.out.println(driver.getTitle());
       driver.findElement(By.linkText("My Account")).click();
       Thread.sleep(2000);
       driver.findElement(By.linkText("Register")).click();
       driver.findElement(By.name("firstname")).sendKeys("Rahul");
       driver.findElement(By.name("lastname")).sendKeys("Singh");
       Thread.sleep(3000);
       driver.findElement(By.name("email")).sendKeys("rahul@gmail.com");
       driver.findElement(By.name("password")).sendKeys("rahul123");
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,350)", "");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='input-newsletter-yes']")).click();
       driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
       Thread.sleep(1000);
       driver.quit();
       System.out.println("Congratulations !! You have Registered Succcessfully");

       
       
	}

}
