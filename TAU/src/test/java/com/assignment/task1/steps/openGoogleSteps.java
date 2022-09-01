package com.assignment.task1.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
//import org.junit.Assert;
import org.testng.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class openGoogleSteps {

    @When("Ali enters the  url {string}")
    public void aliIsOn(String arg0) {
        theActorInTheSpotlight().attemptsTo(new OpenUrl(arg0));

    }

    @Then("the Google Search page opens")
    public void theGoogleSearchPageOpens() {
//        theActorInTheSpotlight().should(
//                seeThat(WebElementQuestion.the("//header/h3"),containsText("JavaScript"))
//        );
        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://www.google.com/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.get("");

        // Get the status code of the request.
        //If request is successful, status code will be 200
        int statusCode = response.getStatusCode();

        // Assert that correct status code is returned.
        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/,"Correct status code returned");
//        SoftAssertionsHook.SoftAssert.assertThat(statusCode.Equals("200"));
    }
}
