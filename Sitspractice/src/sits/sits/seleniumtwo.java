package sits;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebD

public class seleniumtwo {

	public static void main(String[] args) {
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Nipa\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		System.out.println("***************************Before OPening FACEBOOK");
		driver.get("https://www.pinterest.com");
//		driver.get("https://www.facebook.com");
		System.out.println("***************************After opened FACEBOOK");
		//driver.manage().window().maximize();
		//driver.findElementByName("Email or Phone").sendKeys("fahmidanipa@yahoo.com");
		//driver.findElementByName("firstname").sendKeys("fahmida");
		System.out.println("***************************Before Send Key");
		driver.findElementByName("Email").sendKeys("fahmida");
		System.out.println("//////////////////////////After Send Key");
		//driver.findElementByXPath("//input[@name='reg_email__']").sendKeys("12345");
		driver.close();
		

	}

}
