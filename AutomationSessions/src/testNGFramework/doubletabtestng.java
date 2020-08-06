package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubletabtestng {
	WebDriver driver;
@Test
public void autinp() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
}
@Test
public void biclik() {
	WebElement inter = driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]"));
	inter.click();
	}
@Test
public void cdubleta() throws InterruptedException {
	WebElement duob = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
	Thread.sleep(2000);
	duob.click();
}
@Test(enabled=false)
public void dele() {
	WebElement duob = driver.findElement(By.xpath("//button[text()='Delete']"));
	duob.click();
}
}
