package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreatleadPage clickcreatlead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreatleadPage(driver);
	}



	public FindLeadsPage clickfindleads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
	public MergeLeadPage clickmergeleads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);

	}

}
