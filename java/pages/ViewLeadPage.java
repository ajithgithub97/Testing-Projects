package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass{
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyleadcreation() {
		String verifypage = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (verifypage.contains("TestLeaf")) {
			System.out.println("Lead Created Successfuly");

		}else
			System.out.println("Lead is not created");
		return this;
	}
	public EditLeadPage clickedit() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLeadPage(driver);
	}
	public ViewLeadPage verifyEditcreation() {
		String verifypage = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (verifypage.contains("TCS")) {
			System.out.println("Edited Successfuly");

		}else
			System.out.println("Edit Unsuccessful");
		return this;
	}
	public MyLeadsPage clickdelete() {
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		return new MyLeadsPage(driver);

	}
}
