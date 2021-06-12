//package org.task7;
//
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
//public class Question8 {
//
//	public static void main(String[] args) throws IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.id("heading302"));
//		findElement.click();
//		TakesScreenshot tk=(TakesScreenshot)driver;
//		File src = tk.getScreenshotAs(OutputType.FILE);
//		System.out.println(src);
//		File dest=new File("E:\\greens.png");
////       FileUtils.copyFile(src, dest);
//	}    
//}
