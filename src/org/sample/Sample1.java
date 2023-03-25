package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample1 {
public static void main(String[] args) {
	ChromeOptions option = new ChromeOptions();
    option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.facebook.com");
	WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
	user.sendKeys("Anand11mech");
	WebElement passwd = driver.findElement(By.xpath("//input[@name='pass']"));
	passwd.sendKeys("123456");
	WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
	login.click();
}
}
