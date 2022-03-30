package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Github {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));

		username.sendKeys("Ilango");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("123445");
WebElement login = driver.findElement(By.name("login"));
	login.click();
	WebElement login1 = driver.findElement(By.name("login"));
	login1.click();
	
	
	}

}
