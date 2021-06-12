package a;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDa1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
			System.out.println(title);
		String currentUrl = driver.getCurrentUrl();	
		System.out.println(currentUrl);
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("jesus");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("12345");
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
	}

}
