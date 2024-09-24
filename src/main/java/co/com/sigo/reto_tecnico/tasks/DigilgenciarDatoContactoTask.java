package co.com.sigo.reto_tecnico.tasks;

import co.com.sigo.reto_tecnico.models.DataContacto;
import co.com.sigo.reto_tecnico.userinterfaces.FomunarioContactoPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DigilgenciarDatoContactoTask implements Task {
    private DataContacto datoContacto;

    public DigilgenciarDatoContactoTask(DataContacto datoContacto) {
        this.datoContacto = datoContacto;
    }

    public static DigilgenciarDatoContactoTask diligenciar(DataContacto dataContacto) {
        return Instrumented.instanceOf(DigilgenciarDatoContactoTask.class).withProperties(dataContacto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FomunarioContactoPage.LABEL_CONTACTO),
                Enter.theValue(datoContacto.getNombre_contacto()).into(FomunarioContactoPage.INPUT_NOMBRE_CONTACTO),
                Enter.theValue(datoContacto.getApellidos_contacto()).into(FomunarioContactoPage.INPUT_APELLIDOS_CONTACTO),
                Enter.theValue(datoContacto.getCorreo_contacto()).into(FomunarioContactoPage.INPUT_CORREO_CONTACTO),
                Enter.theValue(datoContacto.getCargo_contacto()).into(FomunarioContactoPage.INPUT_CARGO_CONTACTO),
                Enter.theValue(datoContacto.getIndicativo_contacto()).into(FomunarioContactoPage.INPUT_INDICATIVO_CONTACTO),
                Enter.theValue(datoContacto.getTelefono_contacto()).into(FomunarioContactoPage.INPUT_TELEFONO_CONTACTO),
                Click.on(FomunarioContactoPage.BTN_GUARDAR)
        );
    }
}
