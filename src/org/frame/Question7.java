package org.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		To find count of frame
		List<WebElement> framecount = driver.findElements(By.tagName("frameset"));
		System.out.println(framecount.size());
//		switch frame
		
		driver.switchTo().frame("login_page");
		WebElement userid = driver.findElement(By.name("fldLoginUserId"));
		userid.sendKeys("afdaf");
		WebElement click = driver.findElement(By.xpath("//img[@alt='continue']"));
		click.click();
		WebElement password = driver.findElement(By.name("fldPassword"));
		password.sendKeys("asg");
	}
}
