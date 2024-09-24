package co.com.sigo.reto_tecnico.stepdefinitions;

import co.com.sigo.reto_tecnico.models.DataContacto;
import co.com.sigo.reto_tecnico.models.DataLogin;
import co.com.sigo.reto_tecnico.models.DataUsuario;
import co.com.sigo.reto_tecnico.questions.ValidacionClientes;
import co.com.sigo.reto_tecnico.questions.ValidateLogin;
import co.com.sigo.reto_tecnico.tasks.DigilgenciarDatoContactoTask;
import co.com.sigo.reto_tecnico.tasks.DiligenciarFormularioClientesTask;
import co.com.sigo.reto_tecnico.tasks.LoginTask;
import co.com.sigo.reto_tecnico.tasks.NavegarAlFormulario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.sigo.reto_tecnico.utils.Constanstes.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class NuevoClienteSiigoDefinition {
    @Before
    public void onStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario inicia sesion en la aplicacion con las siguientes credenciales")
    public void elUsuarioIniciaSesionEnLaAplicacionConLasSiguientesCredenciales(DataTable data) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Open.url(URL_BASE), LoginTask.login(DataLogin.setData(data).get(0))
        );
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.validate()));
    }


    @And("el usuario accede al formulario de creacion de cliente desde el menu")
    public void elUsuarioAccedeAlFormularioDeCreacionDeClienteDesdeElMenu() {
        OnStage.theActorInTheSpotlight().attemptsTo(NavegarAlFormulario.navegar());
    }


    @When("el usuario llena el formulario de creacion de cliente con los siguientes datos:")
    public void elUsuarioLlenaElFormularioDeCreacionDeClienteConLosSiguientesDatos(DataTable usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligenciarFormularioClientesTask.diligenciar(DataUsuario.setData(usuario).get(0)));
    }

    @And("el usuario llena los datos de contacto con la siguiente informacion:")
    public void elUsuarioLlenaLosDatosDeContactoConLaSiguienteInformacion(DataTable contacto) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DigilgenciarDatoContactoTask.diligenciar(DataContacto.setData(contacto).get(0)));
    }

    @Then("el sistema deberia mostrar los datos del nuevo cliente en pantalla  {string} y {string}")
    public void elSistemaDeberiaMostrarLosDatosDelNuevoClienteEnPantallaNombresYApellidos(String nombres, String apellidos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ValidacionClientes.valida(), equalTo(nombres + " " + apellidos))
        );

    }

}
