package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
    plugin = { "pretty" },
    		features = "classpath:features/LoginPlataforma.feature",
			 dryRun = false,		 
			 monochrome=true,
            glue={"steps"} )

public class LoginPlataformaRunner {

}