package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass {
	@Given("Enter the username as {string}")
	public LoginPage enter_the_username_as(String uName) throws IOException {
		try {
			getdriver().findElement(By.id("username")).sendKeys(uName);
			reportStep("Username entered successfulluy", "Pass");
		} catch (Exception e) {
			reportStep("Username is not entered "+e, "Fail");
		}
		return this;
	}
	@Given("Enter the password as {string}")
	public LoginPage enter_the_password_as(String pWord) throws IOException {
		try {
			getdriver().findElement(By.id("password")).sendKeys(pWord);
			reportStep("Password entered successfulluy", "Pass");
		} catch (Exception e) {
			reportStep("Password is not entered"+e, "Fail");
		}
		return this;
	}
	@When("Click on the login button")
	public WelcomePage click_on_the_login_button() throws IOException {
		try {
			getdriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("Login button clicked Successfully", "Pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked"+e, "fail");
		}
		return new WelcomePage();
}
}