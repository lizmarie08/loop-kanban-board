package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import starter.enters.EntersCredentials;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;

public class SearchStepDefinitions {

    @Given("{actor} log in on kanban board")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theSearchHomePage()
        );
    }

    @When("{actor} enters his credentials")
    public void enters_his_credentials(Actor actor) {
        actor.attemptsTo(
                EntersCredentials.MainPage()
        );
    }

}
