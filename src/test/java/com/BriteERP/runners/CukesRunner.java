package com.BriteERP.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target/cucumber.json"
        },
        features = "src/test/resources/Activities",
        glue = "com/BriteERP/step_definitions"
        , dryRun = false


)
public class CukesRunner {

}
