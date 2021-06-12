package org.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement okbutton = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
WebElement buttonclick = driver.findElement(By.xpath("//button[contains(text(),'click the button']"));
Alert a=driver.switchTo().alert();
a.accept();
}
}
