package stepdefinitions;

import enters.EntersHomePage;
import enters.EntersPassword;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import enters.EntersEmail;
import navigation.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }

    @Given("{actor} log in on kanban board")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theSearchHomePage()
        );
    }

    @When("{actor} enters his user {word}")
    public void enters_his_credentials(Actor actor, String word) {
        actor.attemptsTo(
                EntersEmail.MainPage(word)
        );
    }

    @Then("{actor} should be able to log in in his account")
    public void he_should_be_able_to_log_in_in_his_account(Actor actor) {
        actor.attemptsTo(
                EntersHomePage.Succesfully()
        );
    }

    @And("enters his pass {string}")
    public void entersHisPass(String pass) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EntersPassword.MainPage(pass)
        );
    }

    @Then("he shouldnt be able to log in app")
    public void heShouldntBeAbleToLogInApp() {
    }
}
