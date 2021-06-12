package org.task7;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");	
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.id("heading2011"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
//		SCREENSHOT
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
//		File destination=new File("E:\\selenium.png");
//		FileUtils.copyFile(screenshotAs,destination);
		
//		SCROLLUP
		Thread.sleep(3000);
		WebElement up = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		
	}

}
