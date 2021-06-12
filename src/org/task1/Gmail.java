package org.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://gmail.com/");
		d.manage().window().maximize();
		String title = d.getTitle();
		System.out.println("title");
	
	}
	

}
