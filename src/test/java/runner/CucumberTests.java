package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefs", "hooks"},
        plugin = {"pretty"},
        tags ="@sample1 or @sample2"
//        tags="@UPIFeature"
)
public class CucumberTests extends AbstractTestNGCucumberTests {

}
