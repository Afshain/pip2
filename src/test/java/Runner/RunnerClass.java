package Runner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(
        features = {"src/test/resources/Features/LoginFunction.feature"},
        monochrome = true,
        glue = {"org.example.StepDefs"},
        plugin = {"json:target/cucumber.json", "pretty"}
)

public class RunnerClass extends AbstractTestNGCucumberTests {
}
