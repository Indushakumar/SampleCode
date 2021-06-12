package org.task6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement firstclick = driver.findElement(By.id("heading20"));
		firstclick.click();
		WebElement rightclick = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		Thread.sleep(3000);
//		rightclick.click();
		Actions a= new Actions(driver);
		a.contextClick(rightclick).perform();
		rightclick.click();
//		next program
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.xpath("//a[text()='Gmail']"));
//		Actions a= new Actions(driver);
//		a.contextClick(findElement).perform();
	}

}
