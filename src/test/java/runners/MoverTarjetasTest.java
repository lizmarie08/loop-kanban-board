package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/mover_tarjetas.feature", // Ruta a tus archivos de características
        glue = "stepdefinitions", // Ruta al paquete con las definiciones de pasos
        plugin = {"pretty", "html:target/cucumber-reports"} // Formato de informes
        //tags = "@escenario01" // Etiqueta que coincide con el escenario que deseas ejecutar
)
public class MoverTarjetasTest {
}