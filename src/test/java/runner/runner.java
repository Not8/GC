package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    //publish = true,
    plugin = {"html:target/cucumber-html-report"},
    //tags = "@Grid and @Smoke"
    tags = "@Imagen"
)

public class runner{
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }

}
