package enters;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class EntersEmail {

    private String user;
    public EntersEmail(String user){
        this.user = user;
    }

    public static Performable MainPage(String user) {
        return Task.where("{0} enters his credentials ",
                Enter.theValue(user).into(LogInfo.EMAIL)
        );
    }
}
