package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features= {"AllFeature"},
		         glue= {"StepDefination"},
		         dryRun=false,
		         tags="not @login"
		           
		           )

public class testRunnner {

	
	
	
}
