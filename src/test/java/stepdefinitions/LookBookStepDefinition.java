package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ValidateException;
import models.CreateAmazonEntity;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.LookForTheBook;
import tasks.SearchAbook;

import java.util.List;

import static exceptions.ValidateException.LOOK_FOR_A_BOOK;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LookBookStepDefinition {

    @Before
    public void SetUpStage(){
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(theirNavigator)));
        theActorCalled("David");
    }

    @Managed
    private WebDriver theirNavigator;


    @Given("^I visit the page amazon$")
    public void davidVisitThePageAmazon() {

        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.amazon.com/"));
    }


    @When("^I looking for a book$")
    public void davidLookingForABook(List<String> data) {
        CreateAmazonEntity.setLookFor(data);
        theActorInTheSpotlight().attemptsTo(SearchAbook.withTheFollowinData());
           }

    @Then("^I see interesting books$")
    public void davidSeeInterestingBooks() {
        theActorInTheSpotlight().should(seeThat(LookForTheBook.wasSuccessful()).orComplainWith(ValidateException.class, LOOK_FOR_A_BOOK));
            }

}
