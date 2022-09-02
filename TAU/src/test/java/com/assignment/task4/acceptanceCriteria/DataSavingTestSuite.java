package com.assignment.task4.acceptanceCriteria;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/testCase4.feature",glue = "com.assignment")

public class DataSavingTestSuite {}
