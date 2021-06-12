package org.taks8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		WebElement simple = driver.findElement(By.xpath("//table//td[@colspan='2']//img[@src='/gif/continue_new1.gif?v=1']"));
		JavascriptExecutor conclick=(JavascriptExecutor)driver;
		conclick.executeScript("arguments[0].click()",simple);
		
		Thread.sleep(3000);
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
