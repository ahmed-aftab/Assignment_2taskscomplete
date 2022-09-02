package com.assignment.task3.steps;

import com.assignment.task2.steps.iMDbLinkCheckSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static com.assignment.targets.CastCrewPage.*;
import static com.assignment.targets.IMDbPage.*;
import static com.assignment.targets.ResultPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class castCrewPageSteps {
    WebDriver driver;
    @Given("Ali is on Search Page")
    public void aliIsOnSearchPage() {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(IMDB_SPOT),isPresent())
        );
    }

    @When("Ali opens IMDb Page")
    public void aliOpensIMDbPage() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
        WebElement link= driver.findElement(By.xpath("//div/a[contains(@href,'www.imdb.com/title')][./h3[contains(text(),'After Life')]]"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .click(link)
                .keyUp(Keys.CONTROL)
                .perform();

        String title= driver.getTitle();
        System.out.println(title);

        String parentHandle = driver.getWindowHandle(); // get the current window handle
        System.out.println(parentHandle);               //Prints the parent window handle
        String anchorURL = link.getAttribute("href"); //Assuming u are clicking on a link which opens a new browser window

        for (String winHandle : driver.getWindowHandles()) { //Gets the new window handle
            System.out.println(winHandle);
            driver.switchTo().window(winHandle);        // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
    }


    @Then("Name of {string}is correctly displayed")
    public void nameOfIsCorrectlyDisplayed(String arg0) {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(MOVIE_TITLE),containsText(arg0)));
    }

    @And("IMDb rating is equal to that on Google")
    public void imdbRatingIsEqualToThatOnGoogle() {
        String new_rating = MOVIE_RATING.resolveFor(theActorInTheSpotlight()).getText();
        new_rating=(new_rating+"/10");
        System.out.println(new_rating);
        Assert.assertEquals(iMDbLinkCheckSteps.fig,new_rating,"rating is not equal");
    }

    @And("The genre is {string} and {string}")
    public void theGenreIsAnd(String arg0, String arg1) {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(GENRE_COMEDY),containsText(arg0)));
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(GENRE_DRAMA),containsText(arg1)));
    }
    @Given("Ali is at {string}")
    public void aliIsAt(String arg0) {
    }
    @When("he clicks on {string} button")
    public void heClicksOnButton(String arg0) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CAST_CREW_LINK)
        );
    }

    @Then("he go to {string} page")
    public void heGoToPage(String arg0) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(PAGE_HEADING),containsText(arg0))
        );
    }
    @Given("Ali is on Cast and Crew page")
    public void aliIsOnCastAndCrewPage() {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(PAGE_HEADING),containsText("Full Cast & Crew"))
        );
    }
    @Then("the name of director is {string}")
    public void theNameOfDirectorIs(String arg0) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(DIRECTOR),containsText(arg0))
        );
    }

    @And("{string} is also in the cast")
    public void isAlsoInTheCast(String arg0) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(CASTE),containsText(arg0))
        );
    }

    @And("his cast name is {string}")
    public void hisCastNameIs(String arg0) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(CASTE_NAME),containsText(arg0))
        );
    }

    @And("he appeared in {string}")
    public void heAppearedIn(String arg0) {
        theActorInTheSpotlight().should(
                seeThat(WebElementQuestion.the(EPISODES),containsText(arg0))
        );
    }



}
