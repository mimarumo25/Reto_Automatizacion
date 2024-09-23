package co.com.sigo.reto_tecnico.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/siigo.feature",
        tags = "@CasoExitoso",
        glue = "co/com/sigo/reto_tecnico/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE )
public class RunnerSiigo {
}
