package sits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumgoogle {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Nipa\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElementByLinkText("Gmail").click();
		driver.findElementByLinkText("Create an account").click();		
		driver.findElementByName("firstName").sendKeys("fahmida");
		driver.findElementByName("lastName").sendKeys("asrafi");
		driver.findElementByClassName("Username").sendKeys("fahmidanipa");
		driver.findElementByName("Passwd").sendKeys("12345");
		driver.findElementByName("ConfirmPasswd").sendKeys("12345");
		driver.findElementByLinkText("Next").click();
	}
	

}
