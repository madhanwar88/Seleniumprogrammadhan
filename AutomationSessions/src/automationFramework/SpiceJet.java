package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement triptype=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		triptype.click();
		WebElement Family=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		Family.click();
		WebElement Senior=driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		Senior.click();
		WebElement Armed=driver.findElement(By.id("ctl00_mainContent_chk_IndArm"));
		Armed.click();
		
		

	}

}
