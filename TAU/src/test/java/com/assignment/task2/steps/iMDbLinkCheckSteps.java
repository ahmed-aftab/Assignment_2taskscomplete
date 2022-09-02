package com.assignment.task2.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.Keys;
import static com.assignment.targets.GooglePage.GOOGLE_ICON;
import static com.assignment.targets.GooglePage.SEARCH_BAR;
import static com.assignment.targets.ResultPage.IMDB_RATING;
import static com.assignment.targets.ResultPage.IMDB_SPOT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class iMDbLinkCheckSteps {
    public static String fig;
    @Given("Ali is on {string}")
    public void aliIsOn(String url){
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(GOOGLE_ICON),isPresent()));
    }

    @When("he adds a {string} in search bar")
    public void heAddsAInSearchBar(String arg0) {
        theActorInTheSpotlight().attemptsTo(
                Enter.keyValues(arg0).into(SEARCH_BAR), Hit.the(Keys.ENTER).into(SEARCH_BAR)
        );

    }

    @Then("the IMDb link is visible on the page")
    public void theIMDbLinkIsVisibleOnThePage() {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(IMDB_SPOT),isPresent())
        );

        String rating = IMDB_RATING.resolveFor(theActorInTheSpotlight()).getText();
        fig=rating;
    }
}
