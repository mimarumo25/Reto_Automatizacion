package co.com.sigo.reto_tecnico.tasks;

import co.com.sigo.reto_tecnico.models.DataLogin;
import co.com.sigo.reto_tecnico.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {

    private DataLogin dataLogin;

    public LoginTask(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    public static LoginTask login(DataLogin dataLogin) {
        return Instrumented.instanceOf(LoginTask.class).withProperties(dataLogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.TXT_USUARIO, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(dataLogin.getUsuario()).into(HomePage.TXT_USUARIO),
                Enter.theValue(dataLogin.getContrasena()).into(HomePage.TXT_CONTRASENA),
                Click.on(HomePage.BTN_INGRESAR)
        );
    }
}
