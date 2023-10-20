package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.LogInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IniciarSesion implements Task {

    private String nombreUsuario;
    private String contrasena;

    public IniciarSesion(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombreUsuario).into(ui.LogInfo.EMAIL),
                Enter.theValue(contrasena).into(LogInfo.PASSWORD),
                Click.on(LogInfo.LOGINBTN)
        );
    }

    public static IniciarSesion conCredenciales(String nombreUsuario, String contrasena) {
        return instrumented(IniciarSesion.class, nombreUsuario, contrasena);
    }
}

