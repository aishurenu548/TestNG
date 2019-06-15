package Testcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	format={"pretty","html:report/html","json:report/json/cucumber.json"},
	//tags={"tst"},
	features="src/main/java/Feature",
	glue= {"TestFeature"})

	public class cucumber extends AbstractTestNGCucumberTests{
	}


