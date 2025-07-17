package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "pretty",
                "html:target/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        monochrome = true,
        tags = "@US001",
        dryRun = false
)

public class Runner {
}
