package org.task9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
	
		
		
		WebElement country = driver.findElement(By.name("country"));
	Select s=new Select(country);
	//To get value
//	s.selectByIndex(2);
	//s.selectByValue("ANTARCTICA");
	//s.selectByVisibleText("ARMENIA");
	//To get all options
//	List<WebElement> all = s.getAllSelectedOptions();
	//for(int i=0;i<all.size();i++)
	//{
		//WebElement element = all.get(i);
		//String text = element.getText();
	//System.out.println("all selected options"+text);
	//To get options
	List<WebElement> all = s.getOptions();
	for(int i=0;i<all.size();i++)
	{
		WebElement element = all.get(i);
		String text = element.getText();
		System.out.println(text);
	
	//to get first selected option
	//WebElement firstSelectedOption = s.getFirstSelectedOption();
		
	//System.out.println("firstSelectedOption"+text);
	
	
	
	
	
	}
	
	}

}
