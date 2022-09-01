package com.assignment.task3.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class castCrewPageSteps {
    @Given("Ali is on \"https:search page\"")
    public void aliIsOn(String page){
//        theActorInTheSpotlight().attemptsTo(Open.url());
    }

    @When("he clicks on {string}")
    public void heClicksOn(String arg0) {
    }

    @And("switch to {string}")
    public void switchTo(String arg0) {
    }

    @Then("Name of {string}is correctly displayed")
    public void nameOfIsCorrectlyDisplayed(String arg0) {
    }

    @And("IMDb rating is equal to that on Google")
    public void imdbRatingIsEqualToThatOnGoogle() {
    }

    @And("The genre is {string} and {string}")
    public void theGenreIsAnd(String arg0, String arg1) {
    }

    @When("he clicks on {string} button")
    public void heClicksOnButton(String arg0) {
    }

    @Then("he go to {string} page")
    public void heGoToPage(String arg0) {
    }

    @Then("the name of director is {string}")
    public void theNameOfDirectorIs(String arg0) {
    }

    @And("{string} is also in the cast")
    public void isAlsoInTheCast(String arg0) {
    }

    @And("his cast name is {string}")
    public void hisCastNameIs(String arg0) {
    }

    @And("he appeared in {string} episodes")
    public void heAppearedInEpisodes(String arg0) {
    }
}
