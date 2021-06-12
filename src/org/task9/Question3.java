package org.task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:///www.facebook.com/");
	WebElement btn = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	btn.click();	
	Thread.sleep(3000);
	WebElement year = driver.findElement(By.id("year"));
	Select s=new Select (year);
	List<WebElement> op = s.getOptions();
	for(WebElement i:op)
	{
	
		String attribute = i.getAttribute("value");
		System.out.println(attribute);
	}
	
	}
	
}
