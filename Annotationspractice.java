package com.avactis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationspractice {


	WebDriver driver;  //global variable
	@BeforeSuite
	
	public void beforeSuit()
	{
		
		System.out.println("I am in Before Suit");
	}
	@AfterSuite
	public void aftersuit()
	{
		
		System.out.println("I am in After Suit");
	}
		@BeforeClass
		public void beforeclass()
		{
			
			System.out.println("I am in Before class");	
		}@AfterClass
			public void afterClass()
			{
				
				System.out.println("I am in After Class");
			}@BeforeTest
				public void beforeTest()
				{
					
					System.out.println("I am in Before test");
				}@AfterTest
					public void afterTest()
					{
						
						System.out.println("I am in After test");
					
					}@ BeforeMethod
					public void beforeMethod()
					{
						
					System.out.println("I am in Before Method");
					driver=new ChromeDriver();
					driver.get("https://www.facebook.com/");
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
					}@AfterMethod
						public void afterMethod()
						{
							driver.close();
							System.out.println("I am in After Method");
						
						}		
				@Test
				public void VerifyLogin()
				{
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ashesh.purohit2gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Tathastu");
				driver.findElement(By.xpath("//button[text()=login]")).click();
			    System.out.println("Login is failed");
}
				 @Test
public void verifytitle()
{
	String s =driver.getTitle();
	System.out.println(s);
	
}	

			
		}	
			
						
						
						

	
