package a;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandling {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	close.click();
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("iphone",Keys.ENTER);
	Thread.sleep(3000);
	WebElement product = driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power Adapter)']"));
	product.click();
	//To get parent window id
	String par = driver.getWindowHandle();
	System.out.println(par);
	//To get all windows id 
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	for(String x:all)
	{
		if(!par.equals(x))
		{
			driver.switchTo().window(x);
		}
		
	}
	


	WebElement addcart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	addcart.click();
}
}