package mobileworld1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Signin {
	@Test
	public void register() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuljabhavani.uppin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(100);
		driver.findElement(By.id("username")).sendKeys("tuljabhavani");
		Thread.sleep(100);
		driver.findElement(By.id("password")).sendKeys("@132dt");
		Thread.sleep(100);
		driver.findElement(By.cssSelector("a[class*='btn btn-primary btn-block']")).click();
		Thread.sleep(100);
	}

}
