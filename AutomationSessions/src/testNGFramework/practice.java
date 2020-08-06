package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class practice {
	WebDriver driver;
@Test
public void blaunchurl() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://practice.automationtesting.in/my-account/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
}
@Test
public void cdraglist() throws InterruptedException {
	driver.findElement(By.id("reg_email")).sendKeys("velan781@gmail.com");
	driver.findElement(By.id("reg_password")).sendKeys("Parthagurinasasa@1548");
	Thread.sleep(5000);
	Actions clie = new Actions(driver);
	clie.sendKeys(Keys.ENTER).build().perform();
}
}
