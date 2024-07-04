package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class CreatleadPage extends BaseClass {
	
	public CreatleadPage(RemoteWebDriver driver) {
		 this. driver = driver;
		}
public CreatleadPage entercompanyname(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
return this;
}
public CreatleadPage enterfirstname(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
return this;
}
public CreatleadPage enterlastname(String lNAme) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lNAme);
return this;
}
public CreatleadPage enterPnumber(String pNum) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNum);
return this;
}
public ViewLeadPage clicksubmitbutton() {
	driver.findElement(By.className("smallSubmit")).click();
return new ViewLeadPage(driver);
}
}
