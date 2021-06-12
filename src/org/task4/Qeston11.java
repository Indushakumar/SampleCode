package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Qeston11 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	
	login.click();

	WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	username.sendKeys("jfghdsafgd");
	WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	password.sendKeys("dghfdg");
	String x = password.getAttribute("value");
	System.out.println(x);
	String x1 = username.getAttribute("value");
	System.out.println(x1);
}
}
