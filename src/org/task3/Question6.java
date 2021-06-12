package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement a = driver.findElement(By.id("from_station"));
		a.sendKeys("Chennai Beach (MSB)");
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.id("to_station"));
b.sendKeys("Madurai Junction (MDU)");
WebElement c = driver.findElement(By.id("trainFormButton"));
c.click();
}

}
