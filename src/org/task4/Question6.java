package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("g");
		String id = username.getAttribute("id");
		System.out.println(id);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("asdafdsfd");
		String returnvalue = password.getAttribute("value");
		System.out.println(returnvalue);
		
}}
	
