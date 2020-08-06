package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reuploaadprocess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement loader = driver.findElement(By.id("uploadfile_0"));
		loader.sendKeys("C://Users//Public//Pictures//Sample Pictures//Koala.jpg");
		WebElement triger = driver.findElement(By.id("terms"));
		triger.click();
		WebElement tooth = driver.findElement(By.id("submitbutton"));
		tooth.click();

	}

}
