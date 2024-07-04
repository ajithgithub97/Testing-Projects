package pages;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MergeLeadPage extends BaseClass {
	public MergeLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	public FindLeadsPage clickfromlead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		return new FindLeadsPage(driver);
	}

	public FindLeadsPage clickTolead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new FindLeadsPage(driver);
	}
	public MergeLeadPage clickMergebutton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}

	public ViewLeadPage alerthandle() throws InterruptedException {
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		return new ViewLeadPage(driver);
	}
}
