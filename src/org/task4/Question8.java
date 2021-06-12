package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://adactinhotelapp.com/");
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("ggg");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("kkk");
			String attribute = username.getAttribute("value");
			String attribute2 = password.getAttribute("value");
			System.out.println(attribute2);
			System.out.println(attribute);
	        WebElement login = driver.findElement(By.id("login"));
	        login.click();
	}

}
