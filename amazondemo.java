package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazondemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("adidas shoes for men");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/span/a/div/img")).click();
		driver.findElement(By.linkText("Back to results")).click();
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		driver.quit();*/
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil watches for men");
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='Fossil']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Gen 5')]")).click();
	//	driver.findElement(By.xpath("(//*[contains(text(),'Gen 5')])[2]")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("praveenpradeep14@gmail.com");
		driver.findElement(By.id("continue")).click();
	}
}
