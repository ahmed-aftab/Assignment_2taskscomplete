package com.assignment.task1.steps;

import com.gargoylesoftware.htmlunit.html.Keyboard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.OpenUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class openGoogleSteps {


    @When("Ali enters the  url {string}")
    public void aliIsOn(String arg0) {
        theActorInTheSpotlight().attemptsTo(new OpenUrl(arg0));
    }

    @Then("the Google Search page opens")
    public void theGoogleSearchPageOpens() {


        // Specify the base URL to the RESTful web service
        RestAssured.baseURI = "https://www.google.com/";
        // Get the RequestSpecification of the request to be sent to the server
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        // Get the status code of the request.
        //If request is successful, status code will be 200
        int statusCode = response.getStatusCode();
        // Assert that correct status code is returned.
        Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/,"Incorrect status code returned");
    }
}
