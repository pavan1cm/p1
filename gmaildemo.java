package pcm1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmaildemo {
	public static void myprint(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\TR soft\\selenium\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
//		driver.findElement(By.linkText("Help")).click();
//		myprint(driver.getTitle());
//		
//		Set<String> id = driver.getWindowHandles();
//		Iterator<String> it = id.iterator();
//		String vParent = it.next();
//		String vChild = it.next();
//		
//		driver.switchTo().window(vChild);
//		myprint(driver.getTitle());
//		driver.switchTo().window(vParent);
//		myprint(driver.getTitle());
//		driver.close();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Help")));
		driver.findElement(By.linkText("Help")).click();
	}

}
