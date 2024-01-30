package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
(
		features="Feature",
		glue={"pac_4"},
		//dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports"}
)
public class test_Run_1 {

}
