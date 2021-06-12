package org.task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	
		
		
		WebElement country = driver.findElement(By.name("country"));
	Select s=new Select(country);
	List<WebElement> opt = s.getOptions();
	for(WebElement x:opt)
	{
	String attribute = x.getAttribute("value");
	System.out.println(attribute);
	}
	}
	
	

}
