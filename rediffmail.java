package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login1")).sendKeys("praveenpradeep14@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
	

	}

}
