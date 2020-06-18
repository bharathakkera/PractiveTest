package org.myHome.MavenPracticeTest.PractiveTests;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class AlertTest {
		
		
		@Test
		public void alertWindow() throws Exception{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
			driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
			Thread.sleep(3000);
			Alert alert = driver.switchTo().alert();
			String print = alert.getText();
			System.out.println(print);
			alert.accept();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
			Thread.sleep(3000);
			alert.dismiss();
			driver.close();
		}
	}
/*ksdkfjshkdjfhskjdhfks
 * this is after the change on 18/06/2020 at 17:45*/
	
