package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btn = driver.findElement(By.id("home-tab"));
		btn.click();
		Thread.sleep(3000);
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently focuses')]"));
		String text = txt.getText();
		System.out.println(text);
		WebElement b = driver.findElement(By.xpath("(//div[contains(@class,'col-md-3 short-desc')])[1]"));
		String text2 = b.getText();
		System.out.println(text2);
	}
}
