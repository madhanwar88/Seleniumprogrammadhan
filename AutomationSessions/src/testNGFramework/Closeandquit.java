package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Closeandquit {
	WebDriver driver;
	@Test
	public void a_gmaillaunch() {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.quit();
		//ArrayList <String> multiwi = new ArrayList <String> (driver.getWindowHandles());
		//driver.switchTo().window(multiwi.get(1));
		//driver.close();
	}

}
