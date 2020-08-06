package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonprimelogin {
	WebDriver driver;
@Test
public void amazologpage() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_brand1|m_lgAX6a65c_c386559716619");
	driver.manage().window().maximize();
}
@Test
public void bcliklogin() throws InterruptedException {
	Thread.sleep(5000);
	WebElement sig = driver.findElement(By.xpath("//p[contains(text(),'Join Prime to watch the latest movies,')]/following::span[1]"));
	Thread.sleep(2000);
	sig.click();
 }
@Test
public void createdet() {
	WebElement crea = driver.findElement(By.id("createAccountSubmit"));
	crea.click();
	
}
@Test
public void detfil() {
	driver.findElement(By.id("ap_customer_name")).sendKeys("rade");
	driver.findElement(By.id("ap_email")).sendKeys("rajuuie7848@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("muru147@112");
	driver.findElement(By.id("ap_password_check")).sendKeys("muru147@112");
	
}
@Test
public void fcli() {
	WebElement amazo = driver.findElement(By.id("continue"));
	amazo.click();
}
}
