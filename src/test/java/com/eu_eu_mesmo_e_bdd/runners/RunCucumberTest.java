package com.eu_eu_mesmo_e_bdd.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.eu_eu_mesmo_e_bdd.steps",
    plugin = {"pretty", "summary"}
)
public class RunCucumberTest {
}
