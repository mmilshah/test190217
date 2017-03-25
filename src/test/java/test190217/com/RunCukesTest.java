package test190217.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by VRINDA on 22/02/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = "@live", plugin = {"pretty","html:target/report.html","json:target/report.json"},
dryRun = false, strict = false)
public class RunCukesTest {
}
