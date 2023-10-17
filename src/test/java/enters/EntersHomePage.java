package enters;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EntersHomePage {

    public static Performable Succesfully() {
        return Task.where("{0} Is at HomePage Succesfully",
                WaitUntil.the(LogInfo.HOMEPAGESECTION,isVisible()).forNoMoreThan(10).seconds(),
                        Ensure.that(LogInfo.HOMEPAGE).isDisplayed()
        );
    }

}
