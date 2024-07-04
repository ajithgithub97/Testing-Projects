package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	public WelcomePage(RemoteWebDriver driver) { 
		this.driver = driver;
	}

	public WelcomePage verifypage() {
		String verify = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		if (verify.contains("Welcome")) {
			System.out.println("Page Verified");
		}else 
			System.out.println("Page is not Verified");
		return this;
	}

	public HomePage clickcrmsfsclink() {
		driver.findElement(By.partialLinkText("CRM")).click();
		return new HomePage(driver);
	}

}