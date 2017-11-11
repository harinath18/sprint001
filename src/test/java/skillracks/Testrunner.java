package skillracks;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = false, 
		features = "src/test/java/skillracks/cucumberJava.feature",
		glue = {"Samplecucmber"}, 
		tags = {"@run"}, 
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/Report.html" }, 	
		monochrome = false
		)

public class Testrunner {
	@BeforeClass
	public static void setup() {
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		ExtentCucumberFormatter.loadConfig(new File("/cucumber/cucmber/src/test/java/skillracks/extent-config.xml"));
	}
}

