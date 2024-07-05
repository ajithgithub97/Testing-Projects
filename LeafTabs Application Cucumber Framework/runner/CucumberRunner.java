package runner;


import hooks.CucumberHooks;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features",glue="pages",monochrome=true,publish=true)
public class CucumberRunner extends CucumberHooks{

}
