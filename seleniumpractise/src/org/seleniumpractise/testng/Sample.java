package org.seleniumpractise.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
	}
	
	@Test(priority =1,enabled =true, groups = { "sanity" })
	public void verifySeleniumDownloadPage(){
		
		driver.findElement(By.cssSelector("li[id='menu_download'] a[href='/download/']")).click();
		String actual = driver.findElement(By.xpath("//h2")).getText();	
		String expected ="Downloads";
		Assert.assertEquals(actual, expected);
		

}
	
	
	@Test(priority =2,groups = { "regression" })
	public void verifyDocumentationPage(){
		
		driver.findElement(By.cssSelector("li[id='menu_documentation'] a")).click();
		String actual = driver.findElement(By.xpath("//a[@title='Permalink to this headline']/parent::h1")).getText();
		String expected ="Selenium Documentation";
		Assert.assertEquals(actual, expected);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}