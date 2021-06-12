package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com/login");
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
System.out.println(currentUrl);
WebElement txtSearch = d.findElement(By.id("userName"));
txtSearch.sendKeys("1234567890 ");
	}
}


