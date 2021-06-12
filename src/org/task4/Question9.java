package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement signin = driver.findElement(By.xpath("//div[@class='accountInner']"));
		signin.click();
		WebElement register = driver.findElement(By.xpath("//span[text()='Register']"));
		register.click();
		WebElement userName = driver.findElement(By.xpath("//div//form//input[@placeholder='Mobile Number/ Email']"));
		userName.click();
	    Thread.sleep(2000);
		userName.sendKeys("123456890");
}
}