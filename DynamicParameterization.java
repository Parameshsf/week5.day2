package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends ParameterizationSample {
	
	@Test(dataProvider = "createLeadData")
	public void createLead(String cName,String fName,String lName,String email) throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement leadsTab = driver.findElement(By.linkText("Leads"));
		leadsTab.click();

		driver.findElement(By.linkText("Create Lead")).click();

		WebElement compName = driver.findElement(By.id("createLeadForm_companyName"));
		compName.sendKeys(cName);

		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys(fName);

		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys(lName);
		
		WebElement emailID = driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		emailID.sendKeys(email);
		
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
	}
	
	@DataProvider
	public String [][] createLeadData(){
		
		String[][] clData = new String[2][4]; 
		clData[0][0] = "Cognizant";
		clData[0][1] = "Parameswaran";
		clData[0][2] = "Sudarsanam";
		clData[0][3] = "Parameshsf@gmail.com";
		
		clData[1][0] = "Tatva";
		clData[1][1] = "Sangeetha";
		clData[1][2] = "Dasappa";
		clData[1][3] = "dasappaSangeetha@gmail.com";
		return clData;
		
	}

}
