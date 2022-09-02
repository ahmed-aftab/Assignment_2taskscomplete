package com.assignment.task2.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.assignment.targets.GooglePage.GOOGLE_ICON;
import static com.assignment.targets.GooglePage.SEARCH_BAR;
import static com.assignment.targets.ResultPage.IMDB_RATING;
import static com.assignment.targets.ResultPage.IMDB_SPOT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class iMDbLinkCheckSteps {
    public static String fig;
    @Given("Ali is on {string}")
    public void aliIsOn(String url){
//        theActorInTheSpotlight().attemptsTo(new OpenUrl(url));
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
//        String rating=  theActorInTheSpotlight().asksFor(TextContent.of("#introduction"));
        String rating = IMDB_RATING.resolveFor(theActorInTheSpotlight()).getText();
        fig=rating;
        theActorInTheSpotlight().remember("rating1",rating);
        String rate=theActorInTheSpotlight().recall("rating1");

        System.out.println("The rating of movie is "+rating);
        System.out.println("The rating of movie is "+rate);
    }
}
