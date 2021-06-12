package org.task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get(" https://infinity.icicibank.com/crop/login.jsp");
		String title = d.getTitle();
		System.out.println(title);
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		
	}

}
