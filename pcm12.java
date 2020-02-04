package pcm1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pcm12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","D:\\TR soft\\selenium\\Selenium Jars\\geckodriver.exe");
		WebDriver myD = new FirefoxDriver();
		myD.manage().window().maximize();
		myD.get("https://www.google.com/");
		myD.close();
	}

}
