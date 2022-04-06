package training.selenium.study;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\megha\\BrowserDrivers\\chromedriver_win32\\chromedriver.exe");
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.google.co.in/");
    //driver.getTitle();
    System.out.println(driver.getTitle());
    //driver.getCurrentUrl();
    System.out.println(driver.getCurrentUrl());
    //driver.navigate().to("https://www.google.co.in/");
    //driver.close();
    //driver.quit();
 
    
    
    
    

}
}
