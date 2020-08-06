package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlinkimg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Shiva");
		driver.manage().window().maximize();
		int linksel = driver.findElements(By.tagName("img")).size();
		System.out.println(linksel);
		int linkout = driver.findElements(By.tagName("a")).size();
		System.out.println(linkout);
		driver.findElement(By.id("Attributes"));
		

	}

}
