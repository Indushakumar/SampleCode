package org.task7;

//import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Questio11 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	WebElement move = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[9]"));
	Actions a=new Actions(driver);
	a.moveToElement(move).perform();
	TakesScreenshot tk=(TakesScreenshot)driver;
//	File src = tk.getScreenshotAs(OutputType.FILE);
//	System.out.println(src);
//	File des=new File("E:\\kids.png");
//	FileUtils.copyFile(src, des);
}

}
