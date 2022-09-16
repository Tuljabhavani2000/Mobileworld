package mobileworld1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUp {
	@Test
	public void register() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tuljabhavani.uppin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Tuljabhavani");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("U");
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("tuljauppin@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("gy5656");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10/31/2000");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		///driver.findElement(By.className("Female")).click();
		///driver.findElement(By.xpath("/div/)).click();
		driver.findElement(By.xpath("//input[@min='0']")).sendKeys("6545677656");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("hi");
		driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    driver.quit();
				
				
				
	}

}
