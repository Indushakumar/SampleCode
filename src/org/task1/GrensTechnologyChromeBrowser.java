package org.task1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrensTechnologyChromeBrowser {
	

		public static void main(String[] args) { 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
					driver.get("http://greenstechnologys.com/");
					driver.manage().window().maximize();
					String title = driver.getTitle();
					System.out.println(title);
					driver.close();
			
	}
		
	}


