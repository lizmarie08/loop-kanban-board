package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.LogInfo.*;

public class VerificarPanelControl implements Question<Boolean> {

    public static VerificarPanelControl enLaPagina() {
        return new VerificarPanelControl();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOMEPAGE.resolveFor(actor).isVisible();
    }
}

