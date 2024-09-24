package co.com.sigo.reto_tecnico.tasks;

import co.com.sigo.reto_tecnico.userinterfaces.HomePage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavegarAlFormulario implements Task {
    public static NavegarAlFormulario navegar() {
        return Instrumented.instanceOf(NavegarAlFormulario.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_CREAR),
                WaitUntil.the(HomePage.LIST_CLIENTES,isVisible()).forNoMoreThan(2).seconds(),
                Click.on(HomePage.LIST_CLIENTES)
                );
    }
}
