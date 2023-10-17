package starter.enters;

import net.serenitybdd.screenplay.targets.Target;

public class LogInfo {

    public static final Target EMAIL =  Target.the("Email Address field")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public static final Target PASSWORD =  Target.the("Password field")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]");

}
