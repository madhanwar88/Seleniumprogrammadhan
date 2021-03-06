package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver;
@Test
public void a_zereoweb() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "H://Automation Selenium//Essentials//chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
}
@Test
public void b_assertionequals() {
	String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	Assert.assertEquals(text, "ONLINE BANKING");
	System.out.println("Assert equal Passed");
	
}
@Test
public void c_assertnotequal() {
	String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	Assert.assertNotEquals(text, "ONline banKING");
	System.out.println("Assert not equal Passed");
	
}
@Test
public void d_asserttrue() {
	Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
	System.out.println("Assert True Passed");
}
@Test
public void e_assertfalse() {
	String text = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
	Assert.assertFalse("online banking".equals(text));
	System.out.println("Assert False Passed");
	
}
@Test()
public void f_assertnotnull() {
	Object obj1 = driver.getTitle();
	Assert.assertNotNull(obj1);
	System.out.println("Assert not null Pass");
}
@Test
public void g_assertnull() {
	Object obj2 = null;
	Assert.assertNull(obj2);
	System.out.println("Assest Null Passed");
			
}
}