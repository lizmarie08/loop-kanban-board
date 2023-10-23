package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import ui.RegistrationPage;

public class CompletarFormRegistro implements Task {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;

    public CompletarFormRegistro(String nombre, String apellido, String correoElectronico, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
    }

    public static CompletarFormRegistro withDetails(String nombre,String apellido, String correoElectronico, String contrasena) {
        return new CompletarFormRegistro(nombre, apellido, correoElectronico, contrasena);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(RegistrationPage.NOMBRE_FIELD),
                Enter.theValue(apellido).into(RegistrationPage.APELLIDO_FIELD),
                Enter.theValue(correoElectronico).into(RegistrationPage.CORREO_ELECTRONICO_FIELD),
                Enter.theValue(contrasena).into(RegistrationPage.CONTRASENA_FIELD)
        );
    }
}

