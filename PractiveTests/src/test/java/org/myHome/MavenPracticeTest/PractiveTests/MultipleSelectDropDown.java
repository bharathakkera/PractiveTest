package org.myHome.MavenPracticeTest.PractiveTests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class MultipleSelectDropDown {
	WebDriver driver;

	@Test
	public void selectBrowsers() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.navigate().refresh();
		
		Thread.sleep(10000);
		WebElement myMultiSelectElement = driver.findElement(By.name("multipleselect[]"));
		
		Select select = new Select(myMultiSelectElement);

		// Here we will perform the multiselect operation in the dropdown.
		select.selectByVisibleText("Performance Testing");
		select.selectByIndex(2);
		// Now, two values will get selected in the dropdown.

		// We'll attempt to deselect one of the value.
		// We've added a wait so that you can notice the execution sequence.
		Thread.sleep(3000);
		//select.deselectByValue("Performance Testing");

		// We can also try to deselect the value by using the index.
		// But it'll work if the specified index is already selected.
		select.deselectByIndex(2);

		

		// Added a pause to make you see the difference.
		Thread.sleep(3000);

		// The below code will deselect all the values which are selected.
		select.deselectAll();
	}
}