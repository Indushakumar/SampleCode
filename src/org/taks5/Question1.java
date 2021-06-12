package org.taks5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement account = driver.findElement(By.id("bank"));
		Actions act=new Actions(driver);
	act.dragAndDrop(bank, account).perform();	
	WebElement amountdrag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement amountdrop = driver.findElement(By.id("amt7"));
	act.dragAndDrop(amountdrag, amountdrop).perform();
	WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement acount2 = driver.findElement(By.id("loan"));
	act.dragAndDrop(sales, acount2).perform();
	WebElement amountdrag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement amoundrop2 = driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
	act.dragAndDrop(amountdrag2, amoundrop2).perform();
	}
}