package com.avactis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookPractice {

	@Test

	
	public void VerifyTitle()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		String s=driver.getTitle();
		System.out.println(s);
		driver.close();
	}
		
		@Test
		
	public void VerifyLogin()
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashesh.purohit2gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tathastu");
			driver.findElement(By.xpath("//button[@id='u_0_5_Qh']")).click();
		
	}
		
		
		
		
	}
	
	
	

