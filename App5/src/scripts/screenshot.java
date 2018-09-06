package scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	
	public static void takeScreenshot(WebDriver driver, String Screenshot) throws IOException	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("E:\\"+Screenshot+".png");
		FileUtils.copyFile(srcFile, destFile);
	}

}
