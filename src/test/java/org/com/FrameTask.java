package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHITRA\\eclipse\\ExcelTask\\Driver\\chromedriver.exe");
	WebDriver driver= new  ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("chitra");
	driver.findElement(By.id("pass")).sendKeys("23533");
	driver.findElement(By.name("login")).click();
	
}
}
