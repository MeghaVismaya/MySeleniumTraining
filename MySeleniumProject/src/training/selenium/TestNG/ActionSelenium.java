package training.selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\megha\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		// Maximizing the chrome window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'2KpZ6l')]")).click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Home')]"))).perform();// mousehover on
																									//Home,text() to
																									// identify the text
																									// in a tag
		act.moveToElement(driver.findElement(By.linkText("Home Decor"))).perform();// mousehover on Home Decor
		act.moveToElement(driver.findElement(By.linkText("Clocks"))).click().perform();// mousehover on Clock,Then clickon Clock
																						
		driver.findElement(By.xpath("//input[@name='q']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("clocks");
		Thread.sleep(1000);
		act.doubleClick(driver.findElement(By.xpath("//input[@name='q']"))).perform();// double click
		act.contextClick(driver.findElement(By.xpath("//input[@name='q']"))).perform();//right click
		Thread.sleep(1000);
		driver.close();

	}

}
