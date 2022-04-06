package training.selenium.automateOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).click();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
		driver.findElement(By.cssSelector("input#MP_link")).click();
		driver.findElement(By.id("buyBtn1")).click();
		//driver.switchTo().frame(driver.findElement(By.id("buyNowModal")));
		//System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("megha@gmail.com");
		driver.findElement(By.id("contactNumber")).click();
		driver.findElement(By.id("contactNumber")).sendKeys("5556666");
		driver.findElement(By.id("organization")).click();
		driver.findElement(By.id("organization")).sendKeys("OrangHRM");
		driver.findElement(By.id("modal_confirm_buy")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		//Login with other css selectors
		//csselector-attribute
		driver.findElement(By.cssSelector("input[name='txtUsername']")).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).click();
		driver.findElement(By.name("txtPassword")).sendKeys("admin1234");
		driver.findElement(By.cssSelector("input.button")).click();
		System.out.println(driver.findElement(By.cssSelector("span#spanMessage")).getText());
		//Linkedtext
		driver.findElement(By.linkText("Forgot your password?")).click();
		//partial Linkedtext
		//driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(2000);
		//cssselector-tagname
		System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
		//cssselector-partial text(or regular expression) with indexing
		driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).click();
		driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).sendKeys("admin1235");
		//xpath-
		System.out.println(driver.findElement(By.xpath("//div/h1")).getText());;
		driver.findElement(By.xpath("//input[@class='cancel']")).click();
		Thread.sleep(2000);
		//xpath-indexing
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//xpath-partial text(or regular expression) 
		driver.findElement(By.xpath("//input[contains(@value,'LO')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("MP_link")).click();
		Thread.sleep(2000);
		//Navigation 
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("Refresh");
		
	}

}
