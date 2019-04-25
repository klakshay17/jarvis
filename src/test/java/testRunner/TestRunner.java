package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
},
        monochrome = true,
        features = {"src/test/resource/features"},
        tags = {"@first"},
        glue = {"stepDefinition"}

)
public class TestRunner {
}
