package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exploresite {
	WebDriver driver;
@Test
public void explsit() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.aspiresys.com/digital-banking-finance/test-automation");
	driver.manage().window().maximize();	
}
@Test
public void fillclick() throws InterruptedException {
	Thread.sleep(3000);
	WebElement explorit = driver.findElement(By.id("banner_ad_only_image"));
	explorit.click();
}
@Test
public void gdetails() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.id("field1")).sendKeys("Rajkuam");
	driver.findElement(By.id("field2")).sendKeys("raju147@gmail.com");
	driver.findElement(By.name("company")).sendKeys("RAMUBANK");
	driver.findElement(By.id("field4")).sendKeys("054-124577-01");
	driver.findElement(By.name("singleLineText")).sendKeys("testingout");
	driver.findElement(By.id("field6")).sendKeys("glad to");
	WebElement radio = driver.findElement(By.name("gDPRConsent1"));
	radio.click();
	WebElement submt = driver.findElement(By.xpath("(//input[@name='gDPRConsent1'])/following::input[1]"));
	submt.click();
}

}
