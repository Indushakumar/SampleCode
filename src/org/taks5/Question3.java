package org.taks5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/branded-deals.html");
		Thread.sleep(3000);
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions act=new Actions(driver);
		act.moveToElement(sports).perform();
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		findElement.click();
		String parentwin = driver.getWindowHandle();
        System.out.println(parentwin);
        Set<String> child = driver.getWindowHandles();
        System.out.println(child);
        int count =0;
        for(String x:child)
        {
        if(count==0)
        {
        	driver.switchTo().window(x);
        }
		WebElement print = driver.findElement(By.xpath("//div[@class='page_heading']"));
		String text = print.getText();	
		System.out.println(text);
	}
	}

}
 