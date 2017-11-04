package skillracks.cucmber;

import java.io.File;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Samplecucmber {
	
		   
		   ExtentReports er= new ExtentReports("D:\\Reports\\reporcuc.html");
			ExtentTest test;
			WebDriver driver=null; 
			/*@Before
			public void Methodinfo(Method m) {
					test=er.startTest(m.getName());
					
			}*/
			@Test
		   @Given("^I have open the browser$") 
		   public void openBrowser() { 
			   System.setProperty("webdriver.chrome.driver", "C:\\Users\\HariNath\\Downloads\\chromedriver_win32\\chromedriver.exe");
		      driver = new ChromeDriver(); 
		     test=er.startTest("openBrowser");
		      test.log(LogStatus.INFO, "browser is opened");
				er.addSystemInfo("Username","Harry").addSystemInfo("Env","QA").addSystemInfo("Test","Regression");
				er.loadConfig(new File("D:\\Oxygen\\cucmber\\src\\test\\java\\skillracks\\cucmber\\Config_extent.xml"));
				er.endTest(test);
				er.flush();
				er.close();
		   } 
			@Test
		   @When("^I open Facebook website$") 
		   public void goToFacebook() { 
		      driver.navigate().to("https://www.facebook.com/"); 
		      er.addSystemInfo("Username","Harry").addSystemInfo("Env","QA").addSystemInfo("Test","sanity");
		      test=er.startTest("goToFacebook");
				test.log(LogStatus.INFO, "Driver is Launched with Url +https://www.facebook.com");
				
		   } 
			@Test
		   @Then("^Login button should exits$") 
		   public void loginButton() { 
		      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
		         System.out.println("Test 1 Pass"); 
		      } else { 
		         System.out.println("Test 1 Fail"); 
		      } 
		      er.addSystemInfo("Username","Harry").addSystemInfo("Env","QA").addSystemInfo("Test","sanity");
	test.log(LogStatus.INFO, "visable");
			
			}    //driver.close(); 
			/*@AfterSuite
		   public void Endtest() {
			
			er.endTest(test);
			er.flush();
			er.close();
		}*/
}

