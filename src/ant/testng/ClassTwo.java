package ant.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTwo {

	@Test
	public void oneTest() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}