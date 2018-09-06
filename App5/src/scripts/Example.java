package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Example {
	@Test
	public void Test_01() throws AWTException, InterruptedException, IOException	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.olx.in");
		screenshot.takeScreenshot(driver, "launch");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/a/span")).click();
		screenshot.takeScreenshot(driver, "posting");
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/form/fieldset[1]/div[5]/div[2]/div[1]/ul/li[1]/div/a/span")).click();
		StringSelection selection = new StringSelection("E:\\ironman.jpg");
		screenshot.takeScreenshot(driver, "select");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();
		Windows win = new Windows();
		win.handle();
		
	}

}
