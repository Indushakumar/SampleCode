package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		WebElement txtUserName = d.findElement(By.id("email"));
txtUserName.sendKeys("Greens");
WebElement txtPass = d.findElement(By.id("pass"));
txtPass.sendKeys("12345");

d.close();
	}

} 