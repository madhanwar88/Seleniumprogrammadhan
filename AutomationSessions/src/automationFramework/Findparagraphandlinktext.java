package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findparagraphandlinktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
		driver.manage().window().maximize();
		String para = driver.findElement(By.xpath("//p[starts-with(text(),'The series')]")).getText();
		System.out.println(para);
		driver.findElement(By.linkText("Sachin: A Billion Dreams")).click();
		

	}

}
