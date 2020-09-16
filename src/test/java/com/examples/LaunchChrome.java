package com.examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\Drivers\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
	       
        //driver.get("http://google.com");
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://r2d2-tools.capgemini.com/");
		driver.findElement(By.xpath("//*[@id='tabs']/li[2]/a")).click();
		
		/*	
        // Open URL
		driver.get("https://github.com/login");
		// locate and type user name
		WebElement username = driver.findElement(By.id("login_field"));
		username.sendKeys("amod");
		// locate and type password
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("amod");
		// locate and click on submit
		WebElement sub = driver.findElement(By.xpath("//input[@value='Sign in']"));
		sub.click();
		Thread.sleep(4000);
		// again type user name
		username.sendKeys("amod");
		*/
	}

}
