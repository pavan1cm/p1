package pcm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class rediff2 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Harsha");
		Thread.sleep(1000);*/
		driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys("Harsha");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Harsha789456123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input")).sendKeys("harsha123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		Thread.sleep(1000);
		//Select s = new Select(driver.findElement(By.id("country_id")));
		//Thread.sleep(2000);
		//s.selectByVisibleText("United Kingdom (+44)");
		
		//driver.findElement(By.id("9876543210")).click();
		driver.findElement(By.xpath("//*[@src='http://register.rediff.com/utilities/newforgot/img/darrow_country.png']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text()='United Kingdom (+44)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("mobno")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='radio' and @value='f']")).click();
		Thread.sleep(1000);
		
		
		
	}

}
