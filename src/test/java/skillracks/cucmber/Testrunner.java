package skillracks.cucmber;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class) 
@CucumberOptions(
		//features="/cucmber/src/test/java/skillracks/cucmber/cucumberJava.feature",
		format = {"pretty", "html:target/cucumberbasic"}) 


public class Testrunner {
	public void reports() {
		

	}

}
