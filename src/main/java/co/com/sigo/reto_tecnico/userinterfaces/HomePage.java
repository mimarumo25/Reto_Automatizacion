package co.com.sigo.reto_tecnico.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;

public class HomePage {
    public static final Target TXT_USUARIO = Target.the("Campo de texto para ingresar el nombre de usuario")
            .located(ByShadow.cssSelector("#username-input", "#username"));

    public static final Target TXT_CONTRASENA = Target.the("Campo de texto para ingresar la contraseña")
            .located(ByShadow.cssSelector("#password-input", "#current-password"));

    public static final Target BTN_INGRESAR = Target.the("Botón para iniciar sesión")
            .locatedBy("//button[contains(text(),'Ingresar')]");

    public static final Target BTN_CREAR = Target.the("Botón en la página principal para crear nuevos clientes")
            .located(ByShadow.cssSelector("button", "siigo-header-molecule[class='data-siigo-five9 hydrated']", "siigo-button-atom[data-id='header-create-button']"));

    public static final Target LIST_CLIENTES = Target.the("Lista de clientes")
            .located(ByShadow.cssSelector("a[data-value='Clientes']", "siigo-header-molecule.data-siigo-five9"));


}
