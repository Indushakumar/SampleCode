package org.task7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/");
	Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);

	r.keyRelease(KeyEvent.VK_DOWN);
	WebElement search = driver.findElement(By.xpath("//span[text()='Recent Articles']"));
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_DOWN);

	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);

}

}
