package org.task7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/");	
		driver.manage().window().maximize();
		
//		scrolldown
//		WebElement down = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
//	JavascriptExecutor js=(JavascriptExecutor)driver;
//	js.executeScript("arguments[0].scrollIntoView(true)", down);
//	Thread.sleep(3000);
//	String text = down.getText();
//	System.out.println(text);
//	

//	SCROLLDOWN
	
	WebElement sdown = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", sdown);
	
//	SCORLLUP
	Thread.sleep(3000);
	WebElement up = driver.findElement(By.xpath("//span[text()='Automation Tools Tutorial']"));
	js.executeScript("arguments[0].scrollIntoView(false)", up);
	
	
	}
}
