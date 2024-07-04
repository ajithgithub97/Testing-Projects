package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.When;

public class MyHomePage extends CucumberHooks{
	@When("Click on the leads link")
	public void click_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
}
