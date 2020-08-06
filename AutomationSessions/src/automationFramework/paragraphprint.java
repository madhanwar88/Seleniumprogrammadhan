package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paragraphprint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
		driver.manage().window().maximize();
		WebElement parin = driver.findElement(By.xpath("//p[contains(text(),'Tendulkar further enhanced his reputation as a future great during the 1991–92 tour of Australia held before the ')]"));
		System.out.println(parin);
		

	}

}
