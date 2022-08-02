package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/resources/AppFeatures"},
		glue = {"stepDefinations"}
		//tags ="@Smoke"
		//tags= "not @Smoke "
		//tags="@All"
		//tags="@Smoke and @Regression"
		//tags="@Smoke or @Regression"
		
		
		
		)
public class Runner {

}
