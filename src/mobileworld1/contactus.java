package mobileworld1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class contactus {
    @Test
     public void contact() throws InterruptedException
     {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\tuljabhavani.uppin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get(" https://mobileworld.banyanpro.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
        driver.findElement(By.linkText("Contact Us")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Tuljabhavani");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("tuljauppin@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("7853456565");
        Thread.sleep(1000);
        driver.findElement(By.name("message")).sendKeys("hello world");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(1000);
        driver.quit();
       
     }
 }