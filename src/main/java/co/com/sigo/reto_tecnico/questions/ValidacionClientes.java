package co.com.sigo.reto_tecnico.questions;

import co.com.sigo.reto_tecnico.userinterfaces.FomunarioContactoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionClientes implements Question<String> {


    public static ValidacionClientes valida() {
        return  new  ValidacionClientes();
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(FomunarioContactoPage.LBL_NOMBRE_CLIENTE_CREADO, isVisible()).forNoMoreThan(60).seconds()
                );
        return FomunarioContactoPage.LBL_NOMBRE_CLIENTE_CREADO.resolveFor(actor).getText();
    }
}
