package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
	WebElement firstName = driver.findElement(By.id("firstName"));
	firstName.sendKeys("g");
	WebElement lastName = driver.findElement(By.id("lastName"));
	lastName.sendKeys("g");
	WebElement userEmail = driver.findElement(By.id("userEmail"));
	userEmail.sendKeys("userEmail@gmi");
	WebElement gender = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
	gender.click();
	WebElement userNumber = driver.findElement(By.id("userNumber"));
	userNumber.sendKeys("1234456789");
	
	WebElement dateof = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
  	dateof.click();
  	WebElement calender = driver.findElement(By.xpath("//option[text()='January']"));
  	calender.click();
  	WebElement date = driver.findElement(By.xpath("//div[text()='16']"));
  	date.click();
  	Thread.sleep(2000);
  	WebElement year = driver.findElement(By.xpath("//option[text()='1996']"));
//  	Select s=new Select(year);
//  	s.selectByIndex(0);
//  	WebElement year = driver.findElement(By.xpath("//div//option[text()='1900']"));
  	year.click();
    	
	WebElement sbject = driver.findElement(By.xpath("(//div[contains(@class,'subjects-auto-complete')])[3]"));
	sbject.sendKeys("taml");
	WebElement hobbies = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
	hobbies.click();
	WebElement currentAddress = driver.findElement(By.id("currentAddress"));
	currentAddress.sendKeys("dfhjhafkah");
	WebElement submit = driver.findElement(By.xpath("//div[@class=['text-right col-md-2 col-sm-12']"));
	submit.click();
	}
	
	

}