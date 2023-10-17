package enters;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class EntersPassword {

    private String password;
    public EntersPassword(String password){
        this.password = password;
    }

    public static Performable MainPage(String password) {
        return Task.where("{0} enters his credentials ",
                Enter.theValue(password).into(LogInfo.PASSWORD),
                Click.on(LogInfo.LOGINBTN)
        );
    }
}
