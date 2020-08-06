package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NakuriOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=Cj0KCQjwgJv4BRCrARIsAB17JI5yJMikSOeCxh7rbar9wsEQ6zSgooQRWpHW6lTiuSkpkMGIx_VG2YIaAoMfEALw_wcB");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		driver.findElement(By.id("fname")).sendKeys("Rama");
		driver.findElement(By.id("email")).sendKeys("mahda908@gmail.com");
		driver.findElement(By.name("password")).sendKeys("uma@123");

	}

}
