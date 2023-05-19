package com.co.certificacion.swaglab.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class InicioSesionPage {

    public static final Target NOMBRE_USUARIO = Target.the("Campo para ingresar nombre de usuario")
            .located(AppiumBy.accessibilityId("test-Username"));

    public static final Target CLAVE_USUARIO = Target.the("Campo para ingresar clave de usuario")
            .located(AppiumBy.accessibilityId("test-Password"));

    public static final Target BOTON_LOGIN = Target.the("Boton para iniciar sesion")
            .located(AppiumBy.accessibilityId("test-LOGIN"));

    public static final Target LABEL_PAGINA_INICIO = Target.the("texto products de la pagina de inicio")
            .located(By.xpath("//android.widget.TextView[@text='PRODUCTS']"));

    private InicioSesionPage() {
        throw new IllegalStateException("Utility class");
    }
}

