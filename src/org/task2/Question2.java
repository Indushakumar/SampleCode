package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.redbus.in");
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
System.out.println(currentUrl);
WebElement txtFrom = d.findElement(By.id("src"));
txtFrom.sendKeys("chennai");
WebElement txtTo = d.findElement(By.id("dest"));
txtTo.sendKeys("madurai");
d.close();
	}

}
