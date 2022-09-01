package com.assignment.task1.acceptanceCriteria;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Features/testCase1.feature", glue="com.assignment")
public class OpenGoogleTestSuite {}
