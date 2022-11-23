package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/Swaggy.feature", glue = "Swaggystepedef", plugin = {"pretty", "html:target/cucumber-report/cucumber-pretty"})
public class Swaggyrunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setup()
    {

        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Run cucumber feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberfeature)
    {
        testNGCucumberRunner.runCucumber(cucumberfeature.getCucumberFeature());
    }

    @DataProvider
    public Object[][] features()
    {

        return testNGCucumberRunner.provideFeatures();
    }


    @AfterClass(alwaysRun = true)
    public void teardown()
    {
        testNGCucumberRunner.finish();
    }
}

