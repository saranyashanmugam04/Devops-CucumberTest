package projectskeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/projectskeleton/featurefile1.feature",
					glue="projectskeleton",
					plugin="json:target/cucumberjson.json")
public class Runner {

}
