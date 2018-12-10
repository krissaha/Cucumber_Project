package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:/Selenium/cucumberp/src/main/java/Features/Hooks.feature",// path of the feature file
					glue={"StepDefinations"},// path of the step defination file 
					dryRun = false, // readable console output
					monochrome = true,
					format = {"json:Folder_Name/cucumber.json","pretty"}
				 )

public class TestRunner 
{

}
