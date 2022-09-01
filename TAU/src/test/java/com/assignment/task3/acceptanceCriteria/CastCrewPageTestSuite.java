package com.assignment.task3.acceptanceCriteria;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/testCase3.feature",glue = "com.assignment")

public class CastCrewPageTestSuite {}
