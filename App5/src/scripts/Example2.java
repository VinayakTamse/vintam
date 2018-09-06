package scripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2 {
	@Test
	public void Testing_01() throws IOException	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		List <WebElement> list = driver.findElements(By.tagName("a"));
		int links = list.size();
		System.out.println(links);
		for (int i=1; i<links; i++)	{
			String linkurl = list.get(i).getAttribute("href");
			LinkTest(linkurl);
		}
	}
	
	public static void LinkTest(String linkurl) throws IOException	{
		URL url = new URL(linkurl);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.connect();
		if (conn.getResponseCode()==200)	{
			System.out.println(linkurl + " - " +conn.getResponseMessage());
		}
		if (conn.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)	{
			System.out.println(linkurl + " - " + conn.getResponseCode() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
		}
	}

}
