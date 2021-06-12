package org.taks8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement simpleclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	simpleclick.click();
	WebElement txtbox = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	txtbox.click();
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	
	a.sendKeys("Grenns");
	Thread.sleep(3000);
	a.accept();
	
	
}
}
