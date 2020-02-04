package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gimagedemo
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("testing");
	Thread.sleep(2000);
	driver.findElement(By.name("btnK")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("images")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Software Testing Professionals")).click();
	Thread.sleep(10000);
	driver.quit();
	}
}
