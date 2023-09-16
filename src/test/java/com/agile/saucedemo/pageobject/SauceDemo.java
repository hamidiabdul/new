package com.agile.saucedemo.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {
	
	@Test
	public void setUp() {
		
		
     WebDriver driver = new ChromeDriver();
      driver.get("https://amazon.com/");
      driver.manage().window().maximize();
      
//      WebElement registerButt = driver .findElement(By.xpath("//input[@placeholder='Username']"));
//		registerButt.sendKeys("Admin");
//		
//		WebElement gender = driver .findElement(By.id("id attribute is not available for this element"));
//		gender.sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//      
 }

}
