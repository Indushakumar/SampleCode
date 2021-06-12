package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
System.out.println(currentUrl);
WebElement txtFirstName = d.findElement(By.xpath("//input[@type='text']"));
txtFirstName.sendKeys("greens ");
WebElement txtLastName = d.findElement(By.xpath("//input[@placeholder='Last Name']"));
txtLastName.sendKeys("tech ");
	}
	

}
