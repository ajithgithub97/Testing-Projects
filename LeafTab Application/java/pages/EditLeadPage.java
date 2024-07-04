package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass {
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	
public EditLeadPage clearcompanyname() {
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
return this;
}
public EditLeadPage updatecompanyname(String cName) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
return this;
}
public ViewLeadPage clickupdatebutton() {
	driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
return new ViewLeadPage(driver);
}
}
