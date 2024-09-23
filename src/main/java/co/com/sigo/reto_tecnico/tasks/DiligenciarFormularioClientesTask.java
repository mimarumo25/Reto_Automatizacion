package co.com.sigo.reto_tecnico.tasks;

import co.com.sigo.reto_tecnico.interactions.GetShadowDomText;
import co.com.sigo.reto_tecnico.interactions.SelectFromList;
import co.com.sigo.reto_tecnico.models.DataUsuario;
import co.com.sigo.reto_tecnico.userinterfaces.FormularioClientesPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DiligenciarFormularioClientesTask implements Task {
    private DataUsuario dataUsuario;

    public DiligenciarFormularioClientesTask(DataUsuario dataUsuario) {
        this.dataUsuario = dataUsuario;
    }

    public static DiligenciarFormularioClientesTask diligenciar(DataUsuario dataUsuario) {
        return Instrumented.instanceOf(DiligenciarFormularioClientesTask.class).withProperties(dataUsuario);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FormularioClientesPage.SELECT_TIPO_PERSON, isVisible()).forNoMoreThan(60).seconds(),
                JavaScriptClick.on(FormularioClientesPage.SELECT_TIPO_PERSON),
                SelectFromList.on(FormularioClientesPage.UL_SELECT_TIPO_PERSON, dataUsuario.getTipo(), "span"),
                JavaScriptClick.on(FormularioClientesPage.SELECT_TIPO_IDENTIFICACION),
                SelectFromList.on(FormularioClientesPage.UL_SELECT_TIPO_IDENTIFICACION, dataUsuario.getTipo_identificacion(), "span"),
                Enter.theValue(dataUsuario.getIdentificacion()).into(FormularioClientesPage.INPUT_IDENTIFICACION),
                Enter.theValue(dataUsuario.getCodigo_sucursal()).into(FormularioClientesPage.INPUT_CODIGO_SUCURSAL),
                Enter.theValue(dataUsuario.getNombres()).into(FormularioClientesPage.INPUT_NOMBRE),
                Enter.theValue(dataUsuario.getApellidos()).into(FormularioClientesPage.INPUT_APELLIDO),
                Enter.theValue(dataUsuario.getNombre_comercial()).into(FormularioClientesPage.INPUT_NOMBRE_COMERCIAL),
                //GetShadowDomText.fromShadowHost(By.cssSelector("siigo-autocomplete-web[key-id='city']"), By.cssSelector("input")),
                // WaitUntil.the(FormularioClientesPage.INPUT_CIUDAD, WebElementStateMatchers.isVisible())
                //         .forNoMoreThan(10).seconds(),
                // Enter.theValue(dataUsuario.getCiudad()).into(FormularioClientesPage.INPUT_CIUDAD),
                //SelectFromList.on(FormularioClientesPage.CONTAINER_CYTIES, dataUsuario.getCiudad(),"td"),
                Enter.theValue(dataUsuario.getDireccion()).into(FormularioClientesPage.INPUT_DIRECCION),
                Enter.theValue(dataUsuario.getCorreo_contacto()).into(FormularioClientesPage.INPUT_CORREO),
                Enter.theValue(dataUsuario.getTelefono()).into(FormularioClientesPage.INPUT_TELEFONO),
                JavaScriptClick.on(FormularioClientesPage.SELECT_TIPO_REGIMEN_IVA),
                SelectFromList.on(FormularioClientesPage.UL_SELECT_TIPO_REGIMEN_IVA, dataUsuario.getTipo_regimen_IVA(), "span"),
                Enter.theValue(dataUsuario.getIndicativo_factura()).into(FormularioClientesPage.INPUT_INDICATIVO_FACTURACION),
                Enter.theValue(dataUsuario.getTelefono_factura()).into(FormularioClientesPage.INPUT_TELEFONO_FACTURACION),
                Enter.theValue(dataUsuario.getCodgo_postal_factura()).into(FormularioClientesPage.INPUT_CODIGO_POSTAL_FACTURACION),
                Click.on(FormularioClientesPage.SELECT_RESPONSABILIDAD_FISCAL.of(dataUsuario.getResponsabilidad_fiscal()))

        );

    }

}
