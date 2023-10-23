package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.LogInPage; // Importa la clase PageObject de la página principal

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class IrAPagRegistro implements Task {

    public static IrAPagRegistro viaSignUpButton() {
        return new IrAPagRegistro();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LogInPage.SIGNUP_BTN) // Reemplaza con el selector correcto para el botón "Sign Up" en tu página principal
        );
    }
}

