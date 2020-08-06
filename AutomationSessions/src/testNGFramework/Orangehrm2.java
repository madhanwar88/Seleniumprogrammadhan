package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orangehrm2 {
	WebDriver driver;
@Test
public void a_lanch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(4000);
}
@Test
public void b_addemployee () throws InterruptedException {
	driver.findElement(By.xpath("//span[text()='PIM']")).click();
	driver.findElement(By.xpath("(//span[contains(text(),'Add Employee')])[2]")).click();
	Thread.sleep(18000);
	driver.findElement(By.id("firstName")).sendKeys("Vanna Mukhilan");
	driver.findElement(By.id("middleName")).sendKeys("Rajendran");
	driver.findElement(By.id("lastName")).sendKeys("Juice");
	Thread.sleep(8000);
	driver.findElement(By.id("location_inputfileddiv")).click();
	Thread.sleep(8000);
	ArrayList <WebElement> location = new ArrayList <WebElement> (driver.findElements(By.xpath("//div[@id='location_inputfileddiv']//ul/li")));
	for (WebElement locationlist:location) {
		String locationvalues = locationlist.getText();
		if (locationvalues.equalsIgnoreCase("     German Regional HQ")) {
		locationlist.click();
		break;
		}
	}
	Thread.sleep(6000);
	driver.findElement(By.id("systemUserSaveBtn")).click();
}
@Test
public void c_personalinfo() throws InterruptedException {
	Thread.sleep(8000);
	driver.findElement(By.xpath("//label[contains(text(),'Marital Status')]/preceding::i[1]")).click();	
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@class='select-wrapper picker__select--year'])[1]")).click();
	ArrayList <WebElement> year = new ArrayList <WebElement> (driver.findElements(By.xpath("//div[@class='select-wrapper picker__select--year'])[1]//ul/li")));
	for (WebElement yearlist:year) {
		String yearvalue = yearlist.getText();
		if(yearvalue.equalsIgnoreCase("1946")) {
			yearlist.click();
			break;	
		}
	}
	ArrayList <WebElement> monthsel = new ArrayList <WebElement> (driver.findElements(By.xpath("(//div[@class='select-wrapper picker__select--month'])[1]//ul/li")));
	for(WebElement allmonth:monthsel) {
		String almontdis = allmonth.getText();
		if(almontdis.equalsIgnoreCase("April"));
		allmonth.click();
		break;
	}
	driver.findElement(By.xpath("(//div[text()='21'])[1]")).sendKeys("21");
}
}

