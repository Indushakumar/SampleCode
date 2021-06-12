package org.task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		Thread.sleep(3000);
WebElement findElement = driver.findElement(By.id("state"));		
findElement.click();
		WebElement stateCity = driver.findElement(By.xpath("//div[text()='Select State']"));
		Select s=new Select(stateCity);
		List<WebElement> options = s.getOptions();
		for (WebElement s1 : options) {
			
			String attribute = s1.getAttribute("value");
			System.out.println(attribute);
			
					}
//		for(int i=0;i<options.size();i++)
		{
		
//			WebElement element = options.get(i);
//			String text2 = options.get(i).getText();
//			String text = element.getText();	
//			System.out.println(text2);
		}
	}

}
//WebElement year = driver.findElement(By.id("year"));
//Select s=new Select (year);
//List<WebElement> op = s.getOptions();
//for(WebElement i:op)
//{
//
//	String attribute = i.getAttribute("value");
//	System.out.println(attribute);
//}