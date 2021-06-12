package org.taks5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		WebElement alldept = driver.findElement(By.xpath("//a[text()='All Departments']"));
Actions a=new Actions(driver);
a.moveToElement(alldept).perform();
Thread.sleep(3000);
WebElement heatcool = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
a.moveToElement(heatcool).perform();
Thread.sleep(3000);
WebElement heater = driver.findElement(By.xpath("//a[text()='Heaters']"));
a.moveToElement(heater).perform();
WebElement selectproduct = driver.findElement(By.xpath("//a[text()='Wall Heaters']"));
selectproduct.click();
	}
}
