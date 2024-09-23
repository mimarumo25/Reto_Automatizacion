package co.com.sigo.reto_tecnico.questions;

import co.com.sigo.reto_tecnico.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidateLogin implements Question<Boolean> {
    public static ValidateLogin validate() {
        return new ValidateLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.BTN_CREAR, isVisible()).forNoMoreThan(60).seconds()
        );

        return HomePage.BTN_CREAR.resolveFor(actor).isDisplayed();
    }
}
