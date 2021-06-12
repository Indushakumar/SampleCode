package a;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 class TestAlert {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	WebElement txtclick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	txtclick.click();
	WebElement promclick = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	promclick.click();
	Thread.sleep(3000);
	Alert a=driver.switchTo().alert();
	Thread.sleep(3000);
	a.sendKeys("hi");
	Thread.sleep(3000);
	
	a.accept();
	}
 }
