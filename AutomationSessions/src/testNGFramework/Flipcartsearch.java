package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipcartsearch {
	WebDriver driver;
@Test
public void flipkart() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
}
@Test
public void loginlayer() {
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	
}
@Test
public void searchmobiles() {
	driver.findElement(By.name("q")).sendKeys("redmi");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
}
@Test
public void theresultpage() throws InterruptedException {
	Thread.sleep(3000);
	WebElement phone = driver.findElement(By.xpath("//div[contains(text(),'Redmi Note 7 Pro')]"));
	phone.click();
}
}

