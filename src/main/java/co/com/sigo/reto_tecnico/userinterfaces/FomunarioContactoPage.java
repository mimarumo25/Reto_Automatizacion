package co.com.sigo.reto_tecnico.userinterfaces;


import co.com.sigo.reto_tecnico.utils.ByShadowDomRoot;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;

public class FomunarioContactoPage {

    public static final Target INPUT_NOMBRE_CONTACTO = Target.the("input para el nombre de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='FirstName']"));

    public static final Target LABEL_CONTACTO = Target.the("label para datos de contactos")
            .locatedBy("//h3[contains(text(),'Contactos')]");


    public static final Target INPUT_APELLIDOS_CONTACTO = Target.the("Input para ingresar el apellido de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='LastName']"));

    public static final Target INPUT_CORREO_CONTACTO = Target.the("Input para ingresar el correo de contacto")
            .located(ByShadow.cssSelector("input", "siigo-emailinput-web[name='Email']"));

    public static final Target INPUT_CARGO_CONTACTO = Target.the("Input para ingresar el correo de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Charge']"));

    public static final Target INPUT_INDICATIVO_CONTACTO = Target.the("Input para ingresar el correo de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Indicative']"));

    public static final Target INPUT_TELEFONO_CONTACTO = Target.the("Input para ingresar el correo de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Number']"));

    public static final Target BTN_GUARDAR = Target.the("botne para guardar el formulario de clientes ")
            .locatedBy("//button[contains(text(),'Guardar')]");

    public static final Target LBL_NOMBRE_CLIENTE_CREADO = Target.the("Label para vlaidar el nobre del cliente creado")
            .locatedBy("//p[@class='text-rigth-header head-size breakingLonWords']");

//div[contains(text(),'{0}')]
}
