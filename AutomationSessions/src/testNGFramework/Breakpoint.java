package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Breakpoint {
	WebDriver driver;
@Test
public void a_launchurl() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
}
@Test
public void b_signin() {
	driver.findElement(By.id("signin_button")).click();
	driver.findElement(By.id("user_login")).sendKeys("username");
	driver.findElement(By.id("user_password")).sendKeys("password");
	driver.findElement(By.name("submit")).click();
}
}
