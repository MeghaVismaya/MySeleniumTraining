package training.selenium.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionUsingDragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\megha\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		// Maximizing the chrome window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='others']")).click();//move to others tab
		Thread.sleep(2000);
		
		// Source element and destination element
		WebElement source1 = driver.findElement(By.xpath("//div[@id='todrag'] //span[contains(text(),'Draggable n°1')]"));
		//WebElement source2 = driver.findElement(By.xpath("//div[@id='todrag'] //span[contains(text(),'Draggable n°2')]"));
		//WebElement source3 = driver.findElement(By.xpath("//div[@id='todrag'] //span[contains(text(),'Draggable n°3')]"));
		//WebElement source4 = driver.findElement(By.xpath("//div[@id='todrag'] //span[contains(text(),'Draggable n°4')]"));
		WebElement destination= driver.findElement(By.id("mydropzone"));
		//WebElement destination = driver.findElement(By.xpath("//div[@dropzone='move']"));
		
		//Drag and drop
		Actions act = new Actions(driver);
		act.dragAndDrop(source1, destination).perform();
		//act.clickAndHold(source1).moveToElement(destination).release(destination).perform();
		//Thread.sleep(3000);
		//driver.close();
		//act.dragAndDrop(source2, destination).perform();
		//act.dragAndDrop(source3, destination).perform();
		//act.dragAndDrop(source4, destination).perform();

	}

}
