package automationFramework;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithokmessage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement okcancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		okcancel.click();
		WebElement buttondis = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]"));
		buttondis.click();
		Alert aler = driver.switchTo().alert();
		String Jagan = aler.getText();
		System.out.println(Jagan);
		aler.accept();
		
		
				
		
	}

}
