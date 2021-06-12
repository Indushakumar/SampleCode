package org.task9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Queston8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("nirendra");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Prabhu@789");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	WebElement location = driver.findElement(By.id("location"));	
	Select s=new Select(location);
	s.selectByVisibleText("London");
	}}

