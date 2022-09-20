package com.juaracoding.pageobject.demoqa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/3.Shopping.feature"},
				glue = "com.juaracoding.pageobject.demoqa",
				plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})

public class TestRunAll extends AbstractTestNGCucumberTests {
	

}
