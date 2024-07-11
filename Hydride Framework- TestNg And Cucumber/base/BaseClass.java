package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import runner.CucumberRunner;
import utils.ReadData;

public class BaseClass  extends AbstractTestNGCucumberTests  {
	//	public static ChromeDriver driver;
	public String filename,testName,testDescription,category,authorName;
	public ExtentReports extent;
	public ExtentTest test;


	private static final ThreadLocal<RemoteWebDriver> rDriver = new ThreadLocal<>();

	public void setdriver(String Browser) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		if (Browser.equalsIgnoreCase("Chrome")) {
			rDriver.set(new ChromeDriver(options));
		}
		else if (Browser.equalsIgnoreCase("Edge")) {
			rDriver.set(new EdgeDriver());
		}	
	}

	public RemoteWebDriver getdriver() {
		return rDriver.get();
	}

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);

	}
	@BeforeClass
	public void assignReport() throws IOException {
		test = extent.createTest(testName,testDescription);
		test.assignCategory(category);
		test.assignAuthor(authorName); 	
	}

	public int takeSnap() throws IOException {
		int ranNum = (int) (Math.random() * 99999 + 99999);
		File src = getdriver().getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/img"+ranNum+".png");
		FileUtils.copyFile(src, dest);
		return ranNum;
	}
	public void reportStep(String msg, String status) throws IOException {
		if (status.equalsIgnoreCase("Pass")) {
			test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());

		}
		else if (status.equalsIgnoreCase("Fail")) {
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././snap/img"+takeSnap()+".png").build());
			throw new RuntimeException("View Report");
		}

	}
	@AfterSuite
	public void stopReport() {
		extent.flush();

	}

	@Parameters("Browser")
	@BeforeMethod
	public void precondition(String Browser) {
		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--disable-notification");
		//		driver = new ChromeDriver(options);

		setdriver(Browser);
		getdriver().get("http://www.leaftaps.com/opentaps/control/main");
		getdriver().manage().window().maximize();
		getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	@AfterMethod
	public void postcondition() {
		getdriver().quit();

	}
	@DataProvider(name= "fetchdata")
	public String[][] sendData() throws IOException {
		return ReadData.readData(filename);

	}
}
