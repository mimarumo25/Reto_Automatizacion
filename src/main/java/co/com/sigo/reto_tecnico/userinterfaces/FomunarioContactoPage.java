package co.com.sigo.reto_tecnico.userinterfaces;



import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;


public class FomunarioContactoPage {

    public static final Target INPUT_NOMBRE_CONTACTO = Target.the("Campo para ingresar el nombre de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='FirstName']"));

    public static final Target LABEL_CONTACTO = Target.the("Etiqueta que indica la sección de contactos")
            .locatedBy("//h3[contains(text(),'Contactos')]");

    public static final Target INPUT_APELLIDOS_CONTACTO = Target.the("Campo para ingresar el apellido de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='LastName']"));

    public static final Target INPUT_CORREO_CONTACTO = Target.the("Campo para ingresar el correo electrónico de contacto")
            .located(ByShadow.cssSelector("input", "siigo-emailinput-web[name='Email']"));

    public static final Target INPUT_CARGO_CONTACTO = Target.the("Campo para ingresar el cargo del contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Charge']"));

    public static final Target INPUT_INDICATIVO_CONTACTO = Target.the("Campo para ingresar el indicativo del contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Indicative']"));

    public static final Target INPUT_TELEFONO_CONTACTO = Target.the("Campo para ingresar el número de teléfono de contacto")
            .located(ByShadow.cssSelector("input", "siigo-textfield-web[name='Number']"));

    public static final Target BTN_GUARDAR = Target.the("Botón para guardar el formulario de contacto")
            .locatedBy("//button[contains(text(),'Guardar')]");

    public static final Target LBL_NOMBRE_CLIENTE_CREADO = Target.the("Etiqueta para validar el nombre del cliente creado")
            .locatedBy("//p[@class='text-rigth-header head-size breakingLonWords']");

}
