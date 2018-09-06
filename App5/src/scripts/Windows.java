package scripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {
	
	public void handle() throws IOException	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.monster.com/");
		screenshot.takeScreenshot(driver, "monstersite");
		Set windowid = driver.getWindowHandles();
		Object [] data = windowid.toArray();
		driver.switchTo().window((String)data[1]);
		driver.close();
		screenshot.takeScreenshot(driver, "close");
	}

}
