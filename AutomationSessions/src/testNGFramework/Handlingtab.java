package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlingtab {
	WebDriver driver;
	@Test
	public void a_gmaillaunch() {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
	}
@Test
public void b_hndingtab() {
	WebElement creat =  driver.findElement(By.xpath("(//a[contains(text(),'Create an account')])[1]"));
	creat.click();
	ArrayList <String> tabs =  new ArrayList <String>(driver.getWindowHandles());
	for (String newtab:tabs) {
		System.out.println(newtab);
	}
	driver.switchTo().window(tabs.get(1));
	driver.findElement(By.id("firstName")).sendKeys("vijayan");
	
}

}
