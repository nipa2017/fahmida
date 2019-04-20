package sits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdraft {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nipa\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.findElementByLinkText("Mail").click();
		driver.findElementById("login-username").sendKeys("fahmidanipa@yahoo.com");
		
	
		//driver.findElementById("login-username").sendKeys("fahmidanipa@yahoo.com");
    
		//driver.findElementById("usernamereg-firstName").click();
   
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
		//driver.findElementById("usernamereg-firstName").sendKeys("fahmida");

  
		//driver.findElementById("usernamereg-lastName").sendKeys("fahmida");












	}

}