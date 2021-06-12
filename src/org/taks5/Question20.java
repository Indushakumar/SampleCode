package org.taks5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question20 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	WebElement product = driver.findElement(By.xpath("//div[text()='Electronics']"));
	Actions a=new Actions(driver);
	a.moveToElement(product).perform();
	Thread.sleep(3000);
	WebElement findElement = driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']"));
	a.moveToElement(findElement).perform();
	Thread.sleep(3000);
	WebElement cam = driver.findElement(By.xpath("//a[contains(text(),'Cameras']"));
	a.moveToElement(cam).perform();
	WebElement camname = driver.findElement(By.xpath("//a[text()='DSLR & Mirrorless']"));
	camname.click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles);
	for(String x:windowHandles)
	{
		if(!windowHandles.equals(x))
		{
			driver.switchTo().window(x);
		}
	}
	

	
	WebElement select = driver.findElement(By.xpath("//div[contains(text(),'FUJIFILM X-H1 Mirrorless')]"));
	select.click();
	WebElement addcart = driver.findElement(By.xpath("//button[tex()='ADD TO CART']"));
	addcart.click();
	
	
}
}
