package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Detailnewconfirmmessageok {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		WebElement pressed = driver.findElement(By.xpath("(//button[contains(text(),'me!')])[2]"));
		pressed.click();
		Alert window = driver.switchTo().alert();
		String pasam = window.getText();
		System.out.println(pasam);
		window.accept();
		WebElement tagged = driver.findElement(By.xpath("//button[contains(text(),'Prompt Box')]"));
		tagged.click();
		Alert monday = driver.switchTo().alert();
		String Annan = monday.getText();
		System.out.println(Annan);
		monday.sendKeys("Ruppes");
		monday.accept();
				

	}

}
