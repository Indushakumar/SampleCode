package org.taks8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	WebElement name = driver.findElement(By.name("//input[@type='text']"));
	name.sendKeys("126347");
	WebElement a = driver.findElement(By.xpath("//td[@width='400']"));
a.click();
Alert b=driver.switchTo().alert();
b.accept();
	
	
}
}
