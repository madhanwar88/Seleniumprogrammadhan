package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class saucedemo {
	WebDriver driver;

@Test
public void aleog() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("problem_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	WebElement log = driver.findElement(By.id("login-button"));
	log.click();
}
@Test
public void beltyoe() throws InterruptedException {
	Thread.sleep(2000);
	WebElement adder = driver.findElement(By.xpath("(//button[contains(text(),'ADD TO CART')])[1]"));
	adder.click();
}
@Test 
public void celtu() throws InterruptedException {
	Thread.sleep(2000);
	WebElement adcart = driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]"));
	adcart.click();
}
@Test
public void deletr() {
	WebElement drip = driver.findElement(By.id("shopping_cart_container"));
	drip.click();
}
@Test
public void echecker() {
	WebElement checkot = driver.findElement(By.xpath("//a[text()='CHECKOUT']"));
	checkot.click();
}
@Test
public void namede() {
	driver.findElement(By.id("first-name")).sendKeys("kalam");
	driver.findElement(By.id("last-name")).sendKeys("abdul");
	driver.findElement(By.id("postal-code")).sendKeys("600099");
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	WebElement necon = driver.findElement(By.xpath("//a[text()='CANCEL']/following::input[1]"));
	necon.click();
	driver.findElement(By.xpath("//a[text()='FINISH']")).click();
	
}
}

