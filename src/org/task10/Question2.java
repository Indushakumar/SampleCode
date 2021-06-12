package org.task10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphone7");
		search.click();
		Thread.sleep(3000);
WebElement product = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Printed Cover By Tootena']"));
product.click();
Thread.sleep(3000);
Set<String> all = driver.getWindowHandles();
System.out.println(all);
int count=0;
for(String x:all)
{
	if(count==1) {
		driver.switchTo().window(x);
	}
		count++;
}

	WebElement addcart = driver.findElement(By.xpath("//span[text()='add to cart']"));
	addcart.click();
	}
	
}
