package co.com.sigo.reto_tecnico.userinterfaces;


import co.com.sigo.reto_tecnico.utils.ByShadowDomRoot;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioClientesPage {


    public static final Target SELECT_TIPO_PERSON = Target.the("Select para escoger el tipo de persona")
            .located(ByShadowDomRoot.onBy(
                    By.xpath("(//siigo-dropdownlist-web)[2]"),  // Host del Shadow DOM
                    "i.mdc-select__dropdown-icon"  // Selector dentro del shadow root
            ));
    public static final Target UL_SELECT_TIPO_PERSON = Target.the("Ul para escoger el tipo de persona ")
            .located(ByShadowDomRoot.onBy(
                    By.xpath("(//siigo-dropdownlist-web)[2]"), "ul"
            ));
    public static final Target SELECT_TIPO_IDENTIFICACION = Target.the("Select para escoger el tipo de identificacion")
            .located(ByShadowDomRoot.onBy(
                    By.xpath("(//siigo-dropdownlist-web)[3]"),  // Host del Shadow DOM
                    "i.mdc-select__dropdown-icon"  // Selector dentro del shadow root
            ));
    public static final Target UL_SELECT_TIPO_IDENTIFICACION = Target.the("Ul para escoger el tipo de persona ")
            .located(ByShadowDomRoot.onBy(
                    By.xpath("(//siigo-dropdownlist-web)[2]"), "ul"
            ));
    public static final Target INPUT_IDENTIFICACION = Target.the("Input para ingresar la identificacion del cliente ").
            located(ByShadowDomRoot.onBy(By.xpath("//siigo-identification-input-web[@class='hydrated']"), "input"));


    public static final Target INPUT_CODIGO_SUCURSAL = Target.the("Input para ingresar el codigo de sucursal")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[1]"), "input"));


    public static final Target INPUT_NOMBRE = Target.the("Input para ingresar el nombre del cliente ")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[2]"), "input"));

    public static final Target INPUT_APELLIDO = Target.the("Input para ingresar el apellido del cliente ")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[3]"), "input"));

    // Selector para el campo de nombre comercial
    public static final Target INPUT_NOMBRE_COMERCIAL = Target.the("Input para ingresar el nombre comercial")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[5]"), "input"));

    // Selector para el campo de ciudad
    public static final Target INPUT_CIUDAD = Target.the("Input para ingresar la ciudad del cliente")
            .located(ByShadowDomRoot.onBy(By.xpath("//siigo-autocomplete-web[@key-id='city']"), "input"));

    /*public static final Target CONTAINER_CYTIES = Target.the("contenedoer de ciudade")
            .located(ByShadowDomRoot.onBy(By.xpath("//siigo-autocomplete-web[@key-id='city']"), "#tableAutocompletecity > tbody"));*/

    // Selector para el campo de dirección
    public static final Target INPUT_DIRECCION = Target.the("Input para ingresar la dirección del cliente")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[6]"), "input"));

    // Selector para el campo de teléfono
    public static final Target INPUT_CORREO = Target.the("input para correo de facturaccion")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[9]"), "input"));

    // Selector para el campo de teléfono
    public static final Target INPUT_TELEFONO = Target.the("Input para ingresar el teléfono del cliente")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-phone-web)[1]"), "input[aria-labelledby='inputNumber0']"));


    // Selector para el campo de tipo de régimen IVA
    public static final Target SELECT_TIPO_REGIMEN_IVA = Target.the("Select para escoger el tipo de régimen IVA")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-dropdownlist-web)[4]"), "i.mdc-select__dropdown-icon"));


    public static final Target UL_SELECT_TIPO_REGIMEN_IVA = Target.the("Ul para escoger el tipo de persona ")
            .located(ByShadowDomRoot.onBy(
                    By.xpath("(//siigo-dropdownlist-web)[4]"), "ul"
            ));
    public static final Target INPUT_INDICATIVO_FACTURACION = Target.the("input indicativo telefono facturaccion")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[10]"), "input"));

    public static final Target INPUT_TELEFONO_FACTURACION = Target.the("input indicativo telefono facturaccion")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[11]"), "input"));

    public static final Target INPUT_CODIGO_POSTAL_FACTURACION = Target.the("input para codigo de facturaccion")
            .located(ByShadowDomRoot.onBy(By.xpath("(//siigo-textfield-web)[12]"), "input"));

    // Selector para el campo de responsabilidad fiscal
    public static final Target SELECT_RESPONSABILIDAD_FISCAL = Target.the("Select para escoger la responsabilidad fiscal")
            .locatedBy("//div[contains(text(),'{0}')]");

    public static final Target LOADDING = Target.the("Log de carga de la aplicación")
            .locatedBy("//p[contains(text(),'Cargando')]");


}
