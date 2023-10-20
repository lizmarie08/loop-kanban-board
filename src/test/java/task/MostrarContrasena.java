package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.LogInfo;

public class MostrarContrasena implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogInfo.SHOW_PASSWORDO)
        );
    }

    public static MostrarContrasena mostrarContrasena() {
        return new MostrarContrasena();
    }
}

