package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends BaseClass {
	@Then("Welcome page should be displayed")
	public WelcomePage welcome_page_should_be_displayed() throws IOException {
		try {
			String verify = getdriver().findElement(By.xpath("//div[@id='form']/h2")).getText();
			if (verify.contains("Welcome")) {
				System.out.println("Page Verified");
			}else 
				System.out.println("Page is not Verified");
			reportStep("Welcome page displayed successfully", "pass");
		} catch (Exception e) {
			reportStep("Welcome page is not displayed"+e, "fail");
		}
		return this;
	}
	@When("Click on crmsfa link")
	public MyHomePage click_on_crmsfa_link() throws IOException {
		try {
			getdriver().findElement(By.partialLinkText("CRM")).click();
			reportStep("crmsfa link clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("crmsfa link is not clicked"+e, "fail");
		}
		return new MyHomePage();
	}
}
