package org.task7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorHiddenElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kathir\\eclipse-workspace\\Selenim\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		SETVALUE
		WebElement userName = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','tech')", userName);
		WebElement pasword = driver.findElement(By.id("pass"));
	    js.executeScript("arguments[0].setAttribute('value','greens')", pasword);
	    
//	    GETVALUE
	    Object object = js.executeScript("return arguments[0].getAttribute('value')", pasword);
	    String name =(String)object;
	    System.out.println(name);
	    
//GETVALUE
      Object script = js.executeScript("return arguments[1].getAttribute('value')", userName,pasword);
//TYPECAST
       String x =(String)script;
	    System.out.println(x);
        Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", userName,pasword);
	    String y =(String)executeScript;
	    System.out.println(y);
	}

}
