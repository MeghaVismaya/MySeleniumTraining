package training.selenium.automateObsq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ObsqZone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\megha\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		//Maximizing the chrome window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='simple-form-demo.php'])")).click();//xpath of 'a' tag without using linked text
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Message']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Message']")).sendKeys("Welcome");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#message-one")).getText());//css selector-tagname and id
		driver.findElement(By.cssSelector("input#value-a")).click();
		driver.findElement(By.cssSelector("input#value-a")).sendKeys("2");
		driver.findElement(By.xpath("(//input[@id='value-b'])")).click();
		driver.findElement(By.xpath("(//input[@id='value-b'])")).sendKeys("3");
		driver.findElement(By.cssSelector("button#button-two")).click();
		System.out.println(driver.findElement(By.cssSelector("div#message-two")).getText());

		// Checkbox form

		driver.findElement(By.linkText("Checkbox Demo")).click();//used link text
		driver.findElement(By.id("gridCheck")).click();//used id
		driver.findElement(By.cssSelector("input[value='Select All']")).click();

		// Radio button form

		driver.findElement(By.partialLinkText("Radio Buttons")).click();
		driver.findElement(By.cssSelector("input[name='inlineRadioOptions']")).click();
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='message-one']")).getText());
		driver.findElement(By.xpath("//input[contains(@id,'Radio21')]")).click();//Regular expression in xpath using contains
		driver.findElement(By.xpath("//input[contains(@id,'Radio23')]")).click();
		driver.findElement(By.id("button-two")).click();
		System.out.println(driver.findElement(By.cssSelector("div#message-two")).getText());

		// Select Input Form

		driver.findElement(By.linkText("Select Input")).click();
		//Static dropdown
		WebElement sDropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));//Assign a WebElement(a built in class) variable to a webelement(ie dropdown)
		Select sValue = new Select(sDropDown);//Select is builtinclass for static dropdown.creating an obj for the class
		sValue.selectByValue("Yellow");//calling methods of the class through object
		System.out.println(driver.findElement(By.cssSelector("div.my-2")).getText());//css selector tagname.classname
		WebElement sGroup = driver.findElement(By.xpath("//select[@multiple='multiple']"));
		Select cValue = new Select(sGroup);
		cValue.selectByVisibleText("Green");
		driver.findElement(By.cssSelector("button#button-first")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("div#message-two")).getText());

		// Form Submit page

		driver.findElement(By.linkText("Form Submit")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Megha");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Last')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Last')]")).sendKeys("Nair");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("MN");
		driver.findElement(By.cssSelector("input[id*='Custom03']")).click();// Used Regular expression or tag name in css selector
		driver.findElement(By.cssSelector("input[id*='Custom03']")).sendKeys("Calicut");
		driver.findElement(By.xpath("//div //input[@placeholder='State']")).click();// Used parent to child traversal via xpath
		driver.findElement(By.xpath("//div //input[@placeholder='State']")).sendKeys("Kerala");
		driver.findElement(By.xpath("//input[contains(@id,'Custom05')]")).click();// Used Regular expression or tag name in xpath
		driver.findElement(By.xpath("//input[contains(@id,'Custom05')]")).sendKeys("12345");
		driver.findElement(By.cssSelector("input#invalidCheck")).click();// Used tagname#id
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.my-2")).getText());// Used tagname.classname
		driver.close();

	}

}
