package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	public HomePage(RemoteWebDriver driver) {
		 this. driver = driver;
		}
	
public MyLeadsPage clickleadslink() {
	driver.findElement(By.linkText("Leads")).click();
return new MyLeadsPage(driver);
}


}
