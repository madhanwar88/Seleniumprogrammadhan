package testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class bankwebsiteauto {
	WebDriver driver;
@Test 
public void banksitelaun() {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://dbankdemo.com/login");
	driver.manage().window().maximize();
}
@Test
public void bsigher() {
	WebElement sihere = driver.findElement(By.xpath("//a[contains(text(),' Sign Up Here')]"));
	sihere.click();
}
@Test
public void detail() {
	Select til = new Select(driver.findElement(By.id("title")));
	til.selectByVisibleText("Mr.");
	driver.findElement(By.id("firstName")).sendKeys("Mad");
	driver.findElement(By.id("lastName")).sendKeys("Kid");
	WebElement gen = driver.findElement(By.id("gender"));
	gen.click();
	driver.findElement(By.id("dob")).sendKeys("08/25/1978");
	driver.findElement(By.id("ssn")).sendKeys("168-76-1126");
	driver.findElement(By.id("emailAddress")).sendKeys("paga0012155@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Appa@12345");
	driver.findElement(By.id("confirmPassword")).sendKeys("Appa@12345");
	WebElement next = driver.findElement(By.xpath("//button[text()='Next']"));
	next.click();
}
@Test
public void efullde() {
	driver.findElement(By.id("address")).sendKeys("Rajan Nagar");
	driver.findElement(By.id("locality")).sendKeys("Kolathur");
	driver.findElement(By.id("region")).sendKeys("channel");
	driver.findElement(By.id("postalCode")).sendKeys("60059");
	
	driver.findElement(By.id("country")).sendKeys("India");
	driver.findElement(By.id("homePhone")).sendKeys("564-415-7847");
	driver.findElement(By.id("mobilePhone")).sendKeys("024-852-1478");
	driver.findElement(By.id("workPhone")).sendKeys("225-741-5264");
	WebElement agree = driver.findElement(By.id("agree-terms"));
	agree.click();
	WebElement regi = driver.findElement(By.xpath("//button[text()='Register']"));
	regi.click();
}
@Test
public void fdigital() {
	driver.findElement(By.id("password")).sendKeys("Appa@12345");
	WebElement cliin = driver.findElement(By.id("submit"));
	cliin.click();
}

@Test(enabled=false)
public void indigita() throws InterruptedException {
	WebElement cheing = driver.findElement(By.xpath("//a[text()='Checking']"));
	cheing.click();
	WebElement newchek = driver.findElement(By.xpath("//a[contains(text(),'View Checking')]"));
	newchek.click();
	Thread.sleep(5000);
	WebElement poc = driver.findElement(By.xpath("//button[text()='Continue']"));
	poc.click();
		
}
@Test
public void savubac() {
	WebElement sav = driver.findElement(By.id("Savings"));
	sav.click();
	WebElement idi = driver.findElement(By.id("Individual"));
	idi.click();
	driver.findElement(By.id("name")).sendKeys("thura");
	driver.findElement(By.id("openingBalance")).sendKeys("4800");
	WebElement pick = driver.findElement(By.xpath("//button[text()=' Submit']"));
	pick.click();
}
@Test
public void nsaving() throws InterruptedException {
	WebElement cheing = driver.findElement(By.xpath("//a[text()='Checking']"));
	cheing.click();
	WebElement siele = driver.findElement(By.xpath("//a[contains(text(),'New Checking')]"));
	siele.click();
	WebElement rasan = driver.findElement(By.id("Standard Checking"));
	rasan.click();
	WebElement incli = driver.findElement(By.id("Individual"));
	incli.click();
	driver.findElement(By.id("name")).sendKeys("Vera");
	driver.findElement(By.id("openingBalance")).sendKeys("12900");
	Thread.sleep(2000);
	WebElement savge = driver.findElement(By.xpath("//strong[contains(text(),'Initial Deposit Amount')]/following::button[1]"));
	savge.click();
}
@Test
public void savme() {
	WebElement aci = driver.findElement(By.id("savings-menu"));
	aci.click();
	WebElement newsav = driver.findElement(By.id("new-savings-menu-option"));
	newsav.click();
	WebElement radweb = driver.findElement(By.id("Savings"));
	radweb.click();
	WebElement raind = driver.findElement(By.id("Individual"));
	raind.click();
	driver.findElement(By.id("name")).sendKeys("newmada");
	driver.findElement(By.id("openingBalance")).sendKeys("10000");
	WebElement sudeo = driver.findElement(By.xpath("//strong[contains(text(),'Initial Deposit')]/following::button[1]"));
	sudeo.click();	
}
@Test
public void tranwith() throws InterruptedException {
	WebElement withd = driver.findElement(By.xpath("//a[text()='Transactions']"));
	withd.click();
	WebElement drawn = driver.findElement(By.xpath("//a[text()='Withdraw']"));
	drawn.click();
	Thread.sleep(3000);
	driver.findElement(By.name("id")).click();
	Actions dowarr = new Actions(driver);
	dowarr.sendKeys(Keys.ARROW_DOWN).build().perform();
	driver.findElement(By.id("amount")).sendKeys("4800");
	WebElement fulsub = driver.findElement(By.id("//strong[contains(text(),'Withdraw Amount')]/following::button[1]"));
	fulsub.click();
}
}