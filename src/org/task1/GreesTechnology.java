package org.task1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GreesTechnology {
	public static void main(String[] args) { 
		System.setProperty("webdriver.firefox.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver= new FirefoxDriver();
				driver.get("http://greenstechnologys.com/");
				driver.manage().window().maximize();
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
		
}
	
}