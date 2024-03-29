package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Stories",glue={"com.stepdefination"},
		monochrome = true,
		plugin = {"pretty"},
		tags= {"@testCaseone"}
)
public class RunnerClass {

}
