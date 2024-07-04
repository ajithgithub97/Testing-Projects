package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import runner.CucumberRunner;

public class CucumberHooks  extends AbstractTestNGCucumberTests  {
	public static ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@AfterMethod
	public void postcondition() {
		driver.quit();

	}
}
