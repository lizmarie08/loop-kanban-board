package ui;

import net.serenitybdd.screenplay.targets.Target;

public class LogInfo {

    public static final Target EMAIL =  Target.the("Email Address field")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public static final Target PASSWORD =  Target.the("Password field")
            .locatedBy("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/input[1]");

    public static final Target LOGINBTN = Target.the("Login Button")
            .locatedBy("//button[@id='loginMainBtn']");

    public static final Target HOMEPAGE = Target.the("HomePage User Name")
            .locatedBy("//div[@id='64e26a56aac2eb0e627f1ad4']");

    public static final Target HOMEPAGESECTION = Target.the("HomePage SECTION")
            .locatedBy("//body/div[@id='app']/div[@id='64e26a56aac2eb0e627f1ad4']/div[1]/div[1]/div[1]/section[1]");

    public static final Target MENSAJE_DE_ERROR = Target.the("MENSAJE DE ERROR DE EMAIL")
            .locatedBy("//*[contains(text(),\"Email isn't a valid email\")]");

    public static final Target SHOW_PASSWORDO = Target.the("BOTON SHOW PASSWORD")
            .locatedBy("//*[@id=\"showPassToggle\"]/div/label");
}
