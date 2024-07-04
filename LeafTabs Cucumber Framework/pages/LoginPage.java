package pages;

import org.openqa.selenium.By;

import hooks.CucumberHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends CucumberHooks {
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
	}
	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
}
}