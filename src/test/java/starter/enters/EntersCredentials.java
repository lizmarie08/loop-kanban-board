package starter.enters;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.apache.http.auth.Credentials;
import org.openqa.selenium.Keys;

public class EntersCredentials {

    public static Performable MainPage() {
        return Task.where("{0} enters his credentials ",
                Enter.theValue("cbarahona@calengs.com").into(LogInfo.EMAIL),
                Enter.theValue("testenvpass").into(LogInfo.PASSWORD)
                        .thenHit(Keys.ENTER)
        );
    }
}
