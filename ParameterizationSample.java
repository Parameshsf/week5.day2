package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationSample {
	
	
	public ChromeDriver driver;
	@Parameters({"url","userName","password"})
	@BeforeMethod
	public void loginTestLeaf(String url, String userName, String pwd) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.get(url);
		// to maximize the window opened
		

		Thread.sleep(5000);
		WebElement uName = driver.findElement(By.id("username"));
		//userName.sendKeys("Demosalesmanager");
		uName.sendKeys(userName);

		WebElement passwd = driver.findElement(By.id("password"));
		passwd.sendKeys(pwd);

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement linkCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		linkCRMSFA.click();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();

	}

}
