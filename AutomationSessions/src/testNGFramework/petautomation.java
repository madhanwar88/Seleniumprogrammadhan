package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class petautomation {
	WebDriver driver;
@Test
public void bpetlaunc() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	driver.manage().window().maximize();
}
@Test
public void csign() {
	WebElement pesig = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
	pesig.click();
	WebElement regino = driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]"));
	regino.click();
	driver.findElement(By.name("username")).sendKeys("jaibhai17");
	driver.findElement(By.name("password")).sendKeys("Raju@12777");
	driver.findElement(By.name("repeatedPassword")).sendKeys("Raju@12777");
	driver.findElement(By.name("account.firstName")).sendKeys("Vikas");
	driver.findElement(By.name("account.lastName")).sendKeys("Mikas");
	driver.findElement(By.name("account.email")).sendKeys("madhuver71124@gmail.com");
	driver.findElement(By.name("account.phone")).sendKeys("124-051-774");
	driver.findElement(By.name("account.address1")).sendKeys("Thirukumaran Street");
	driver.findElement(By.name("account.address2")).sendKeys("tamil vali");
	driver.findElement(By.name("account.city")).sendKeys("Chennai");
	driver.findElement(By.name("account.state")).sendKeys("TN");
	driver.findElement(By.name("account.zip")).sendKeys("60078");
	driver.findElement(By.name("account.country")).sendKeys("India");
	Select engop = new Select(driver.findElement(By.name("account.languagePreference")));
	engop.selectByVisibleText("english");
	Select sedog = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
	sedog.selectByVisibleText("BIRDS");
	WebElement enali = driver.findElement(By.name("account.listOption"));
	enali.click();
	WebElement bann = driver.findElement(By.name("account.bannerOption"));
	bann.click();
	WebElement sain = driver.findElement(By.name("newAccount"));
	sain.click();
	WebElement necli = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
	necli.click();
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("jaibhai17");
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys("Raju@12777");
	WebElement sigoon = driver.findElement(By.name("signon"));
	sigoon.click();
	WebElement doclc = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]/following::a[4]"));
	doclc.click();
	WebElement lado = driver.findElement(By.xpath("//td[contains(text(),'Labrador Retriever')]/preceding::a[1]"));
	lado.click();
	WebElement laror = driver.findElement(By.xpath("(//a[contains(text(),'Add to Cart')])[3]"));
	laror.click();
	WebElement proche = driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]"));
	proche.click();
	WebElement newine = driver.findElement(By.name("newOrder"));
	newine.click();
	WebElement concli = driver.findElement(By.xpath("//a[text()='Confirm']"));
	concli.click();

	
	
	
	
}

}
