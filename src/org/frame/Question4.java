package org.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	WebDriver frame = driver.switchTo().frame("login_page");
WebElement con = driver.findElement(By.xpath("//img[@alt='continue']"));
con.click();
Alert a=driver.switchTo().alert();
a.accept();
}
}
