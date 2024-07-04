package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import utils.ReadData;

public class BaseClass {
	public  RemoteWebDriver driver;
	public String filename;

	@Parameters({"url","Browser"})
	@BeforeMethod
	public void precondition(String url,String Browser) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");

		if (Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver(option);
		}
		else if(Browser.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}


		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void postcondition() {
		driver.close();

	}
	@DataProvider(name="fetchdata")
	public String[][] sendData() throws IOException {
		return ReadData.readData(filename);

	}
}
