package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CreacionTarjetasStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor");
    }

    @Dado("que el usuario está en la página del tablero Kanban")
    public void que_el_usuario_está_en_la_página_del_tablero_kanban() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("el usuario hace clic en el botón {string}")
    public void el_usuario_hace_clic_en_el_botón(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("completa el formulario de creación de tarjeta con el título {string} y la descripción {string}")
    public void completa_el_formulario_de_creación_de_tarjeta_con_el_título_y_la_descripción(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("hace clic en el botón {string}")
    public void hace_clic_en_el_botón(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debería ver una nueva tarjeta en el tablero con el título {string}")
    public void debería_ver_una_nueva_tarjeta_en_el_tablero_con_el_título(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("la tarjeta debería estar en el estado {string}")
    public void la_tarjeta_debería_estar_en_el_estado(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
