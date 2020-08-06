package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmmessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement messagety = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
		messagety.click();
		WebElement cooart = driver.findElement(By.xpath("//button[contains(text(),'demonstrate the ')]"));
		cooart.click();
		Alert aler = driver.switchTo().alert();
		String genius = aler.getText();
		System.out.println(genius);
		aler.sendKeys("Asuran");
		aler.accept();
	}

}
