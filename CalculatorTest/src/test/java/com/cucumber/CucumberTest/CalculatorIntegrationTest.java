package com.cucumber.CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"classpath:features/calculator.feature"}
  , plugin = {"pretty", "html:target/reports"}
  , glue = {"com.cucumber.CucumberTest.Calculator"}
)
public class CalculatorIntegrationTest {
}
