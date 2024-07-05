package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends CucumberHooks {
	@Then("Welcome page should be displayed")
	public void welcome_page_should_be_displayed() {
		String verify = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		if (verify.contains("Welcome")) {
			System.out.println("Page Verified");
		}else 
			System.out.println("Page is not Verified");
	}
	@When("Click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.partialLinkText("CRM")).click();
	}
}
