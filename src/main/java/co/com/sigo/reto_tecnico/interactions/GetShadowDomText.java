package co.com.sigo.reto_tecnico.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetShadowDomText implements Interaction {

    private final By shadowHostLocator;
    private final By shadowContentLocator;

    public GetShadowDomText(By shadowHostLocator, By shadowContentLocator) {
        this.shadowHostLocator = shadowHostLocator;
        this.shadowContentLocator = shadowContentLocator;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        WebElement shadowHost = driver.findElement(shadowHostLocator);

        SearchContext shadowRoot = shadowHost.getShadowRoot();

        WebElement shadowElement = shadowRoot.findElement(shadowContentLocator);

        shadowElement.sendKeys("Medellin");
        // System.out.println("Texto encontrado en el Shadow DOM: " + text);
    }

    public static GetShadowDomText fromShadowHost(By shadowHostLocator, By shadowContentLocator) {
        return Tasks.instrumented(GetShadowDomText.class, shadowHostLocator, shadowContentLocator);
    }
}
