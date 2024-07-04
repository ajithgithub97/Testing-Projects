package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {

	public FindLeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public FindLeadsPage clickphone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadsPage enterphonenumber(String pNum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNum);
		return this;
	}
	
	public FindLeadsPage enterleadid(String leadid) {
		driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid);
		return this;
	}
	
	
	public FindLeadsPage clickfindbutton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;

	}
	public ViewLeadPage clickleadlist() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
	


	public FindLeadsPage verifydelete() {
		String deleteverify = driver.findElement(By.xpath("//*[@class='x-paging-info']")).getText();
		if (deleteverify.contains("No records")) {
			System.out.println("Lead deleted Successfully");
		}else 
			System.out.println("Lead is not deleted");
		return this;
	}
	
	
	public MergeLeadPage windowhandle1(String leadid1) throws InterruptedException {
		Set<String> fromwindow1 = driver.getWindowHandles();
		List<String> listwindowa1 = new ArrayList<String>(fromwindow1);
		driver.switchTo().window(listwindowa1.get(1));
		driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(listwindowa1.get(0));
		return new MergeLeadPage(driver); 

	}
	
	public MergeLeadPage windowhandle2(String leadid2) throws InterruptedException {
		Set<String> fromwindow2 = driver.getWindowHandles();
		List<String> listwindowa2 = new ArrayList<String>(fromwindow2);
		driver.switchTo().window(listwindowa2.get(1));
		driver.findElement(By.xpath("(//label[text()='Lead ID:']/following::input)[1]")).sendKeys(leadid2);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(listwindowa2.get(0));
		return new MergeLeadPage(driver);

	}
	

}
