package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.RegistrationPage;

public class Registrarse implements Task {

    public static Registrarse click() {
        return new Registrarse();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistrationPage.REGISTRARSE_BTN)
        );
    }
}

