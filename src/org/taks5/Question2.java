package org.taks5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions act=new Actions(driver);
		act.moveToElement(prime).perform();
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.id("nav-flyout-prime"));
		click.click();
		WebElement print = driver.findElement(By.xpath("//h1[text()='Prime Video']"));
		String text = print.getText();
		System.out.println(text);
		
	}
}
