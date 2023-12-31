package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.LogInPage;

public class MostrarContrasena implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogInPage.SHOW_PASSWORDO)
        );
    }

    public static MostrarContrasena mostrarContrasena() {
        return new MostrarContrasena();
    }
}

