//package org.task7;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Question9 {
//
//	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(3000);
////		search and get s
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("iphone11");
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		Thread.sleep(3000);
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		System.out.println(src);
//		File dest=new File("E:\\iphone.png");
////		FileUtils.copyFile(src, dest);
//		
//	}
//}
