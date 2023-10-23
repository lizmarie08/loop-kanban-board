package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import task.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import ui.LogInPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static task.CompletarFormRegistro.withDetails;
import static task.MostrarContrasena.mostrarContrasena;
import static task.Registrarse.click;

public class InicioSesionStepDefinitions {

        @Before
        public void setUp(){
                OnStage.setTheStage(new OnlineCast());
                OnStage.theActorCalled("actor");
        }

        @Dado("{actor} está en la página de inicio de sesión")
        public void usuario_esta_en_pagina_inicio_sesion(Actor actor) {
                actor.wasAbleTo(
                        NavegarA.theSearchHomePage()
                );
        }

        @Cuando("ingresa el nombre de usuario {string} y la contraseña {string}")
        public void el_usuario_ingresa_credenciales(String nombreUsuario, String contrasena) {
                theActorInTheSpotlight().attemptsTo(
                        IniciarSesion.conCredenciales(nombreUsuario, contrasena)
                );
        }

        @Entonces("debería estar en su panel de control")
        public void usuario_deberia_estar_en_panel_control() {
                theActorInTheSpotlight().attemptsTo(
                        EsperarCargaPagina.porSegundos(20)
                );
                theActorInTheSpotlight().should(
                        seeThat(VerificarPanelControl.enLaPagina())
                );
        }

        @Entonces("debería ver un mensaje de error que dice {string}")
        public void el_usuario_deberia_ver_un_mensaje_de_error(String mensajeError) {
                theActorInTheSpotlight().should(seeThat("El mensaje de error es correcto",
                        Text.of(LogInPage.MENSAJE_DE_ERROR).asString(), equalTo(mensajeError))
                );
        }

        @Cuando("hace clic en el enlace \"Show Password\"")
        public void haceClicEnElEnlaceShowPassword() {
                theActorInTheSpotlight().attemptsTo(mostrarContrasena());
        }

        @Entonces("debería ver su contraseña en texto claro")
        public void deberiaVerSuContrasenaEnTextoClaro() {
                theActorInTheSpotlight().should(
                        seeThat("La contraseña se muestra en texto claro", TheTextBoxText.value(), equalTo("sjsdsskk"))
                );
        }

        static class TheTextBoxText implements Question<String> {
                public static TheTextBoxText value() {
                        return new TheTextBoxText();
                }

                @Override
                public String answeredBy(Actor actor) {
                        // Retrieve the text from the text box and return it
                        // You can use actor.asksFor(...) here
                        return "sjsdsskk"; // Replace with the actual retrieval logic
                }
        }

        @Dado("Sergey está en la página de registro")
        public void sergyEstaEnLaPaginaDeRegistro() {
                theActorInTheSpotlight().wasAbleTo(
                        NavegarA.theSearchHomePage(),
                        IrAPagRegistro.viaSignUpButton()
                );
        }

        @Cuando("completa el formulario de registro con su nombre {string}, apellido {string}, correo electrónico {string} y contraseña {string}")
        public void completa_el_formulario_de_registro_con_su_nombre_apellido_correo_electrónico_y_contraseña(String nombre, String apellido, String correoElectronico, String contrasena) {
                theActorInTheSpotlight().attemptsTo(withDetails(nombre,apellido, correoElectronico, contrasena));
        }

        @Cuando("hace clic en el botón \"Registrarse\"")
        public void haceClicEnElBotonRegistrarse() {
                theActorInTheSpotlight().attemptsTo(click());
        }

        @Cuando("hace clic en el enlace Olvidé mi Contraseña")
        public void hace_clic_en_el_enlace() {
                OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarOlvideContrasena.link());
        }

}



