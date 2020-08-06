package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingconfirmpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement Clickme = driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[1]"));
		Clickme.click();
		Alert Confirm = driver.switchTo().alert();
		String Popuptext = Confirm.getText();
		System.out.println(Popuptext);
		Confirm.accept();
		
			
			
		

	}

}
