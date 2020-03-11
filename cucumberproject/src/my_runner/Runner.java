package my_runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
		features = "C:\\Users\\murali dasari\\eclipse-workspace\\cucumberproject\\src\\features\\login.feature"
		,glue = {"step_defination"},
		format = {"pretty","html:test-output"},
		monochrome = true
		)
public class Runner {

	
}
